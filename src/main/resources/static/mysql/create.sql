create table if not exists chemlab.t_group
(
    id          int auto_increment comment '编号 群组 Id(非空)'
        primary key,
    uuid        varchar(100) null comment '群组唯一标识符(非空)',
    name        varchar(100) null comment '名字 群组名字(非空)',
    slogon      varchar(400) null comment '标语 群组标语(可空)',
    member_ids  json         null comment '成员列表 群组的所有成员(可空)',
    project_ids json         null comment '项目列表 群组的所有项目(可空)',
    create_date datetime     null comment '创建日期 群组创建时间(非空)',
    creator_id  int          null comment '创建者 群组的创建者 ID(非空)',
    back_up1    varchar(255) null comment '冗余列1 冗余列1',
    back_up2    varchar(255) null comment '冗余列2 冗余列2'
)
    comment '群组';

create table if not exists chemlab.t_project
(
    id           int auto_increment comment '编号 项目唯一自增主键 Id(非空) '
        primary key,
    name         varchar(200) null comment '项目名 项目名称(可空)',
    create_date  datetime     null comment '创建日期 项目创建时间(非空)',
    creator_id   int          null comment '创建者 项目的创建者(非空)',
    reaction_ids json         null comment '实验列表 项目所拥有的所有实验集合(可空)',
    is_group     bit          null comment '标识项目类别 标识项目属于群组还是个人(非空)',
    back_up1     varchar(255) null comment '冗余列1 冗余列1',
    back_up2     varchar(255) null comment '冗余列2 冗余列2'
)
    comment '项目';

create table if not exists chemlab.t_reaction
(
    id          int auto_increment comment '编号 实验唯一自增长ID(非空)'
        primary key,
    creator_id  int          null comment '创建者 实验的创建者(非空)',
    version_ids json         null comment '版本列表 实验的版本列表(非空)',
    back_up1    varchar(255) null comment '冗余列1 冗余列1',
    back_up2    varchar(255) null comment '冗余列2 冗余列2'
)
    comment '实验';

create table if not exists chemlab.t_template
(
    id          int auto_increment comment '编号 模版唯一自增长ID(非空)'
        primary key,
    creator_id  int          null comment '创建者 模版创建者(非空)',
    name        varchar(100) null comment '名称 模版名称(非空)',
    data        varchar(255) null comment '数据 模版中保存的序列化数据(可空)',
    create_date datetime     null comment '创建日期 模版的创建时间(非空)',
    back_up1    varchar(255) null comment '冗余列1 冗余列1',
    back_up2    varchar(255) null comment '冗余列2 冗余列2'
)
    comment '模版';

create table if not exists chemlab.t_user
(
    id           int auto_increment comment '编号 数据库自动生成的唯一 ID(非空)'
        primary key,
    name         varchar(100) null comment '名字 用户名字(唯一、非空)',
    email        varchar(255) null comment '邮箱 用户邮箱(唯一、非空)',
    password     varchar(100) null comment '密码 加密后的密码(非空)',
    create_date  datetime     null comment '创建日期 用户注册事件(非空)',
    update_date  datetime     null comment '更新时间 用户最近一次修改个人信息时间(非空)',
    school       varchar(100) null comment '学校 用户所在院校(可空)',
    field        varchar(100) null comment '研究领域 用户目前的研究领域(可空)',
    major        varchar(100) null comment '专业 用户的专业(可空)',
    first_login  bit          null comment '首次登录 标识用户是否首次登录(非空)',
    slogon       varchar(400) null comment '标语 用户个人空间标语(非空)',
    logo         varchar(255) null comment '头像 用户头像路径(非空)',
    project_ids  json         null comment '项目列表 用户所拥有的项目列表(可空)',
    group_id     int          null comment '群组  用户所处于的群组(可空)',
    template_ids json         null comment '模版列表 用户所拥有的模版列表(可空)',
    back_up1     varchar(255) null comment '冗余列1 冗余列1',
    back_up2     varchar(255) null comment '冗余列2 冗余列2'
)
    comment '用户';

create table if not exists chemlab.t_version
(
    id          int auto_increment comment '编号 每个版本对应的唯一自增Id(非空)'
        primary key,
    date        datetime     null comment '日期 当前版本中用户所记录的时间(非空)',
    tags        varchar(200) null comment '标签 标签列表(可空)',
    creator_id  int          null comment '创建者 当前版本的创建者(非空)',
    name        varchar(200) null comment '实验名称 当前版本的实验名称(可空)',
    data        mediumtext   null comment '实验内容序列化数据 当前版本模块序列化后的数据(可空)',
    create_date datetime     null comment '创建日期 当前版本的创建时间(非空)',
    back_up1    varchar(255) null comment '冗余列1 冗余列1',
    back_up2    varchar(255) null comment '冗余列2 冗余列2'
)
    comment '版本控制表';

