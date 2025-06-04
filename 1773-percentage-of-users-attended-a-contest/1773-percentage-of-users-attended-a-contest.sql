# Write your MySQL query statement below
SELECT R.contest_id,ROUND(COUNT(DISTINCT R.user_id)*100/(SELECT COUNT(DISTINCT user_id) FROM Users),2) AS percentage
FROM Register AS R
LEFT JOIN Users AS U
ON R.user_id = U.user_id
GROUP BY contest_id
ORDER BY percentage DESC,contest_id ASC
