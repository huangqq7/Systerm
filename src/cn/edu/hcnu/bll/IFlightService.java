package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;
//创建接口
public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightDepartureAirport(String departureAirport);
    Flight getFlightDeparetureitme(String deparetureitme);
    Flight getFlightDestionnationAirport(String destionnationAirport);

    void updateFlight(Flight flight);
}
