/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.sql.*;
import javax.swing.JOptionPane;


public class db {
    public static Connection java_db(){
    Connection conn=null;
    try{
        Class.forName("org.sqlite.JDBC");
        conn=DriverManager.getConnection("jdbc:sqlite:school.db");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
}
