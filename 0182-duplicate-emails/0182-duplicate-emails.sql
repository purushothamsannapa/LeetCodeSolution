SELECT DISTINCT email
FROM Person
GROUP BY email
Having COUNT(email)>1;