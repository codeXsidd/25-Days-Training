# 🗓️ Day 14: 7th April

## 🎯 Focus: Exception Handling

Today's session was dedicated to understanding and implementing custom exceptions in Java through a practical ATM system simulation.

---

## 🏗️ Core Concepts Explored

### 1. Custom Exceptions
- **Concept:** Creating user-defined exception classes by extending the `Exception` class.
- **Implementation:** `InvalidPinException` and `InsufficientBalance` classes.

### 2. Try-Catch-Finally Block
- **Usage:** Handling potential errors during runtime and ensuring cleanup operations in the `finally` block.

---

## 🛠️ Project Implementation

### 1. ATM Simulation
- **Description:** A robust ATM system that validates user PIN and manages balance with strict error checking.
- **File:** [ATM_Exceptions_Handling.java](ATM_Exceptions_Handling.java)

---

## ✨ Implementation Highlights
* ✅ **Error Resilience**: Gracefully handles incorrect PINs and insufficient funds without crashing.
* ✅ **Clean Separation**: Distinct exception classes for better error categorization.
* ✅ **Resource Lifecycle**: Used `finally` to ensure the session end message is always displayed.

---

<p align="center">Made with ❤️ by <a href="https://github.com/codeXsidd">codeXsidd</a></p>
