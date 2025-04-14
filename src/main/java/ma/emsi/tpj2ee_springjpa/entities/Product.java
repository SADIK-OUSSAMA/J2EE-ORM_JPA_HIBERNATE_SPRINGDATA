package ma.emsi.tpj2ee_springjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    private long id;
    private String name;
    private double prix;
    private int quantity;
}

