package pl.wwksals.tutostore.tutostore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wwksals.tutostore.tutostore2.model.User;

import java.util.Optional;

/**
 *This is the repository interface, this will be automatically implemented by Spring
 * in a bean with the same name with changing case The bean name will be userRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getByUsernameAndPassword(String username, String password);
    Optional<User> getByUsername(String username);
}

