// Prepared Statement : Insert

import java.sql.*;
import java.io.*;

class Fun
{
    public static void main (String [] arg)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Updated JDBC URL
            String url = "jdbc:mysql://localhost:3306/youtube?useSSL=false&allowPublicKeyRetrieval=true";
            String username = "root";
            String password = "root"; // Ensure this is correct

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // create query

            String q="insert into table1(tNamw,tCity) values(?,?)";

            // get the prepared statement object

            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name : ");
            String name=br.readLine();

            System.out.println("Enter your City : ");
            String city=br.readLine();

            // set the value to query

            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("inserted ...");

            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}