# 🏧 Advanced OOPs Project: ATM Banking System

## 🎯 Overview
A robust, console-based **ATM Banking System** designed to demonstrate advanced Object-Oriented Programming (OOP) principles in Java. This project emphasizes modularity through the use of **Java Packages**, abstraction, interfaces, encapsulation, and exception handling.

---

## 📂 Project Structure & Packages

The project has been refactored into a modular package-based structure:

### `banking` Package
- **[`ATM.java`](banking/ATM.java)**: Abstract base class defining the core blueprint.
- **[`Printer.java`](banking/Printer.java)**: Interface for receipt printing functionality.
- **[`Security_check.java`](banking/Security_check.java)**: Interface for authentication protocols.
- **[`User.java`](banking/User.java)**: Encapsulates user data including account details and history.
- **[`sidhATM.java`](banking/sidhATM.java)**: Concrete implementation of the ATM system.

### Main Application
- **[`ATM_Banking_System.java`](ATM_Banking_System.java)**: The entry point of the application that orchestrates the user interaction.

---

## 🏗️ Architecture & OOP Principles

### 1. Abstraction
- Uses `abstract class ATM` to define mandatory banking operations without specifying their implementation details.

### 2. Interfaces
- **Printer & Security_check:** Demonstrate multiple inheritance of behavior, ensuring the system can print and validate security.

### 3. Encapsulation
- The `User` class bundles account information and transaction history, protecting data integrity.

### 4. Inheritance
- `sidhATM` extends the base `ATM` class and implements multiple interfaces to provide a complete banking experience.

---

## 🚀 Key Features

* 📦 **Modular Design**: Organized into packages for better maintainability and scalability.
* 🔐 **Secure Login**: 3-attempt limit for account security.
* 💰 **Transaction Management**: Support for deposits and withdrawals with real-time balance updates.
* 📜 **Mini Statement**: View transaction history via the `Print Receipt` feature.
* 🛡️ **Exception Handling**: Graceful management of invalid inputs, incorrect PINs, and insufficient funds.

---

## 🛠️ How to Run

1. **Compile the project:**
   ```bash
   javac ATM_Banking_System.java banking/*.java
   ```

2. **Run the application:**
   ```bash
   java ATM_Banking_System
   ```

---

<p align="center">Made with ❤️ by <a href="https://github.com/codeXsidd">codeXsidd</a></p>
