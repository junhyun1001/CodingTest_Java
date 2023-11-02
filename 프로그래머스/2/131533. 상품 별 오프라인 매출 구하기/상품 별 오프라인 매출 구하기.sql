-- 코드를 입력하세요
SELECT product_code, SUM(p.price * os.sales_amount) AS 'SALES'
FROM product p JOIN offline_sale os ON p.product_id = os.product_id
GROUP BY p.product_code
ORDER BY sales desc, p.product_code;