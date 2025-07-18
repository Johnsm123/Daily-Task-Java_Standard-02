import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerManagementSystem {

    public int insertCustomerRecordsToDB(Customer customerObj) {
        int result = 0;

        // Validate phone number inside this method
        if (!customerObj.getPhoneNo().matches("\\d{10}")) {
            return 0;
        }

        try {
            Connection con = DB.getConnection();
            String query = "INSERT INTO customer (id, name, email, phoneNo) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, customerObj.getId());
            ps.setString(2, customerObj.getName());
            ps.setString(3, customerObj.getEmail());
            ps.setString(4, customerObj.getPhoneNo());
            result = ps.executeUpdate();
        } catch (Exception e) {
            result = 0;
        }

        return result;
    }
}
