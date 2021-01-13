package cn.edu.hcnu.bean;

import java.util.Date;

public class Flight {
    private String id;//主键id，没有业务意义 UUID
    private String Flightid;//航班号
    private String departureAirport;//出发机场
    private String destionnationAirport;//到达机场
    private String planeType;//飞机类型
    private Date deparetureitme;//出发时间
    private int currentSeatsNum;//当前座位号

    public Flight(String flightid, String departureAirport, String destionnationAirport, String planeType, Date deparetureitme, int currentSeatsNum) {
        Flightid = flightid;
        this.departureAirport = departureAirport;
        this.destionnationAirport = destionnationAirport;
        this.planeType = planeType;
        this.deparetureitme = deparetureitme;
        this.currentSeatsNum = currentSeatsNum;
    }

    public Flight(String id, String flightid, String planeType, String currentSeatsNum, String departureAirport, String deparetureitme) {
    }

    @Override
    public String toString() {
        return "Flight{" +
                ", Flightid='" + Flightid + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destionnationAirport='" + destionnationAirport + '\'' +
                ", planeType='" + planeType + '\'' +
                ", deparetureitme=" + deparetureitme +
                ", currentSeatsNum=" + currentSeatsNum +
                '}';
    }
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

    public String getDeparetureitme() {
        return deparetureitme;
    }

    public void setDeparetureitme(Date deparetureitme) {
        this.deparetureitme = deparetureitme;
    }

    public String getFlightid() {
        return Flightid;
    }

    public void setFlightid(String flightid) {
        Flightid = flightid;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

}
