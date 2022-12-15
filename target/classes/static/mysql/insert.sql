insert into t_user
(id,
 name,
 email,
 password,
 create_date,
 update_date,
 school,
 field,
 major,
 first_login,
 slogon,
 logo,
 group_id,
 back_up1,
 back_up2)
values (2, /*id*/
        '名字2', /*name*/
        'david27@cloudflare.com', /*email*/
        '密码2', /*password*/
        STR_TO_DATE('2022-12-03 07:40:45', '%Y-%m-%d %H:%i:%s'), /*createDate*/
        STR_TO_DATE('2022-12-04 07:40:45', '%Y-%m-%d %H:%i:%s'), /*updateDate*/
        '学校2', /*school*/
        '研究领域2', /*field*/
        '专业2', /*major*/
        1, /*fisrtLogin*/
        '标语2', /*slogon*/
        '头像2', /*logo*/
        888, /*groupId*/
        '冗余列12', /*backUp1*/
        '冗余列22' /*backUp2*/
       );

insert into t_group
(id,
 uuid,
 name,
 slogon,
 create_date,
 creator_id,
 back_up1,
 back_up2)
values (2, /*id*/
        'uuid2', /*uuid*/
        '名字2', /*name*/
        '标语2', /*slogon*/
        STR_TO_DATE('2022-12-03 07:40:45', '%Y-%m-%d %H:%i:%s'), /*createDate*/
        7257, /*creatorId*/
        '冗余列12', /*backUp1*/
        '冗余列22' /*backUp2*/
       );

insert into t_project
(
    id,
    name,
    create_date,
    creator_id,
    is_group,
    back_up1,
    back_up2
)
values(
          2,          /*id*/
          '项目名2',  /*name*/
          STR_TO_DATE('2022-12-03 07:40:45','%Y-%m-%d %H:%i:%s'), /*createDate*/
          10484,      /*creatorId*/
          1,          /*isGroup*/
          '冗余列12', /*backUp1*/
          '冗余列22'  /*backUp2*/
      );

insert into t_reaction
(
    id,
    creator_id,
    back_up1,
    back_up2
)
values(
          2,         /*id*/
          9621,      /*creatorId*/
          '冗余列12', /*backUp1*/
          '冗余列22' /*backUp2*/
      );

insert into t_version
(
    id,
    date,
    creator_id,
    name,
    data,
    create_date,
    back_up1,
    back_up2
)
values(
          2,          /*id*/
          STR_TO_DATE('2022-12-04 07:40:45','%Y-%m-%d %H:%i:%s'), /*date*/
          10484,      /*creatorId*/
          '实验名称2', /*name*/
          '实验内容序列化数据2', /*data*/
          STR_TO_DATE('2022-12-03 07:40:45','%Y-%m-%d %H:%i:%s'), /*createDate*/
          '冗余列12', /*backUp1*/
          '冗余列22'  /*backUp2*/
      );

insert into t_template
(
    id,
    creator_id,
    name,
    data,
    create_date,
    back_up1,
    back_up2
)
values(
          2,          /*id*/
          522,        /*creatorId*/
          '名称2',    /*name*/
          '数据2',    /*data*/
          STR_TO_DATE('2022-12-03 07:40:45','%Y-%m-%d %H:%i:%s'), /*createDate*/
          '冗余列12', /*backUp1*/
          '冗余列22'  /*backUp2*/
      );