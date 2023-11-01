-- 코드를 입력하세요
SELECT DISTINCT COUNT(DISTINCT name) - COUNT(name = NULL) FROM animal_ins;

