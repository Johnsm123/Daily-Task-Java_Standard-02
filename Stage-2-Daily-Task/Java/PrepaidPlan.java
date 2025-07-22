public class PrepaidPlan extends PhonePlan {
    private int validity;
    private double extraData;

    public PrepaidPlan(String providerName, String planName, String talkTime, int data, int smsPerDay,
                       String planType, int validity, double extraData) {
        super(providerName, planName, talkTime, data, smsPerDay, planType);
        this.validity = validity;
        this.extraData = extraData;
    }

    public int getValidity() { return validity; }
    public void setValidity(int validity) { this.validity = validity; }

    public double getExtraData() { return extraData; }
    public void setExtraData(double extraData) { this.extraData = extraData; }

    public double findPlanAmount() {
        String provider = providerName.toUpperCase();
        int dataPerDay = data;

        if (!(provider.equals("AIRTEL") || provider.equals("JIO"))) return -1;

        if (dataPerDay != 2 && dataPerDay != 3) return -1;

        double amount = -1;
        switch (provider) {
            case "AIRTEL":
                if (dataPerDay == 2) {
                    if (validity == 28) amount = 299;
                    else if (validity == 56) amount = 549;
                    else if (validity == 84) amount = 839;
                } else if (dataPerDay == 3) {
                    if (validity == 28) amount = 399;
                    else if (validity == 56) amount = 649;
                    else if (validity == 84) amount = 939;
                }
                break;
            case "JIO":
                if (dataPerDay == 2) {
                    if (validity == 28) amount = 389;
                    else if (validity == 56) amount = 620;
                    else if (validity == 84) amount = 939;
                } else if (dataPerDay == 3) {
                    if (validity == 28) amount = 400;
                    else if (validity == 56) amount = 749;
                    else if (validity == 84) amount = 839;
                }
                break;
        }

        return amount;
    }
}