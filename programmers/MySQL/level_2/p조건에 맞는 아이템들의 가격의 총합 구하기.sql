SELECT SUM(PRICE) AS TOTAL_PRICE
FROM  ITEM_INFO
WHERE RARITY LIKE "LEGEND";

/*
1단계
SELECT ITEM_ID, ITEM_NAME, RARITY, PRICE
FROM  ITEM_INFO;

2단계
SELECT SUM(PRICE) AS TOTAL_PRICE
FROM  ITEM_INFO
WHERE RARITY LIKE "LEGEND";

*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/273709 */