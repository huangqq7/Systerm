package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;

//业务类调用DAO层
public class FlightDaoIml implements IFlightDao{
    @Override
    public void insertFlight(Flight flight) {
        System.out.println("数据到达了DAO层：" + flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightDeparetureitme(String deparetureitme) {
        return null;
    }

    @Override
    public Flight getFlightDestionnationAirport(String destionnationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
