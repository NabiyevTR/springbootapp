package ru.ntr.springbootapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ntr.springbootapp.dto.ProductDto;
import ru.ntr.springbootapp.mapper.ProductMapper;
import ru.ntr.springbootapp.repository.ProductRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> findAll() {
        return ProductMapper.fromProducts(productRepository.findAll());
    }

    @Override
    public ProductDto findById(int id) {
        return
                ProductMapper.fromProduct(productRepository.findById(id));
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        productRepository.save(ProductMapper.toProduct(productDto));
        return productDto;
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }


}
