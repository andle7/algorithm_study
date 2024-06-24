SELECT ID, LENGTH
 FROM FISH_INFO
   WHERE ID NOT IN (4,5)
    ORDER BY LENGTH DESC, ID ASC
     LIMIT 10;

/*
1단계
FISH_INFO 테이블을 출력 해본다.

SELECT ID, FISH_TYPE,LENGTH, TIME
  FROM FISH_INFO

2단계
ID, LENGTH 컬럼만 출력 해본다.

SELECT ID, LENGTH
 FROM FISH_INFO;

3단계
물고기의 ID 4, 5를 제외한 나머지
라는 조건을 출력해본다.

SELECT ID, LENGTH
 FROM FISH_INFO
   WHERE ID NOT IN (4,5);

4단계
길이에 대하여 내림차순 정렬하고, 물고기의 ID에 대하여 오름참순 정렬을 한다.

SELECT ID, LENGTH
 FROM FISH_INFO
   WHERE ID NOT IN (4,5)
    ORDER BY LENGTH DESC, ID ASC;

5단계
가장 큰 물고기 10마리 라는 것에 대하여 고민하여
10마리로 제한 한다.

SELECT ID, LENGTH
 FROM FISH_INFO
   WHERE ID NOT IN (4,5)
    ORDER BY LENGTH DESC, ID ASC
     LIMIT 10;


*/




/*https://school.programmers.co.kr/learn/courses/30/lessons/298517 */

