/**
  조건에 맞는 개발자 찾기
 */

SELECT
    ID,
    EMAIL,
    FIRST_NAME,
    LAST_NAME
FROM DEVELOPERS
WHERE 1=1
    AND SKILL_CODE &(
        SELECT
            CODE
        FROM SKILLCODES
        WHERE 1=1
            AND NAME LIKE 'Py%'
    ) OR SKILL_CODE&(
            SELECT
                CODE
            FROM SKILLCODES
            WHERE 1=1
                AND NAME LIKE 'C#'
            )
ORDER BY ID;
