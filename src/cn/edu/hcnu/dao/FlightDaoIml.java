package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

//业务类调用DAO层
public class FlightDaoIml implements IFlightDao {
    @Override
    public void insertFlight(Flight flight) throws SQLException {

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "ooo";
        String password = "opts1234";

        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, flight.getId());
        pstmt.setString(2, flight.getFlightid());
        pstmt.setInt(4, flight.getCurrentSeatsNum());
        pstmt.setString(5, flight.getDepartureAirport());
        pstmt.setString(6, flight.getDestionnationAirport());
        pstmt.setString(7, flight.getDeparetureitme());
        pstmt.executeUpdate();


    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> allFlights=new HashSet<Flight>();//容器

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "ooo";
        String password = "opts1234";

        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM flight";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        return allFlights;
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
