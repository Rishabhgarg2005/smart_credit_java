# SmartCredit: Automated Loan Eligibility & Risk Analyzer 

### BYOP Capstone Project 
**Author:** Rishabh Garg  
**Domain:** Fintech / Automated Decision Systems

---

##  Project Overview
SmartCredit is a Java-based application designed to solve the problem of manual delays in loan approval prcessing steps . By using a **Rule-Based Expert System**, 
it evaluates the customers loan application statement by using the DTI ratio (**dept to income**) ratio. 
it includes mainly the 2 factors 
1:- (CREDIT-SCORE).
2:- (DTI)ratio.

This project demonstrates core **Object-Oriented Programming (OOP)** principles, **File I/O**, and **Data Validation** in a real-world financial context.

---

##  Core Logic & Business Rules
The system calculates the **Debt-to-Income (DTI)** ratio to assess risk.

| Category | Criteria | Outcome |
| :--- | :--- | :--- |
| **Tier 1** | Credit Score > 750 AND DTI < 30% | Approved (Low Interest) |
| **Tier 2** | Credit Score 650-750 AND DTI < 45% | Approved (Standard) |
| **Rejected** | Credit Score < 600 OR DTI > 45% | Declined |

---

##  Technical Stack
* **Language:** Java (JDK 17+)
* **Architecture:** Modular (POJO, Logic Engine, Data Handler)
* **Persistence:** CSV-based File Storage (`loan_records.csv`)
* **Concepts Used:** * **Encapsulation:** Private fields and public getters in `Applicant.java`.
    * **Static Logic:** Utility-based decision making in `Validator.java`.
    * **Exception Handling:** Robust File I/O to prevent crashes.

 
 Installation & Execution Guide
Follow these steps to set up and run the SmartCredit system on your local machine.

1. Prerequisites
Ensure you have the following installed:

Java Development Kit (JDK): Version 11 or higher.

Check by running java -version in your terminal.

Git: To clone the repository.

Code Editor: VS Code, IntelliJ IDEA, or even Notepad++.

2. Clone the Repository
Open your terminal (Command Prompt or PowerShell) and run:

Bash
git clone https://github.com/your-username/smart_card_java
cd SmartCredit
3. Compilation
Navigate to the directory containing your .java source files. Compile all files at once using the wildcard *:

Bash
javac Applicant.java Validator.java Main.java
This will generate .class files for each component.

4. Running the Application
Once compiled, run the Main class to start the program:

Bash
java Main****


---

##  Project Structure
```text
SmartCredit/
├── src/
│   ├── Main.java           # Entry point & User Interface
│   ├── Applicant.java      # Data Model (POJO)
│   └── Validator.java      # Business Logic Engine
├── data/
│   └── loan_records.csv    # Local database (Auto-generated)
├── docs/
│   └── Project_Report.pdf  # Detailed Capstone Report
└── README.md               # Project Documentation

