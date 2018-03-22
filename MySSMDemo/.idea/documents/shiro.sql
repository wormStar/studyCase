create DATABASE t_shiro DEFAULT CHARSET utf8;

create TABLE users(
  username varchar(100),
  password varchar(100),
  password_salt VARCHAR(100)
);

create TABLE user_roles(
  username varchar(100),
  role_name varchar(100)
);

CREATE TABLE roles_permissions(
  role_name VARCHAR(100),
  permission VARCHAR(100)
);

create TABLE t_user(
  id bigint PRIMARY KEY auto_increment,
  name varchar(50) not null UNIQUE ,
  password VARCHAR(100) not null
);

create TABLE t_role(
  id bigint PRIMARY KEY auto_increment,
  name varchar(50) not null,
  description VARCHAR(200)
);

create TABLE t_user_role(
  id bigint PRIMARY KEY auto_increment,
  user_id bigint NOT NULL ,
  role_id bigint NOT NULL
);

create TABLE t_module(
  id bigint PRIMARY KEY auto_increment,
  name varchar(50) not null,
  description varchar(200)
);

create TABLE t_permission(
  id bigint PRIMARY KEY auto_increment,
  name varchar(200) not null,
  des_zh varchar(200),
  module bigint
);

CREATE TABLE t_role_permission(
  id bigint PRIMARY KEY auto_increment,
  role_id bigint not null,
  permission_id bigint not null
);