SELECT ii.INGREDIENT_TYPE, SUM(fh.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF fh
INNER JOIN ICECREAM_INFO ii ON fh.FLAVOR = ii.FLAVOR
GROUP BY ii.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER;

/*
1단계
SELECT SHIPMENT_ID, FLAVOR, TOTAL_ORDER
FROM FIRST_HALF;

SELECT FLAVOR, INGREDIENT_TYPE
FROM ICECREAM_INFO;

2딘계
SELECT ii.INGREDIENT_TYPE, SUM(fh.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF fh
INNER JOIN ICECREAM_INFO ii ON fh.FLAVOR = ii.FLAVOR
GROUP BY ii.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER;


*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/133026 */

// 다시 한번 더 풀어보자