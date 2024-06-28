import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/yourDatabase";
            String user = "username";
            String password = "password";

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // Create a statement
            Statement stmt = conn.createStatement();
            
            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM yourTable");
            
            // Iterate through the result set
            while (rs.next()) {
                System.out.println(rs.getString("columnName"));
            }
            
            // Clean up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}