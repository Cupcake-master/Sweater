insert into users (id, username, password, is_active)
values (1, 'admin', '123', true);

insert into user_role (user_id, roles)
values (1, 'USER'), (1, 'ADMIN');