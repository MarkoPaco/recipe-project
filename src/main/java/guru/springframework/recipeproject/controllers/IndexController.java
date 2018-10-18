package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.domain.Category;
import guru.springframework.recipeproject.domain.UnitOfMeasure;
import guru.springframework.recipeproject.repositories.CategoryRepository;
import guru.springframework.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is:" + categoryOptional.get().getId());
        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}

