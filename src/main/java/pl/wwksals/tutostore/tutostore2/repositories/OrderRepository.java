package pl.wwksals.tutostore.tutostore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wwksals.tutostore.tutostore2.model.Order;

/**
 *This is the repository interface, this will be automatically implemented by Spring
 * in a bean with the same name with changing case The bean name will be orderRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
