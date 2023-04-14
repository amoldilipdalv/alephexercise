package alephlabs.exercise.repository;

import alephlabs.exercise.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Test, Integer> {

}
