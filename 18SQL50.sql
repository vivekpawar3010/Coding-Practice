--596. Classes With at Least 5 Students

--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| student     | varchar |
--| class       | varchar |
--+-------------+---------+
--(student, class) is the primary key (combination of columns with unique values) for this table.
--Each row of this table indicates the name of a student and the class in which they are enrolled.
--Write a solution to find all the classes that have at least five students.
--Return the result table in any order.
--The result format is in the following example.


-- ANS = https://leetcode.com/problems/classes-with-at-least-5-students/?envType=study-plan-v2&envId=top-sql-50
SELECT  class 
FROM Courses
group by class having count(class) >= 5;
