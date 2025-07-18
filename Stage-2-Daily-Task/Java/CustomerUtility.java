public class CustomerUtility {
    public boolean validateCustomerEmail(String customerEmail) {
        return customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }
}

