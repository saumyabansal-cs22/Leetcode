# Write your MySQL query statement below
select a.student_id, a.student_name, sub.subject_name,
count(c.subject_name) as attended_exams
from Students a 
cross join Subjects sub
left join Examinations c 
on a.student_id=c.student_id and sub.subject_name=c.subject_name
group by a.student_id ,a.student_name ,sub.subject_name
order by a.student_id,sub.subject_name;
