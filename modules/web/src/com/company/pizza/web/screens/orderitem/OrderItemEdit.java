package com.company.pizza.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.OrderItem;

@UiController("pizza_OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {
}