public class Restaurant {
    private String customerName;
    private int orderNumber;
    private String deliveryType;
    private String foodName;
    private long phoneNumber;

    // Constructor
    public Restaurant(String customerName, int orderNumber, String deliveryType, String foodName, long phoneNumber) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.deliveryType = deliveryType;
        this.foodName = foodName;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Calculate total bill based on delivery type
    public double calculateTotalBill(double cost) {
        double tax;
        switch (deliveryType) {
            case "HomeDelivery":
                tax = 0.8;
                break;
            case "Parcel":
                tax = 0.5;
                break;
            case "NormalOrder":
                tax = 0.3;
                break;
            default:
                return -1; // Indicates invalid delivery type
        }
        return (cost * tax) + cost;
    }
}