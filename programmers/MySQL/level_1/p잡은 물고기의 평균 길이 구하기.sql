SELECT ROUND(AVG(COALESCE(LENGTH, 10)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;

/*
1단계
FISH_INFO 테이블을 출력해 본다.

SELECT ID, FISH_TYPE, LENGTH, TIME
 FROM FISH_INFO;

2단계
FISH_INFO의 LENGTH 컬럼 의 평균을 구해본다.

SELECT AVG(LENGTH) AS AVERAGE_LENGTH
   FROM FISH_INFO;
   
3단계
LENGTH 컬럼의 NULL값을 10으로 반환하고
소수점 3쨰짜리에서 반올림 하도록 한다.
참고로 COALESCE 함수는 SQL에서 여러 개의 인수를 받아 첫 번째로 NULL이 아닌 값을 반환하는 함수이다. 
주로 데이터베이스에서 NULL 값을 다른 값으로 대체할 때 사용된다.

SELECT ROUND(AVG(COALESCE(LENGTH, 10)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;


 */



/* https://school.programmers.co.kr/learn/courses/30/lessons/293259 */