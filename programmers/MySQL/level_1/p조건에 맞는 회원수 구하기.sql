SELECT count(*) AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 AND AGE >=20 AND AGE <=29;



/*
1단계
SELECT USER_ID, GENDER, AGE, JOINED
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 AND AGE >=20 AND AGE <29;

2단계
SELECT USER_ID AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 AND AGE >=20 AND AGE <=29;

3단계
SELECT count(*) AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 AND AGE >=20 AND AGE <=29;

*/
/* https://school.programmers.co.kr/learn/courses/30/lessons/131535 */