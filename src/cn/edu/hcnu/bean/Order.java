package cn.edu.hcnu.bean;

import java.util.Set;

public class Order {
    private String id;
    private float airPortTax;//机场税
    private float ryf;//燃油费
    private float jptgx;//机票退改险
    private float hkzhx;//航空综合险
    private float yhj;//优惠卷
    private float hszj;//含税总价
    private float jpjg;//机票价格
    private Set<Customer> customerSet;
    private Flight flight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

}


