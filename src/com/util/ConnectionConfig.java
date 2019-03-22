package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {
    public static java.sql.Connection getConnection(){
        java.sql.Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/czat?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        }
        catch(Exception e){e.printStackTrace();}
        return connection;
    }

}
