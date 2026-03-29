# SmartCredit: Automated Loan Eligibility & Risk Analyzer 

### BYOP Capstone Project 
**Author:** Rishabh Garg  
**Domain:** Fintech / Automated Decision Systems

---

##  Project Overview
SmartCredit is a Java-based application designed to solve the problem of manual delays in loan approval prcessing steps . By using a **Rule-Based Expert System**, 
it evaluates the customers loan application statement by using the DTI ratio (**dept to income**) ratio. 
it includes mainly the 2 factors 
1:- (CREDIT-SCORE)
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
