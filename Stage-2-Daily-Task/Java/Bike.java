public class Bike {
    private String bikeModel;
    private String bikeType;
    private String bikeStatus;
    private int bikePrice;

    // No-arg constructor (assumed already provided)
    public Bike() {}

    // Getter and Setter methods (assumed already provided)
    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(String bikeStatus) {
        this.bikeStatus = bikeStatus;
    }

    public int getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(int bikePrice) {
        this.bikePrice = bikePrice;
    }

    // ✅ Four-argument constructor
    public Bike(String bikeModel, String bikeType, String bikeStatus, int bikePrice) {
        this.bikeModel = bikeModel;
        this.bikeType = bikeType;
        this.bikeStatus = bikeStatus;
        this.bikePrice = bikePrice;
    }

    // ✅ Static method to verify and return a valid Bike object
    public static Bike verifyBikeDetails(String bikeDetails) throws InvalidBikeException {
        String[] parts = bikeDetails.split(":");

        if (parts.length != 4) {
            throw new InvalidBikeException("Invalid bike details");
        }

        String model = parts[0].trim();
        String type = parts[1].trim();
        String status = parts[2].trim();
        String priceStr = parts[3].trim();

        // Validate bikeModel: BKE/ followed by exactly 4 digits
        if (!model.matches("BKE/\\d{4}")) {
            throw new InvalidBikeException("Invalid bike details");
        }

        // Validate bikeType: must be "Sport", "Cruiser", or "Electric"
        if (!(type.equals("Sport") || type.equals("Cruiser") || type.equals("Electric"))) {
            throw new InvalidBikeException("Invalid bike details");
        }

        // Validate bikeStatus: must be "New" or "Used"
        if (!(status.equals("New") || status.equals("Used"))) {
            throw new InvalidBikeException("Invalid bike details");
        }

        // Validate price: must be a positive integer
        int price;
        try {
            price = Integer.parseInt(priceStr);
            if (price <= 0) {
                throw new InvalidBikeException("Invalid bike details");
            }
        } catch (NumberFormatException e) {
            throw new InvalidBikeException("Invalid bike details");
        }

        // All validations passed
        return new Bike(model, type, status, price);
    }
}
