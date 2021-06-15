package ru.ntr.springbootapp.service;

import org.springframework.data.domain.Page;
import ru.ntr.springbootapp.model.Product;

import java.util.List;

public interface ProductService {

    Page<Product> findAll(int pageNumber);

    Product findById(int id);

    void save(Product product);

    void delete(int id);
}
