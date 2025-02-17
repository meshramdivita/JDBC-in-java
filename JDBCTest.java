import java.sql.*;
import java.io.*;

class JDBCTest
{
    public static void main(String[] arg)
    {
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "root");

          String q="insert into image(pic) values(?)";

          PreparedStatement pstmt=con.prepareStatement(q);

          // pstmt.setString(1,"value");

          FileInputStream fis=new FileInputStream("mypic.jpg");

          pstmt.setBinaryStream(1,fis,fis.available());

          pstmt.executeUpdate();

          System.out.println("done.......");

          // close the resource
            pstmt.close();
            fis.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //System.out.println("Error!!");
        }
    }   

}