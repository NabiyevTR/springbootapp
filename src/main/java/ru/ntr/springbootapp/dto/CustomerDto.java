package ru.ntr.springbootapp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {

    private int id;

    private String name;
}
