/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SK
 */
public class ConnectionProvider {
     
    public static Connection getcon(){

    try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            return con;

}catch(ClassNotFoundException | SQLException e){

}
        return null;

}

   
}
