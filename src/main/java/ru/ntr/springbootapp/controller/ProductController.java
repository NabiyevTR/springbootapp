package ru.ntr.springbootapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ntr.springbootapp.dto.ProductDto;
import ru.ntr.springbootapp.service.ProductService;

@Controller
@RequestMapping("/products")
@Slf4j
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping()
    public String showProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products/showAll";
    }

    @GetMapping("/{id}")
    public String showProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "products/show";
    }

    @GetMapping("/new")
    @Secured({"ROLE_ADMIN", "ROLE_SUPER_ADMIN", "ROLE_MANAGER"})
    public String addProduct(@ModelAttribute("product") ProductDto productDto) {
        return "products/new";
    }

    @PostMapping()
    @Secured({"ROLE_ADMIN", "ROLE_SUPER_ADMIN", "ROLE_MANAGER"})
    public String create(@ModelAttribute("product") ProductDto productDto) {
        productService.save(productDto);
        return "products/showAll";
    }

    @DeleteMapping("/{id}")
    @Secured({"ROLE_ADMIN", "ROLE_SUPER_ADMIN", "ROLE_MANAGER"})
    public String deleteProduct(@PathVariable("id") int id) {
        productService.delete(id);
        return "products/showAll";
    }

    @PatchMapping("/{id}")
    @Secured({"ADMIN", "SUPER_ADMIN", "MANAGER"})
    public String update(@ModelAttribute("product") ProductDto productDto , @PathVariable("id") int id) {
        productDto.setId(id);
        productService.save(productDto);
        return "products/showAll";
    }

}
