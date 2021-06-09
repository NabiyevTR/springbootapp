package ru.ntr.springbootapp.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.ntr.springbootapp.model.Customer;
import ru.ntr.springbootapp.model.Product;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {

    private final EntityManager entityManager;

    public List<Customer> findAll() {
        return entityManager.createNativeQuery("SELECT * FROM customers", Customer.class).getResultList();
    }

    public Customer getById(int id) {
        return entityManager.find(Customer.class, id);
    }

}
