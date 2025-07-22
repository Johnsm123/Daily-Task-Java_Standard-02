public final class InPatient extends Patient {
    private double roomRent;
    private int numberOfDays;
    private double testCharges;

    public InPatient(String patientId, String patientName, String mobileNumber, double medicalBill,
                     double roomRent, int numberOfDays, double testCharges) {
        super(patientId, patientName, mobileNumber, medicalBill);
        this.roomRent = roomRent;
        this.numberOfDays = numberOfDays;
        this.testCharges = testCharges;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getTestCharges() {
        return testCharges;
    }

    public void setTestCharges(double testCharges) {
        this.testCharges = testCharges;
    }

    public double calculateTotalBill() {
        return (numberOfDays * roomRent) + medicalBill + testCharges;
    }
}
