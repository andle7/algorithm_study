SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = "DOG" AND NAME LIKE "%EL%" AND NAME LIKE "%el%"
ORDER BY NAME ASC;

/*
1단계
SELECT ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS;

2단계
SELECT ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME LIKE "%EL%" AND NAME LIKE "%el%"
ORDER BY NAME ASC;

3단계
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = "DOG" AND NAME LIKE "%EL%" AND NAME LIKE "%el%"
ORDER BY NAME ASC;

*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/59047 */