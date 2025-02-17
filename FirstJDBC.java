/*
1) load the Driver : 
     Class.forName("driver_name") ("com.mysql.jdbc.Driver")//

     or use DruverManager.registerDriver(new com.mysql.jdbc.Driver());

2) create a connection : 

*/ 


// program for jdbc  1st program :

import java.sql.*;

public class FirstJDBC
{
    public static void main(String[] args)
     {
        try
         {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Updated JDBC URL
            String url = "jdbc:mysql://localhost:3306/youtube?useSSL=false&allowPublicKeyRetrieval=true";
            String username = "root";
            String password = "root"; // Ensure this is correct

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) 
            {
               System.out.println("Connection is Closed");
            } 
            else 
            {
               System.out.println("Connection Created...");
            }

          }
          catch (Exception e) 
          {
            e.printStackTrace();
          }
    }
}


