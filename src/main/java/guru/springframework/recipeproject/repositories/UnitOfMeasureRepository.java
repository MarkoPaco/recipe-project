package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
