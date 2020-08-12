/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaya Rastogi
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection con;
 
    public static Connection connecrdb(){
      try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "jayarastogi@123");
      return con;
      }
            catch(ClassNotFoundException | SQLException e){
       JOptionPane.showMessageDialog(null,e);
       return null;
      }
      }
    }

