-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE')
FROM patient
WHERE gend_cd = 'W' AND age <= 12
ORDER BY age DESC, pt_name asc;