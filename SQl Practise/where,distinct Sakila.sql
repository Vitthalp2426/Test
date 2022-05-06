use hr;
select * from employees;
select * from departments;
select * from employees inner join departments on employees.department_id=departments.department_id;
select * from employees left join departments on employees.department_id=departments.department_id;
select * from employees right join departments on employees.department_id=departments.department_id;
select max(salary)from employees where salary<(select max(salary)from employees);
select  salary from (select distinct salary from employees order by salary desc limit 3)emp order by salary limit 1;
select salary as 4th_highest_salary from (select distinct salary from employees order by salary limit 4)emp order by salary desc limit 1;