-- Products By Categories
-- Problem Number: 2609
-- https://www.beecrowd.com.br/judge/es/problems/view/2609
-- Command Solution
SELECT c.name AS name, SUM(p.amount) AS sum FROM products p
JOIN categories c ON p.id_categories = c.id GROUP BY c.name;