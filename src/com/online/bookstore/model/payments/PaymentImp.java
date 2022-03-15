/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.online.bookstore.model.payments;

import com.online.bookstore.model.order.Order;
import com.online.bookstore.model.order.Order;
import com.online.bookstore.model.order.Order;
import com.online.bookstore.model.order.OrderImpl;

/**
 *
 * @author bibok
 */
public class PaymentImp implements PaymentInterface{
    
    public String pay(Order order){
        
        order.setPaymentReceived(true);
        return "The Payment is done : ";
    }
}
