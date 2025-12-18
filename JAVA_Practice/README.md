# Java Practice Solutions

This folder contains Java solutions for LeetCode problems and coding challenges.

---

## 📋 Contents

- **DECEMBER2025/** - Daily December 2025 LeetCode problems
  - `17_DEC_questleetcode.java` - Evaluate Reverse Polish Notation
  - `18_DEC_questleetcode.java` - Missing Number
- **Other Java files** - Previous problem solutions

---

## 🚀 How to Run Java Programs

### Prerequisites

**Install Java Development Kit (JDK):**
- Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.java.net/)
- Recommended: Java 8 or later

**Verify Installation:**
```powershell
java -version
javac -version
```

### Step-by-Step Execution

#### 1. Navigate to the Java folder
```powershell
cd c:\.Practice\JAVA_Practice\DECEMBER2025
```

#### 2. Compile the Java file
```powershell
javac 18_DEC_questleetcode.java
```

#### 3. Run the compiled class
```powershell
java 18_DEC_questleetcode
```

#### Complete One-Line Command
```powershell
cd c:\.Practice\JAVA_Practice\DECEMBER2025; javac 18_DEC_questleetcode.java; java 18_DEC_questleetcode
```

---

## 📝 File Naming Convention

Files follow this pattern:
- `DD_MON_questleetcode.java` = Day_Month_questleetcode.java

Examples:
- `17_DEC_questleetcode.java` = December 17th problem
- `18_DEC_questleetcode.java` = December 18th problem

---

## 🔧 Compilation Flags (Optional)

### Standard Compilation
```powershell
javac filename.java
```

### Compile with Warnings
```powershell
javac -Xlint filename.java
```

### Compile to Specific Directory
```powershell
javac -d . filename.java
```

### Run with ClassPath
```powershell
java -cp . classname
```

---

## ⚠️ Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| `'javac' is not recognized` | Install JDK and add `JAVA_HOME` to PATH environment variable |
| `'java' is not recognized` | Same as above - set PATH to JDK bin directory |
| `class not found` | Ensure you compiled first with `javac` before running `java` |
| `Exception in thread "main"` | Check `main` method signature: `public static void main(String[] args)` |
| `InputMismatchException` | Verify input data matches expected type |
| `NullPointerException` | Check for null values before using objects |

---

## 📚 Important Java Imports

```java
import java.util.*;              // Collections, ArrayList, HashMap, etc.
import java.util.Stack;          // Stack data structure
import java.util.Queue;          // Queue interface
import java.util.LinkedList;     // LinkedList implementation
import java.util.HashMap;        // Hash map
import java.util.TreeMap;        // Ordered map
import java.util.Set;            // Set interface
import java.util.Arrays;         // Array utilities
import java.io.*;                // Input/Output operations
```

---

## 💡 Key Concepts in Solutions

### 17_DEC - Evaluate Reverse Polish Notation
- **Data Structure:** Stack
- **Key Logic:** Pop two operands, apply operator, push result
- **Important:** Division truncates toward zero using `(int)((double)a / b)`

### 18_DEC - Missing Number
- **Data Structure:** Array
- **Algorithm:** Mark existing numbers, find missing one
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## 💻 Running Example

```powershell
# Navigate to JAVA_Practice folder
cd c:\.Practice\JAVA_Practice\DECEMBER2025

# Compile 18_DEC problem
javac 18_DEC_questleetcode.java

# Run the program
java 18_DEC_questleetcode

# Expected output:
# Test 1 - Input: [3, 0, 1]
# Output: 2
#
# Test 2 - Input: [0, 1]
# Output: 2
#
# Test 3 - Input: [9, 6, 4, 2, 3, 5, 7, 0, 1]
# Output: 8
```

---

## 📖 Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [Java Collections Tutorial](https://www.geeksforgeeks.org/collections-in-java-2/)
- [LeetCode Java Solutions](https://leetcode.com/discuss/?currentPage=1&orderBy=most_votes&languageTags=java)

---

## ✅ Checklist Before Running

- [ ] JDK is installed (`java -version` works)
- [ ] File path is correct
- [ ] File is compiled with `javac` first
- [ ] Class name matches file name (case-sensitive)
- [ ] `main` method exists in the public class
- [ ] No syntax errors in the code

---

**Last Updated:** December 18, 2025
