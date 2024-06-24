SELECT concat(LENGTH, "cm") AS MAX_LENGTH 
FROM FISH_INFO
ORDER BY LENGTH DESC
LIMIT 1;

/*
1단계
FISH_INFO 테이블을 출력해 본다.

SELECT ID, FISH_TYPE, LENGTH, TIME
FROM FISH_INFO;


2단계
FISH_INFO 테이블에서 concat으로 하나의 문자열로 나들고있고
내림차순에서 제일 큰 값 1개에 cm를 붙여서
MAX_LENGTH 컬럼으로 출력

SELECT concat(LENGTH, "cm") AS MAX_LENGTH 
FROM FISH_INFO
ORDER BY LENGTH DESC
LIMIT 1;




*/


/* https://school.programmers.co.kr/learn/courses/30/lessons/298515 */