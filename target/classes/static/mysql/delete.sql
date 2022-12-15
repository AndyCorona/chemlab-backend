delete from t_user
where id = :v_id;

delete from t_group
where id = :v_id;

delete from t_project
where id = :v_id;

delete from t_reaction
where id = :v_id;

delete from t_version
where id = :v_id;

delete from t_template
where id = :v_id;