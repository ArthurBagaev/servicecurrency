package ru.bagaev.spring.micro.servicecurrency.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceCurrency {

    private String datetime;
    private String name;
    private Double price;

}