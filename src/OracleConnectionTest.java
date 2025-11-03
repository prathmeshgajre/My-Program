import java.sql.*;

public class OracleConnectionTest {
    public static void main(String[] args) {
        // Oracle connection details
        String url = "jdbc:postgresql://localhost:5432/postgres";  // or use @//localhost:1521/orcl
        String username = "postgres";
        String password = "190902";
        String query = "Select * from Student;";
        try {
            // Load Oracle JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Drivers loaded successfully!!!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            // Connect to database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}