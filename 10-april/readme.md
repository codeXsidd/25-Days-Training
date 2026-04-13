# 🗓️ Day 17: 10th April

## 🎯 Focus: Collections Utility, Iterators & Custom Sorting

Today's session focused on mastering the `Collections` utility class, understanding the differences between `Comparable` and `Comparator`, and exploring various ways to iterate through Java collections.

---

## 🏗️ Core Concepts Explored

### 1. Collections Utility Class
- **Methods:** `sort()`, `binarySearch()`, `reverse()`, `max()`, `min()`, `frequency()`, and `shuffle()`.
- **Key Insight:** Leveraging built-in static methods to manipulate collection data efficiently.

### 2. Comparable vs. Comparator
- **Comparable:** Used for natural ordering (e.g., sorting by ID). Requires implementing the `compareTo` method in the class itself.
- **Comparator:** Used for custom ordering (e.g., sorting by Name or Salary). Allows defining multiple sorting logic outside the class.

### 3. Advanced Iteration
- **Iterator:** Read-only, forward-only traversal.
- **ListIterator:** Bi-directional traversal with support for adding or modifying elements during iteration.

---

## 🛠️ Problems Solved

### 1. [Collections.java](Collections.java)
- Demonstrated various `java.util.Collections` methods like sorting, shuffling, and searching.

### 2. [Comparable.java](Comparable.java)
- Implemented natural ordering for custom objects using the `Comparable` interface.

### 3. [Comparator.java](Comparator.java)
- Implemented custom sorting logic using the `Comparator` interface for flexible data handling.

### 4. [Iterator & ListIterator](Iterator.java)
- Explored traversal techniques:
    - [Iterator.java](Iterator.java): Basic traversal.
    - [List_Iterator_Method.java](List_Iterator_Method.java): Bidirectional traversal and list manipulation.

### 5. [Key & Entry Sets](Key_and_Entry_Set_Map.java)
- Detailed exploration of `keySet()` and `entrySet()` for efficient Map traversal and manipulation.

---

## ✨ Implementation Highlights
* ✅ **Custom Sort Logic**: Successfully implemented multiple sorting criteria for objects.
* ✅ **Robust Iteration**: Mastered `ListIterator` for complex list updates.
* ✅ **Utility Mastery**: Integrated `Collections` helper methods for cleaner code.

---

<p align="center">Made with ❤️ by <a href="https://github.com/codeXsidd">codeXsidd</a></p>
