package ma.emsi.tpj2ee_springjpa.repository;
import ma.emsi.tpj2ee_springjpa.entities.Product;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String mc);
    List<Product> findByPrixGreaterThan(double prix);

    @Query("select p from Product p where p.name like :x")
    List<Product> searchby(@Param("x") String mc);


    @Query("select p from Product p where p.prix > :x")
    List<Product> searchbyPrice(@Param("x") double price);
}

