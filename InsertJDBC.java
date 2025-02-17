import java.sql.*;
class InsertJDBC
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

            // create a query

            String q="create table table1(tId int(20) primary key auto_increment,tNamw varchar(200) not null ,tCity varchar(400))";

            // create a statement 

            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("Table created in Database...");

            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}