package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
