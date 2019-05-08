/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412algebragame;

import java.sql.Connection;
import java.sql.DriverManager;

public class main{
    public static String user;
    public static String pass;
    
    public static void main(String[] args) throws Exception
    {
        Gui g = new Gui();
        g.setVisible(true);
        getConnection();
        g.run();
    }
    
    public static Connection getConnection() throws Exception
    {
        try
        {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:msql://localhost:3306/database";
            
            Class.forName(driver);
            Connection data = DriverManager.getConnection(url,user,pass);
            System.out.println("it worked");
            return data;
        }
        catch (Exception e){System.out.println("something doesn't work");}
        return null;
    }
}

