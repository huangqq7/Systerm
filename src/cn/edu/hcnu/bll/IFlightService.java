package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;
//创建接口
public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;//用来连接
    Set<Flight> getAllFlights();
    Flight getFlightDepartureAirport(String departureAirport);
    Flight getFlightDeparetureitme(String deparetureitme);
    Flight getFlightDestionnationAirport(String destionnationAirport);

    void updateFlight(Flight flight);
}
