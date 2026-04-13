# 🏧 Advanced OOPs Project: ATM Banking System

## 🎯 Overview
A robust, console-based **ATM Banking System** designed to demonstrate advanced Object-Oriented Programming (OOP) principles in Java, including abstraction, interfaces, encapsulation, and exception handling.

---

## 🏗️ Architecture & OOP Principles

### 1. Abstraction (`abstract class ATM`)
- Defines the core blueprint for any ATM implementation.
- Contains abstract methods like `withdraw()`, `deposit()`, and `checkBalance()`.

### 2. Interfaces (`Printer`, `Security_check`)
- **Printer:** Ensures any ATM model can print transaction receipts.
- **Security_check:** Enforces strict login validation protocols.

### 3. Encapsulation (`User` class)
- Correctly bundles account data (Account No, PIN, Balance, Transaction History) within a single unit.

### 4. Inheritance
- `sidhATM` extends the base `ATM` class and implements multiple interfaces to provide a concrete, feature-rich banking experience.

---

## 🚀 Key Features

* 🔐 **Secure Login**: 3-attempt limit for account security.
* 💰 **Transaction Management**: Support for deposits and withdrawals with real-time balance updates.
* 📜 **Mini Statement**: View transaction history via the `Print Receipt` feature.
* 🛡️ **Exception Handling**: Graceful management of invalid inputs, incorrect PINs, and insufficient funds.

---

## 🛠️ Implementation

### File: [ATM_Banking_System.java](ATM_Banking_System.java)
- **Primary Logic:** Handles multi-user support using `HashMap`.
- **User Experience:** interactive console menu for seamless navigation.

---

<p align="center">Made with ❤️ by <a href="https://github.com/codeXsidd">codeXsidd</a></p>
