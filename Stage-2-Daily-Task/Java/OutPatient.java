public non-sealed class OutPatient extends Patient {
    private double consultingFee;

    public OutPatient(String patientId, String patientName, String mobileNumber, double medicalBill,
                      double consultingFee) {
        super(patientId, patientName, mobileNumber, medicalBill);
        this.consultingFee = consultingFee;
    }

    public double getConsultingFee() {
        return consultingFee;
    }

    public void setConsultingFee(double consultingFee) {
        this.consultingFee = consultingFee;
    }

    public double calculateTotalBill() {
        return consultingFee + medicalBill;
    }
}
