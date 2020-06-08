package zw.co.econet.jpaonetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.econet.jpaonetomany.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
