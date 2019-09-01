package owl2vowl.knowledgebase.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import owl2vowl.knowledgebase.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 获取session中对象的方法封装
 */
public class GetSession {

    //获取用户session对象
    public static User getUserSession(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");  //获取当前登录对象
        if(user!=null&&user.getId()!=null){
            return user;
        }else{
            return user;
        }

    }



}
