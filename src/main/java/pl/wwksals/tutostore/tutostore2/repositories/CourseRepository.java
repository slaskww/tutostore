package pl.wwksals.tutostore.tutostore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wwksals.tutostore.tutostore2.model.Course;

/**
 *This is the repository interface, this will be automatically implemented by Spring
 * in a bean with the same name with changing case The bean name will be courseRepository
 */

public interface CourseRepository extends JpaRepository<Course, Long> {
}
