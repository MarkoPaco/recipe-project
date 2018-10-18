package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.findAll());

        return "index";
    }
}

