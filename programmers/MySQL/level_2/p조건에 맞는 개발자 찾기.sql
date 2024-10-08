SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS D
INNER JOIN SKILLCODES S
ON S.CODE & D.SKILL_CODE = S.CODE
WHERE S.NAME IN ('C#','Python')
ORDER BY ID;

/*
1단계
SELECT NAME, CATEGORY, CODE
FROM SKILLCODES;

SELECT ID, FIRST_NAME, LAST_NAME, EMAIL
FROM DEVELOPERS;

2단계
SELECT ID, FIRST_NAME, LAST_NAME, EMAIL
FROM DEVELOPERS
ORDER BY ID ASC;

3단계
SELECT NAME
FROM SKILLCODES
WHERE NAME = "Python" OR NAME = "C#"

4단계
SELECT 
    D.ID, 
    D.EMAIL, 
    D.FIRST_NAME, 
    D.LAST_NAME
FROM 
    DEVELOPERS D
JOIN 
    SKILLCODES S
ON 
    D.SKILL_CODE = S.CODE
WHERE 
    S.NAME = 'Python' OR S.NAME = 'C#'
ORDER BY 
    D.ID ASC;

5단계
SELECT
    id,
    email,
    first_name,
    last_name
FROM developers
WHERE
    skill_code & (
        SELECT SUM(code)
        FROM SKILLCODES
        WHERE NAME IN ("Python", "C#")
    ) != 0
ORDER BY ID


6단계
SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS D
INNER JOIN SKILLCODES S
ON S.CODE & D.SKILL_CODE = S.CODE
WHERE S.NAME IN ('C#','Python')
ORDER BY ID;

*/

/* https://school.programmers.co.kr/learn/courses/30/lessons/276034 */