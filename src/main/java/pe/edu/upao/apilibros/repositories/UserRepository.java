package pe.edu.upao.apilibros.repositories;

import pe.edu.upao.apilibros.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {

    Optional <User> findByUsername (String username);

}