package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Flight增加flight属性
public class MainUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();
            if (choice == 1) {

                String id = UUID.randomUUID().toString().replace("-", "");

                System.out.println("请输入航班编号");
                String flightid = sc.next();

                System.out.println("请输入机型");
                String planeType = sc.next();

                System.out.println("请输入座位数");
                String currentSeatsNum = sc.next();

                System.out.println("请输入起飞机场");
                String departureAirport = sc.next();

                System.out.println("请输入目的机场");
                String destionnationAirport = sc.next();

                System.out.println("请输入起飞时间");
                String deparetureitme = sc.next();

                Flight flight = new Flight(id, flightid, planeType, currentSeatsNum,
                        departureAirport, deparetureitme);

                IFlightService iFlightService = new FlightServiceImpl();

                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else if(choice==2){
                IFlightService iFlightService = new FlightServiceImpl();
                Set<Flight> allFlights=iFlightService.getAllFlights();
                    /*
                    Set的遍历需要用到迭代器
                     */
                for(Flight flight:allFlights){
                    System.out.println(flight);
                }
            }
        }
    }

}
