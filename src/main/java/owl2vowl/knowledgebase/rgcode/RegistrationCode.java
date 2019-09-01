package owl2vowl.knowledgebase.rgcode;

/**
 * Created by jiazailie on 2018/8/6.
 */
public class RegistrationCode {

    private int id;//id

    private String name;//名称

    private String code;//注册码

    private int state;//状态 默认值:0   0.未使用   1.已使用

    private String meg;//返回消息

    private int returnState;//返回状态  0.成功   1.失败

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public int getReturnState() {
        return returnState;
    }

    public void setReturnState(int returnState) {
        this.returnState = returnState;
    }

    @Override
    public String toString() {
        return "RegistrationCode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", state=" + state +
                ", meg='" + meg + '\'' +
                ", returnState=" + returnState +
                '}';
    }
}
