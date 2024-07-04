/**
    3월에 태어난 여성 회원 목록 출력하기
 */

SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE 1=1
  AND DATE_FORMAT(DATE_OF_BIRTH,'%m') = 3
  AND GENDER = 'W'
  AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC;