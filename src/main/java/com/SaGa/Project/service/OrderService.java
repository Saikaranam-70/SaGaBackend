package com.SaGa.Project.service;

import com.SaGa.Project.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order addOrder(Order order, String adminId);

    Order updateOrder(Order updatedOrder);

    List<Order> getAllOrders(String adminUserId);

    Order getOrderById(String orderId, String adminUserId);

    List<Order> getUserOrders(String userId);
}
