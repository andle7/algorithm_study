SELECT
    FLAVOR
FROM 
    FIRST_HALF
WHERE 
     FLAVOR = 'strawberry' OR FLAVOR = 'melon';


/*
1단계
SELECT SHIPMENT_ID,	FLAVOR,	TOTAL_ORDER
FROM FIRST_HALF;

2단계
SELECT SHIPMENT_ID,	FLAVOR,	TOTAL_ORDER
FROM FIRST_HALF
WHERE TOTAL_ORDER > 3000;

3단계
//
SELECT SHIPMENT_ID, FLAVOR, TOTAL_ORDER
FROM FIRST_HALF
WHERE TOTAL_ORDER > 3000 AND INGREDIENT_TYPE LIKE 'fruit%';

3단계
SELECT 
    SHIPMENT_ID, 
    FLAVOR, 
    TOTAL_ORDER,
    IF(FLAVOR LIKE '%chocolate%', 'sugar_based',
       IF(FLAVOR = 'strawberry' OR FLAVOR = 'melon', 'fruit_based', NULL)) AS INGREDIENT_TYPE
FROM 
    FIRST_HALF
WHERE 
    FLAVOR LIKE '%chocolate%' OR FLAVOR = 'strawberry' OR FLAVOR = 'melon';


4단계
SELECT
    FLAVOR, 
    IF(FLAVOR LIKE '%chocolate%', 'sugar_based',
       IF(FLAVOR = 'strawberry' OR FLAVOR = 'melon', 'fruit_based', NULL)) AS INGREDIENT_TYPE
FROM 
    FIRST_HALF
WHERE 
    FLAVOR LIKE '%chocolate%' OR FLAVOR = 'strawberry' OR FLAVOR = 'melon';


5단계
SELECT
    FLAVOR
FROM 
    FIRST_HALF
WHERE 
     FLAVOR = 'strawberry' OR FLAVOR = 'melon';

*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/133025 */