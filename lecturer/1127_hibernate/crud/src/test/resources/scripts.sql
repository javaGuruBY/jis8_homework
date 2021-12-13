select * from alumnus a
    join project p on a.project_id = p.project_id
    where p.project_id = 3;

select * from alumnus a
    join project p on a.project_id = p.project_id
    join mentor m on p.mentor_id = m.mentor_id
where p.mentor_id = 3;

select * from alumnus a
    join project p on a.project_id = p.project_id
    join mentor m on p.mentor_id = m.mentor_id
where p.mentor_id = 3 and a.project_id is not null;