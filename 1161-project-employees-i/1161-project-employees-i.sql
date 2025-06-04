# Write your MySQL query statement below
SELECT P.project_id, ROUND(SUM(E.experience_years)/COUNT(P.project_id),2) AS average_years
FROM Employee AS E
RIGHT JOIN Project AS P
ON P.employee_id = E.employee_id
GROUP BY P.project_id