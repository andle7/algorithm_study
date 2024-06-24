SELECT count(*) AS FISH_COUNT
 FROM FISH_INFO
  WHERE YEAR(TIME) = 2021; 

/* 

1단계
FISH_INFO 테이블을 출력해 본다.

SELECT ID, FISH_TYPE, LENGTH, TIME
 FROM FISH_INFO;

2단계
2021년도 물고기를 잡은 날짜 출력 해보기.

SELECT TIME AS FISH_COUNT
 FROM FISH_INFO
  WHERE YEAR(TIME) = 2021; 

3단계
2021년도에 잡은 물고기 수를 출력한다.

SELECT count(*) AS FISH_COUNT
 FROM FISH_INFO
  WHERE YEAR(TIME) = 2021; 


**/



/* https://school.programmers.co.kr/learn/courses/30/lessons/298516 */