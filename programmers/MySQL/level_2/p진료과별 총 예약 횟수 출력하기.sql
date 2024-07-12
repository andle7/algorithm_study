SELECT MCDP_CD AS 진료과코드, COUNT(*) AS 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD LIKE '%-05-%'
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, 진료과코드 ASC;

/*
1단계
SELECT APNT_YMD, APNT_NO, PT_NO, MCDP_CD, MDDR_ID, APNT_CNCL_YN, APNT_CNCL_YMD
FROM APPOINTMENT;

2단계
SELECT MCDP_CD AS 진료과코드, COUNT(*) AS 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD LIKE '%-05-%'
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, 진료과코드 ASC;

*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/132202 */