alter table PIZZA_TOPPING rename column ingredient_id to ingredient_id__u21004 ;
alter table PIZZA_TOPPING drop constraint FK_PIZZA_TOPPING_ON_INGREDIENT ;
drop index IDX_PIZZA_TOPPING_ON_INGREDIENT ;
