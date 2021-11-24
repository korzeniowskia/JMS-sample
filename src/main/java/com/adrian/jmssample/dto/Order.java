package com.adrian.jmssample.dto;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

@Value
public class Order implements Serializable {
  private String productName;
  private BigDecimal price;
  private String description;
}
