package ru.ntr.springbootapp.service;

import ru.ntr.springbootapp.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(int id);

    ProductDto save(ProductDto productDto);

    void delete(int id);
}
