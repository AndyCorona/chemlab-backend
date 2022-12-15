select
    id          as 编号,
    name        as 名字,
    email       as 邮箱,
    password    as 密码,
    create_date  as 创建日期,
    update_date  as 更新时间,
    school      as 学校,
    field       as 研究领域,
    major       as 专业,
    first_login  as 首次登录,
    slogon      as 标语,
    logo        as 头像,
    group_id     as 群组 ,
    back_up1     as 冗余列1,
    back_up2     as 冗余列2
from t_user t;

select
    id          as 编号,
    uuid,
    name        as 名字,
    slogon      as 标语,
    create_date  as 创建日期,
    creator_id   as 创建者,
    back_up1     as 冗余列1,
    back_up2     as 冗余列2
from t_group t;

select
    id          as 编号,
    name        as 项目名,
    create_date  as 创建日期,
    creator_id   as 创建者,
    is_group     as 标识项目类别,
    back_up1     as 冗余列1,
    back_up2     as 冗余列2
from t_project t;

select
    id         as 编号,
    creator_id  as 创建者,
    back_up1    as 冗余列1,
    back_up2    as 冗余列2
from t_reaction t;

select
    id          as 编号,
    date        as 日期,
    creator_id   as 创建者,
    name        as 实验名称,
    data        as 实验内容序列化数据,
    create_date  as 创建日期,
    back_up1     as 冗余列1,
    back_up2     as 冗余列2
from t_version t;

select
    id          as 编号,
    creator_id   as 创建者,
    name        as 名称,
    data        as 数据,
    create_date  as 创建日期,
    back_up1     as 冗余列1,
    back_up2     as 冗余列2
from t_template t;