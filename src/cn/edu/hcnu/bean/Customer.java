package cn.edu.hcnu.bean;

public class Customer {
    private String id;
    private String name;//姓名
    private String phone;//电话号码
    private String Coustomer;//乘客类型 成人、儿童、婴儿
    private String cardid;//身份证
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCoustomer() {
        return Coustomer;
    }

    public void setCoustomer(String coustomer) {
        Coustomer = coustomer;
    }
}
