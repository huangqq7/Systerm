package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;

import java.util.Set;

//业务类调用DAO层
public class FlightServiceImpl implements IFlightService {
    @Override
    public void insertFlight(Flight flight) {

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
