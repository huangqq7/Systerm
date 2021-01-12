package cn.edu.hcnu.bean;

import java.util.Date;
import java.util.Set;

public class Customer {
    private String id;//没有业务意义
    private String name;
    private String phone;
    private String CoustomerType;//乘客类型 成人、儿童、婴儿
    private String cardid;//身份证
    private Date birthDate;//出发日期
    private Set<Order> orderSet;//

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

    public String getCoustomerType() {
        return CoustomerType;
    }

    public void setCoustomerType(String coustomerType) {
        CoustomerType = coustomerType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}

