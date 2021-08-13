package com.company.pizza.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.OrderItem;

@UiController("pizza_OrderItem.browse")
@UiDescriptor("order-item-browse.xml")
@LookupComponent("orderItemsTable")
@LoadDataBeforeShow
public class OrderItemBrowse extends StandardLookup<OrderItem> {
}