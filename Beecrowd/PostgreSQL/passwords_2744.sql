-- Passwords
-- Problem Number: 2744
-- https://judge.beecrowd.com/es/problems/view/2744
-- Command Solution

SELECT id, 
       password, 
       md5(password) AS MD5
FROM account;