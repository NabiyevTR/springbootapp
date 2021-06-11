package ru.ntr.springbootapp.service;

import ru.ntr.springbootapp.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);


}
