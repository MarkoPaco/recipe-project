package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
