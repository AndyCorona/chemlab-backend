update t_user
set
    id          = :v_id,
    name        = :v_name,
    email       = :v_email,
    password    = :v_password,
    create_date  = :v_create_date,
    update_date  = :v_update_date,
    school      = :v_school,
    field       = :v_field,
    major       = :v_major,
    first_login  = :v_fisrtLogin,
    slogon      = :v_slogon,
    logo        = :v_logo,
    group_id     = :v_groupId,
    back_up1     = :v_back_up1,
    back_up2     = :v_back_up2
where id = :v_id;

update t_group
set
    id          = :v_id,
    uuid        = :v_uuid,
    name        = :v_name,
    slogon      = :v_slogon,
    create_date  = :v_create_date,
    creator_id   = :v_creator_id,
    back_up1     = :v_back_up1,
    back_up2     = :v_back_up2
where id = :v_id;

update t_project
set
    id          = :v_id,
    name        = :v_name,
    create_date  = :v_create_date,
    creator_id   = :v_creator_id,
    is_group     = :v_isGroup,
    back_up1     = :v_back_up1,
    back_up2     = :v_back_up2
where id = :v_id;

update t_reaction
set
    id         = :v_id,
    creator_id  = :v_creator_id,
    back_up1    = :v_back_up1,
    back_up2    = :v_back_up2
where id = :v_id;

update t_version
set
    id          = :v_id,
    date        = :v_date,
    creator_id   = :v_creator_id,
    name        = :v_name,
    data        = :v_data,
    create_date  = :v_create_date,
    back_up1     = :v_back_up1,
    back_up2     = :v_back_up2
where id = :v_id;

update t_template
set
    id          = :v_id,
    creator_id   = :v_creator_id,
    name        = :v_name,
    data        = :v_data,
    create_date  = :v_create_date,
    back_up1     = :v_back_up1,
    back_up2     = :v_back_up2
where id = :v_id;


