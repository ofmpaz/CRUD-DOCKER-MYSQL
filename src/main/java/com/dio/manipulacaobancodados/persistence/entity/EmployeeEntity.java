package com.dio.manipulacaobancodados.persistence.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class EmployeeEntity {

    private long id;
    private String name;
    private OffsetDateTime birthDate;
    private BigDecimal salary;
}
