import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/EmpDb";
        String username="postgres";
        String password="TestPassword1234";

        try{
            Connection conn= DriverManager.getConnection(url,username,password);
            //Statement stmt= conn.createStatement();;
            String sql ="INSERT INTO employee (firstname,lastname,age) VALUES (?,?,?)";
            PreparedStatement stmt=conn.prepareStatement(sql);

            stmt.setString(1,"Angle");
            stmt.setString(2,"Doe");
            stmt.setInt(3,18);

            int rowsAffected=stmt.executeUpdate();
            System.out.println("Row affected : "+rowsAffected);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        try{
            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stmt= conn.createStatement();;

            ResultSet rs= stmt.executeQuery("Select * from employee");
            while (rs.next())
            {
                int id=rs.getInt("id");
                String firstname= rs.getString("firstname");
                String lastname=rs.getString("lastname");
                int age = rs.getInt("age");

                System.out.println(id+"."+lastname+","+firstname+"("+age+")");
            }
            rs.close();
            stmt.close();
            conn.close();;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}