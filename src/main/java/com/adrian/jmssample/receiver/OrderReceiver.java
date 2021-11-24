package com.adrian.jmssample.receiver;

import com.adrian.jmssample.dto.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {

  @JmsListener(containerFactory = "jmsFactory", destination = "order-queue")
  public void receive(Order order) {
    System.out.println("Create order: " + order);
  }
}
