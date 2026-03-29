import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SmartCredit: Loan Eligibility System ---");
        
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score (300-850): ");
        int score = sc.nextInt();

        System.out.print("Enter Monthly Income (INR): ");
        double income = sc.nextDouble();

        System.out.print("Enter Existing Monthly Debts (INR): ");
        double debt = sc.nextDouble();

        // Create object and get decision
        Applicant user = new Applicant(name, score, income, debt);
        String result = Validator.getDecision(user);

        // Display Result
        System.out.println("\n----------------------------");
        System.out.println("RESULT FOR: " + user.getName());
        System.out.println("DTI Ratio: " + String.format("%.2f", user.calculateDTI()) + "%");
        System.out.println("Decision: " + result);
        System.out.println("----------------------------");

        try (FileWriter fw = new FileWriter("loan_records.csv", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(name + "," + score + "," + income + "," + result);
            System.out.println("Record saved to loan_records.csv");
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }

        sc.close();
    }
}