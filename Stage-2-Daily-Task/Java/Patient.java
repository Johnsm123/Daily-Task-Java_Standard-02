public sealed class Patient permits InPatient, OutPatient {
    protected String patientId;
    protected String patientName;
    protected String mobileNumber;
    protected double medicalBill;

    public Patient(String patientId, String patientName, String mobileNumber, double medicalBill) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.mobileNumber = mobileNumber;
        this.medicalBill = medicalBill;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getMedicalBill() {
        return medicalBill;
    }

    public void setMedicalBill(double medicalBill) {
        this.medicalBill = medicalBill;
    }
}
