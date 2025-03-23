# Write your MySQL query statement below
SELECT DISTINCT email as Email 
FROM Person
GROUP BY email
HAVING COUNT(Email)>1;