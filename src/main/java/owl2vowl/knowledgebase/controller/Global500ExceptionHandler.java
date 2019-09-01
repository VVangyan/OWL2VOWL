package owl2vowl.knowledgebase.controller;

import javax.servlet.http.HttpServletRequest;
 
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
 * 截取500 错误信息 
 * @author yan
 *
 */
@ControllerAdvice
public class Global500ExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, 
			Exception e) {
		ModelAndView mov=new ModelAndView("Err500");
		System.out.println("==========================");
		e.printStackTrace();
		System.out.println("==========================");
		mov.addObject("errMsg", e.toString());
		return mov;
	}
}