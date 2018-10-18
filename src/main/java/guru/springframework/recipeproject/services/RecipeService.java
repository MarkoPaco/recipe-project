package guru.springframework.recipeproject.services;

import guru.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> findAll();
}
