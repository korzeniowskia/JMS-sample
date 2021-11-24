package com.adrian.jmssample.controller;

import com.adrian.jmssample.dto.Order;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderContoller {

  private final JmsTemplate jmsTemplate;

  @PostMapping("/create")
  public void createOrder(@RequestBody Order order) {
    jmsTemplate.convertAndSend("order-queue", order);
  }
}
