package tutorial.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.com.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
