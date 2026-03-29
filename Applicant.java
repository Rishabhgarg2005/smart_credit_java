public class Applicant {
    private String name;
    private int creditScore;
    private double monthlyIncome;
    private double monthlyDebt;

    public Applicant(String name, int creditScore, double monthlyIncome, double monthlyDebt) {
        this.name = name;
        this.creditScore = creditScore;
        this.monthlyIncome = monthlyIncome;
        this.monthlyDebt = monthlyDebt;
    }

  
    public String getName() { return name; }
    public int getCreditScore() { return creditScore; }
    public double getMonthlyIncome() { return monthlyIncome; }
    public double getMonthlyDebt() { return monthlyDebt; }

    public double calculateDTI() {
        return (monthlyDebt / monthlyIncome) * 100;
    }
}