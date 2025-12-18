# SQL Practice Solutions

This folder contains SQL solutions for LeetCode SQL problems and database challenges.

---

## 📋 Contents

- **SQL50 Challenge** - LeetCode SQL 50 problems
  - Files numbered sequentially (16SQL50.sql through 38SQL50.sql)
- Various SQL problem solutions

---

## 🚀 How to Run SQL Scripts

### Prerequisites

**Choose your database platform:**

1. **MySQL** (Most common)
   - Download: [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
   - GUI Tool: [MySQL Workbench](https://www.mysql.com/products/workbench/)

2. **SQL Server**
   - Download: [SQL Server Express](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)
   - GUI Tool: [SQL Server Management Studio (SSMS)](https://learn.microsoft.com/en-us/sql/ssms/download-sql-server-management-studio-ssms)

3. **PostgreSQL**
   - Download: [PostgreSQL](https://www.postgresql.org/download/)
   - GUI Tool: [pgAdmin](https://www.pgadmin.org/)

4. **Online Platforms** (No installation needed)
   - [LeetCode](https://leetcode.com/problemset/database/)
   - [HackerRank](https://www.hackerrank.com/domains/sql)
   - [SQLFiddle](http://sqlfiddle.com/)

---

## 📝 File Naming Convention

Files follow this pattern:
- `DDMON50.sql` = Day_Month_LeetCode50Challenge.sql

Examples:
- `16SQL50.sql` = 16th SQL50 problem
- `20SQL50.sql` = 20th SQL50 problem
- `23SQL.sql` = 23rd SQL problem

---

## 🚀 Step-by-Step Execution

### Option 1: Using MySQL Workbench (GUI)

1. **Open MySQL Workbench**
2. **Connect to your MySQL server**
3. **File → Open SQL Script** (or Ctrl+O)
4. **Select the SQL file** from `SQL_practice` folder
5. **Execute** (Ctrl+Shift+Enter or click Execute button)

### Option 2: Using MySQL Command Line

```powershell
# Connect to MySQL
mysql -u root -p

# Select database (create if needed)
USE leetcode_practice;

# Run the SQL file
source c:\.Practice\SQL_practice\20SQL50.sql;
```

### Option 3: Using SQL Server Management Studio (SSMS)

1. **Open SSMS**
2. **Connect to your SQL Server**
3. **File → Open → File** (Ctrl+O)
4. **Select the SQL file**
5. **Execute** (F5 or Ctrl+E)

### Option 4: Using PostgreSQL with psql

```powershell
# Connect to PostgreSQL
psql -U postgres

# Run the SQL file
\i 'c:\.Practice\SQL_practice\20SQL50.sql'
```

### Option 5: Online Platform (No Installation)

1. **Go to [LeetCode SQL Section](https://leetcode.com/problemset/database/)**
2. **Copy the SQL code** from the file
3. **Paste into LeetCode editor**
4. **Submit** to test against their test cases

---

## 📊 SQL Concepts Covered

### LeetCode SQL50 Topics

- **SELECT & WHERE**
- **JOIN Operations** (INNER, LEFT, RIGHT, FULL OUTER)
- **GROUP BY & HAVING**
- **Aggregation Functions** (COUNT, SUM, AVG, MAX, MIN)
- **Subqueries**
- **Window Functions** (ROW_NUMBER, RANK, etc.)
- **String Functions**
- **Date Functions**
- **Case Statements**
- **Common Table Expressions (CTE)**

---

## 🔧 Database Setup (Optional)

### Create Practice Database

**MySQL:**
```sql
CREATE DATABASE leetcode_practice;
USE leetcode_practice;
```

**SQL Server:**
```sql
CREATE DATABASE leetcode_practice;
USE leetcode_practice;
```

**PostgreSQL:**
```sql
CREATE DATABASE leetcode_practice;
\c leetcode_practice;
```

---

## ⚠️ Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| `ERROR 1064: Syntax error` | Check SQL syntax, ensure semicolon at end |
| `Table doesn't exist` | Create tables first or use provided test data |
| `Unknown column 'x' in field list` | Check column names are spelled correctly |
| `ERROR 1215: Cannot add foreign key constraint` | Check column types match in foreign key |
| `Unexpected EOF` | Ensure all SQL statements are complete |

---

## 📚 Common SQL Commands Reference

```sql
-- Basic SELECT
SELECT * FROM table_name;
SELECT column1, column2 FROM table_name WHERE condition;

-- JOINs
SELECT * FROM table1 
INNER JOIN table2 ON table1.id = table2.id;

SELECT * FROM table1 
LEFT JOIN table2 ON table1.id = table2.id;

-- GROUP BY
SELECT column, COUNT(*) FROM table_name GROUP BY column;

-- Subquery
SELECT * FROM table WHERE id IN (SELECT id FROM other_table);

-- Window Functions (SQL Server, PostgreSQL)
SELECT column, ROW_NUMBER() OVER (ORDER BY column) AS rank FROM table_name;

-- CTE
WITH cte_name AS (
    SELECT * FROM table_name
)
SELECT * FROM cte_name;
```

---

## 💡 Best Practices

1. **Test with sample data** - Ensure query works before submission
2. **Use aliases** - Make queries readable: `SELECT e.name FROM employees AS e`
3. **Check constraints** - Note any NULL value handling needed
4. **Optimize queries** - Use indexes for large tables
5. **Comment code** - Add comments for complex logic

---

## 📖 Resources

- [MySQL Documentation](https://dev.mysql.com/doc/)
- [SQL Server Docs](https://learn.microsoft.com/en-us/sql/sql-server/)
- [PostgreSQL Manual](https://www.postgresql.org/docs/)
- [W3Schools SQL Tutorial](https://www.w3schools.com/sql/)
- [LeetCode SQL Problems](https://leetcode.com/problemset/database/)

---

## ✅ Checklist Before Running

- [ ] Database server is installed and running
- [ ] You have a database management tool (Workbench, SSMS, pgAdmin, etc.)
- [ ] SQL file path is correct
- [ ] Database tables exist (create if needed)
- [ ] SQL syntax is valid (no typos in column names)

---

**Last Updated:** December 18, 2025
