package ru.ntr.springbootapp.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.ntr.springbootapp.model.Product;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final EntityManager entityManager;

    public List<Product> findAll() {
        return entityManager.createNativeQuery("SELECT * FROM products", Product.class).getResultList();
    }

    public Product getById(int id) {
        return entityManager.find(Product.class, id);
    }

}
