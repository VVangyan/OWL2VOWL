package owl2vowl.knowledgebase.rgcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import owl2vowl.knowledgebase.service.KwDocumentPageviewService;

import java.util.UUID;

/**
 * Created by jiazailie on 2018/8/6.
 */
@Controller
@RequestMapping("/rgcode")
public class RegistrationCodeController {

    @Autowired
    private KwDocumentPageviewService kwDocumentPageviewService;


    //用户注册注册码---注册码生成
    @RequestMapping(value = "/RegistrationCodeGenerate", method = RequestMethod.POST)
    @ResponseBody
    public RegistrationCode RegistrationCodeGenerate(RegistrationCode registrationCode){
        int nameCount = 0;
//        nameCount = kwDocumentPageviewService.selectCountName(registrationCode.getName()); //查询名称存不存在
        if(nameCount==0){
            registrationCode.setReturnState(1);
            registrationCode.setMeg("生成注册码成功。");
            registrationCode.setCode(UUID.randomUUID().toString().toUpperCase()); //UUID生成随机不重复注册码（根据当前时间字符串生成）
            registrationCode.setState(0);//默认状态为0，待使用
//            kwDocumentPageviewService.insert(registrationCode);
        }else{
            registrationCode.setReturnState(0);
            registrationCode.setMeg("名称已存在，请重新输入。");
        }
        return registrationCode;
    }


    //用户注册码验证--注册码状态修改
    @RequestMapping(value = "/RegistrationCodeStateUpdate", method = RequestMethod.POST)
    @ResponseBody
    public RegistrationCode RegistrationCodeStateUpdate(RegistrationCode registrationCode){
        RegistrationCode rec = new RegistrationCode();
//        rec = kwDocumentPageviewService.selectNameByCode(registrationCode.getName(),registrationCode.getCode()); //查询名称，注册码存不存在
        if(rec==null||rec.getCode()==null){
            registrationCode.setReturnState(0);
            rec.setMeg("注册码不存在，请获取注册码。");
        }else{
            if(rec.getState()==1){
                registrationCode.setReturnState(0);
                rec.setMeg("注册码已经使用，请更换注册码。");
            }else{
//                kwDocumentPageviewService.updateState(rec.getId());  //根据id修改当前注册码状态
                registrationCode.setReturnState(1);
                rec.setMeg("注册成功。");
            }
        }
        return rec;
    }

}
