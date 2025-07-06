import java.sql.*;

    class JDBCDemo {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; // your DB URL
        String username = "root"; // your DB username
        String password = "admin"; // your DB password

        Connection conn = null;

        try {
            // Load MySQL JDBC Driver (optional in latest versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to database!");

            // INSERT
            String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setString(1, "John Doe");
            insertStmt.setString(2, "john@example.com");
            insertStmt.executeUpdate();

            // SELECT
            String selectQuery = "SELECT * FROM users";
            Statement selectStmt = conn.createStatement();
            ResultSet rs = selectStmt.executeQuery(selectQuery);

            System.out.println("\nUser List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("email"));
            }

            // UPDATE
            String updateQuery = "UPDATE users SET name = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, "Jane Doe");
            updateStmt.setInt(2, 1); // change ID accordingly
            updateStmt.executeUpdate();

            // DELETE
            String deleteQuery = "DELETE FROM users WHERE id = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 1); // change ID accordingly
            deleteStmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close(); // Close connection
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
