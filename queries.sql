## Part 1: Test it with SQL

id int PK
employer varchar(255)
name varchar(255)
skills varchar(255)


## Part 2: Test it with SQL

select * from employer where location = "STL"

## Part 3: Test it with SQL

DROP TABLE job

## Part 4: Test it with SQL

SELECT name, description FROM skill where id in (select skills_id from job_skills)
ORDER BY name ASC