package owl2vowl.knowledgebase.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import owl2vowl.knowledgebase.entity.KwDocumentPageview;
import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.service.KwDocumentPageviewService;


/**
 * 实现智能搜索的日志切面
 */
@Aspect
@Component
@Order(-5)
public class KwDocumentPageviewAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KwDocumentPageviewService KwDocumentPageviewService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 定义切入点（拦截包下面的类）
     */
    @Pointcut("execution(public * owl2vowl.knowledgebase.controller..OfficeToPdfController.officeToPdf(..))")  //拦截指定类下面的指定方法

    public void webLog() {}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws UnsupportedEncodingException {
        // 接收到请求，记录请求内容
        logger.info("接收到请求，记录请求内容");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        User user = GetSession.getUserSession();  //获取用户信息
        request.setCharacterEncoding("UTF-8");
        logger.info("user.getUserName()user.getUserName()user.getUserName()user.getUserName() : " + user.getUserName());  //请求地址
        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());  //请求地址
        logger.info("HTTP_METHOD : " + request.getMethod());   //请求方式 GET&&POST
        logger.info("IP : " + request.getRemoteAddr());  //IP地址
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());  //包名+方法名
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));  //参数
        //获取所有参数方法一：
        Enumeration<String> enu = request.getParameterNames();
        String args[] = new String[2];
        int i = 0;

        while (enu.hasMoreElements()) {
            String paraName = (String) enu.nextElement();
            args[i] =  URLDecoder.decode(request.getParameter(paraName),"utf-8");
            i++;
        }
        //数据插入数据库
        KwDocumentPageview record = new KwDocumentPageview();
        args[0] = args[0].substring(args[0].lastIndexOf("\\") + 1);
        record.setDocumentName(args[0]); //文档名称
        record.setDocumentId(Integer.parseInt(args[1]));    //文档编号
        Date pageviewTime = StringTransformationDate();
        record.setPageviewTime(pageviewTime);   //浏览时间
        record.setPageviewIp(user.getUserName()); //浏览者用户
        record.setDepartmentName(user.getDepartmentName());  //浏览者部门
        KwDocumentPageviewService.insert(record);
    }

    @AfterReturning("webLog()")
    public void doAfterReturning(JoinPoint joinPoint) {
        // 处理完请求，返回内容
        logger.info("处理完请求，返回内容");
    }

    //获取当前时间并且转换成Date类型
    public Date StringTransformationDate(){
        //我要获取当前的日期
        Date date = new Date();
        try {
            //获取String类型的时间
            String createdate = sdf.format(date);
            date = sdf.parse(createdate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

}