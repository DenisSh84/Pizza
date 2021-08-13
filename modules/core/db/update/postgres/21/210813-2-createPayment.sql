alter table PIZZA_PAYMENT add constraint FK_PIZZA_PAYMENT_ON_ORDER foreign key (ORDER_ID) references PIZZA_ORDER(ID);
alter table PIZZA_PAYMENT add constraint FK_PIZZA_PAYMENT_ON_PIZZA foreign key (PIZZA_ID) references PIZZA_PIZZA(ID);
create index IDX_PIZZA_PAYMENT_ON_ORDER on PIZZA_PAYMENT (ORDER_ID);
create index IDX_PIZZA_PAYMENT_ON_PIZZA on PIZZA_PAYMENT (PIZZA_ID);
