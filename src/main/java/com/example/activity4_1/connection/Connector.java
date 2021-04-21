package com.example.activity4_1.connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private Connector() {
    }
    private static Connector connector;

    public static Connector getInstance() {
        if (connector == null) {
            connector = new Connector();
        }
        return connector;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "yohoailamm1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
//class test{
//    public static void main(String[] args) {
//        Connector connector = new Connector();
//        if(connector.getConnection()==null){
//            System.out.println("That bai");
//        } else{
//            System.out.println("Thanh cong");
//        };
//    }
//}


