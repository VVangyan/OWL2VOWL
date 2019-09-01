package owl2vowl.knowledgebase.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import owl2vowl.knowledgebase.entity.KwFileLog;

/**
 * @author:yan
 * @date :2017年12月21日
 * @desc : 文件上传
 */
public class FileUpload {

    public static R uploadFile(HttpServletRequest request) throws IllegalStateException, IOException {
        String  path=null;
        Map fileInfo=null;
        long startTime = System.currentTimeMillis();

        // 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());

        // 检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {

            // 将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

            // 获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();
            String osName = System.getProperty("os.name");
            while (iter.hasNext()) {
                // 一次遍历所有文件
                MultipartFile  multiFile = multiRequest.getFile(iter.next().toString());

                if (multiFile != null) {
                	
                	if(Pattern.matches("Linux.*", osName)) {
                		path = FilePathUtil.LINUX_FILE_PATH + DateFactoryUtil.getStrYMD() + File.separator +DateFactoryUtil.getStrYMDHHMMSS()+"_" +multiFile.getOriginalFilename();
                	}else {
                		path = FilePathUtil.FILE_PATH + DateFactoryUtil.getStrYMD() + File.separator +DateFactoryUtil.getStrYMDHHMMSS()+"_" +multiFile.getOriginalFilename();
                	}

                    File file = new File(path);

                    // 如果路径不存在,则创建
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    //创建文件
                    file.createNewFile();

                    // 上传
                    multiFile.transferTo(file);

                    fileInfo= getFileInfo(request,file, path);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return R.ok().put("fileInfo", fileInfo);
    }

    /**
     * 获取上传文件信息
     *
     * @param file
     * @param path
     * @return fileInfo
     */
    private static Map getFileInfo(HttpServletRequest request,File file, String path) {
        Map fileInfo = new HashMap();
        String fileName = file.getName();
        fileInfo.put("fileName", file.getName());
        fileInfo.put("filedesc", request.getParameter("filedesc"));
        fileInfo.put("filesSize", FileSizeUtil.getFileOrFilesSize(path, 2));
        fileInfo.put("type", fileName.substring(fileName.lastIndexOf(".") + 1));
        fileInfo.put("path", path);
        return fileInfo;
    }
}