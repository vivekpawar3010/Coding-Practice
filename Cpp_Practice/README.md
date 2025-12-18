# C++ Practice Solutions

This folder contains C++ solutions for LeetCode problems and coding challenges.

---

## 📋 Contents

- **DECEMBER2025/** - Daily December 2025 LeetCode problems
- **Other C++ files** - Previous problem solutions from various months

---

## 🚀 How to Run C++ Programs

### Prerequisites

**Install MinGW (GCC Compiler):**
- Download from [MinGW-w64](https://www.mingw-w64.org/)
- Or use [TDM-GCC](https://jmeubank.github.io/tdm-gcc/)

**Verify Installation:**
```powershell
g++ --version
```

### Step-by-Step Execution

#### 1. Navigate to the C++ folder
```powershell
cd c:\.Practice\Cpp_Practice\DECEMBER2025
```

#### 2. Compile the C++ file
```powershell
g++ -o solution 12_DEC_questleetcode.cpp
```

#### 3. Run the compiled program
```powershell
.\solution.exe
```

#### Complete One-Line Command
```powershell
cd c:\.Practice\Cpp_Practice\DECEMBER2025; g++ -o solution 12_DEC_questleetcode.cpp; .\solution.exe
```

---

## 📝 File Naming Convention

Files follow this pattern:
- `DD_MON_questleetcode.cpp` = Day_Month_questleetcode.cpp

Examples:
- `12_DEC_questleetcode.cpp` = December 12th problem
- `23_OCT_150leetcode.cpp` = October 23rd problem

---

## 🔧 Compilation Flags (Optional)

### Standard Compilation
```powershell
g++ -o output filename.cpp
```

### With C++17 Standard
```powershell
g++ -std=c++17 -o output filename.cpp
```

### With Optimization
```powershell
g++ -O2 -o output filename.cpp
```

### With Debug Info
```powershell
g++ -g -o output filename.cpp
```

### All Features Combined
```powershell
g++ -std=c++17 -O2 -Wall -Wextra -o output filename.cpp
```

---

## ⚠️ Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| `'g++' is not recognized` | Install MinGW and add to PATH environment variable |
| `undefined reference to main` | Ensure your file has a `main()` function |
| `compilation error` | Check for syntax errors and missing headers |
| `no output appears` | Verify program has `cout` statements or print logic |
| `error: no input file` | Check file name spelling and location |

---

## 📚 Important Headers for C++

```cpp
#include <iostream>      // Input/Output
#include <vector>        // Dynamic arrays
#include <string>        // String operations
#include <algorithm>     // Sorting, searching
#include <stack>         // Stack data structure
#include <queue>         // Queue data structure
#include <unordered_map> // Hash map
#include <set>           // Set container
#include <map>           // Ordered map
```

---

## 💡 Tips for Running C++ Programs

1. **Always compile before running** - C++ requires compilation step
2. **Check file path** - Use absolute or relative paths correctly
3. **Look at main() function** - Entry point must be named `main`
4. **Review test cases** - Most files have example inputs in `main()`
5. **Use meaningful output names** - Replace `solution` with descriptive names

---

## 📖 Resources

- [C++ Reference](https://cppreference.com)
- [GeeksforGeeks C++](https://www.geeksforgeeks.org/c-plus-plus/)
- [LeetCode C++ Solutions](https://leetcode.com/problems/two-sum/discuss/?currentPage=1&orderBy=most_votes&languageTags=cpp)

---

**Last Updated:** December 18, 2025
