/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;


/**
 *
 * @author Akshay
 */
public class Remove {
    public void delection(){
        DataInputStream ds=new DataInputStream(System.in);
        try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","2580")) {
                System.out.println("Enter the name of the product");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " delete from products where ProductName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("deleted successfully");
                }
                else
                {
                    System.out.println("couldn't delete");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
    }
    
}
