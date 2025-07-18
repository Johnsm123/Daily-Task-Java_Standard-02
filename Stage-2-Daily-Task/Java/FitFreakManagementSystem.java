import java.sql.*;
import java.util.*;
import java.io.*;

public class FitFreakManagementSystem {
    public List<FitFreak> retrieveFitFreakListBasedOnAge(int inputAge) {
        List<FitFreak> fitList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            String sql = "SELECT * FROM FitFreak WHERE age <= ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, inputAge);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String fitnessId = rs.getString("fitnessId");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                double height = rs.getDouble("height");
                double weight = rs.getDouble("weight");

                FitFreak freak = new FitFreak(fitnessId, name, gender, age, height, weight);
                fitList.add(freak);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }

        return fitList;
    }
}
