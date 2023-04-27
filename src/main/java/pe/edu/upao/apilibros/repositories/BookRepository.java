package pe.edu.upao.apilibros.repositories;

import pe.edu.upao.apilibros.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}