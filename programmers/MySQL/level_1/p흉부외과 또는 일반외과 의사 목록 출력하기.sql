SELECT DR_NAME,DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN('CS','GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;

/*
1단계
SELECT DR_NAME,	DR_ID, LCNS_NO, HIRE_YMD, MCDP_CD, TLNO
FROM DOCTOR;

2단계
SELECT DR_NAME,	DR_ID, LCNS_NO, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR;

3단계
SELECT DR_NAME,DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN('CS','GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;

 */

/* https://school.programmers.co.kr/learn/courses/30/lessons/132203 */