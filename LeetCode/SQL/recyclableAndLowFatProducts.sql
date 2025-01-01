# 1757. Recyclable and Low Fat Products
# By Alejandro Martinez
# Difficulty: Easy
# December 29th 2024

# Write your MySQL query statement below
select product_id from products
where low_fats = 'Y' and recyclable = 'Y';