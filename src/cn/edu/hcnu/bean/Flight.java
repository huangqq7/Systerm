package cn.edu.hcnu.bean;

import java.util.Date;

public class Flight {
    private String id;
    private String departureAirport;//出发机场
    private String destionnationAirport;//到达机场
    private String planeType;//飞机类型
    private Date deparetureitme;//出发时间
    private String currentSeatsNum;//当前座位号

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id;
    }

    public String getDepartureAirport() { return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestionnationAirport() {
        return destionnationAirport;
    }

    public void setDestionnationAirport(String destionnationAirport) {
        this.destionnationAirport = destionnationAirport;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Date getDeparetureitme() {
        return deparetureitme;
    }

    public void setDeparetureitme(Date deparetureitme) {
        this.deparetureitme = deparetureitme;
    }

    public String getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(String currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }
}
