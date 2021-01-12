package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;
//创建FlightDaoImpl类并实现IFlightDao接口
public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightDepartureAirport(String departureAirport);
    Flight getFlightDeparetureitme(String deparetureitme);
    Flight getFlightDestionnationAirport(String destionnationAirport);

    void updateFlight(Flight flight);
}
