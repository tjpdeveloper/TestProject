package com.javatpoint;

import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
String connectionUrl = "jdbc:mysql://localhost:3306/mytestdb?serverTimezone=UTC&autoReconnect=true&useSSL=false";
//String connectionUrl = "jdbc:mysql://localhost:3306/mytestdb?autoReconnect=true&useSSL=false";
//Class.forName("com.mysql.jdbc.Driver").newInstance();
//Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mytestdb?autoReconnect=true&useSSL=false","root","admin123");
Connection con = DriverManager.getConnection(connectionUrl, "root", "admin123"); 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  