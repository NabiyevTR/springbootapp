package ru.ntr.springbootapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ntr.springbootapp.dto.CustomerDto;
import ru.ntr.springbootapp.mapper.CustomerMapper;
import ru.ntr.springbootapp.model.Customer;
import ru.ntr.springbootapp.repository.CustomerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> findAll() {
        return CustomerMapper.fromCustomers(
                customerRepository.findAll());
    }

    @Override
    public CustomerDto findById(int id) {
        return CustomerMapper.fromCustomer(
                customerRepository.findById(id)
        );
    }
}
