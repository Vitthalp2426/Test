USE hr;
SELECT * FROM jobs;
SELECT * FROM jobs WHERE min_salary>3000 and max_salary<25000;
SELECT * FROM jobs WHERE  max_salary BETWEEN 3000 AND 20000;
SELECT * FROM jobs WHERE min_salary BETWEEN 4000 AND 15000;

SELECT * FROM jobs ORDER BY min_salary ASC;
SELECT * FROM jobs ORDER BY max_salary DESC;
SELECT * FROM jobs WHERE max_salary>10000;
SELECT * FROM jobs ORDER BY job_title DESC;
SELECT * FROM jobs WHERE min_salary<10000;