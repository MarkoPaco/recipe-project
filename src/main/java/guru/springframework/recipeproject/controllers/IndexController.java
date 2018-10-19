package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String getIndexPage(Model model) {
        log.debug("I'm the controller!");
        model.addAttribute("recipes", recipeService.findAll());

        return "index";
    }
}

