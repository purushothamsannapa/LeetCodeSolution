# Write your MySQL query statement below
SELECT MAX(num) as num
FROM MyNumbers
WHERE num in (SELECT num FROM MyNumbers group by num having COUNT(*) =1);