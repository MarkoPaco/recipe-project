package guru.springframework.recipeproject.services;

import guru.springframework.recipeproject.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long inredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
