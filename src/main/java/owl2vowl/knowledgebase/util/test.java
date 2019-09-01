package owl2vowl.knowledgebase.util;

import java.util.UUID;

public class test {
    public static void main(String[] args) {
//        double filesSize = FileSizeUtil.getFileOrFilesSize("C:\\Users\\yan\\Desktop\\徐欢\\airflow.pptx", 2);
        for(int i=0;i<20;i++){
            System.out.println("生成不重复的注册码:"+UUID.randomUUID().toString().toUpperCase());
        }
    }
}
