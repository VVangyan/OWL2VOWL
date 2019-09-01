package owl2vowl.util;

import java.io.Serializable;

public class Student implements Serializable{//Student类通过实现Serializable接口拥有了序列化的能力
    private String id;
    private String name;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}