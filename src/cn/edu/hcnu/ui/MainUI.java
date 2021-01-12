package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImpl;

import java.util.Scanner;
import java.util.UUID;
//Flight增加flight属性
public class MainUI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  choice=sc.nextInt();
        if(choice==1){
            String id= UUID.randomUUID().toString();
            System.out.println("请输入航班编号");
            String flightid=sc.next();

            System.out.println("请输入机型");
            String planeType=sc.next();

            System.out.println("请输入座位数");
            String currentSeatsNum=sc.next();

            System.out.println("请输入起飞机场");
            String departureAirport=sc.next();

            System.out.println("请输入目的机场");
            String destionnationAirport=sc.next();

            System.out.println("请输入起飞时间");
            String deparetureitme=sc.next();
            Flight flight=new Flight(id,flightid,planeType,currentSeatsNum,
                    departureAirport,deparetureitme);
            IFlightService iFlightService= (IFlightService) new FlightServiceImpl();
        }
    }
}
