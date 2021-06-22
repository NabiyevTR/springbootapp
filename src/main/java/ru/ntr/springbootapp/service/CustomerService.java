package ru.ntr.springbootapp.service;

import ru.ntr.springbootapp.dto.CustomerDto;
import ru.ntr.springbootapp.model.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> findAll();

    CustomerDto findById(int id);

}
