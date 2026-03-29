public class Validator {
    public static String getDecision(Applicant app) {
        double dti = app.calculateDTI();
        int score = app.getCreditScore();

        if (score >= 750 && dti <= 30) {
            return "APPROVED (Tier 1 - Low Interest)";
        } else if (score >= 650 && dti <= 45) {
            return "APPROVED (Tier 2 - Standard)";
        } else if (score < 600) {
            return "REJECTED (Low Credit Score)";
        } else if (dti > 45) {
            return "REJECTED (High Debt-to-Income Ratio)";
        } else {
            return "REFER TO MANUAL REVIEW";
        }
    }
}
