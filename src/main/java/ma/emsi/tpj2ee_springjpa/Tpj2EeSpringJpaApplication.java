package ma.emsi.tpj2ee_springjpa;
import ma.emsi.tpj2ee_springjpa.entities.Product;
import ma.emsi.tpj2ee_springjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication

public class Tpj2EeSpringJpaApplication  implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tpj2EeSpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(1,"SADIK",12,12));
        productRepository.save(new Product(2,"SADIK1",17,14));
        productRepository.save(new Product(3,"SADIK2",155,19));
        List<Product> Products = productRepository.findAll();
        Products.forEach(s->System.out.println(s.toString()));
        Product s= productRepository.findById(Long.valueOf(1)).get();
        System.out.println("****************************************");
        System.out.println(s.toString());
        System.out.println("****************************************");
        List<Product> pc= productRepository.findByNameContains("ou");
        pc.forEach(System.out::println);
        System.out.println("*******************2222*********************");
        List<Product> pc1= productRepository.searchby("%u%");
        pc1.forEach(System.out::println);

        System.out.println("*******************33333*********************");
        List<Product> pc3= productRepository.findByPrixGreaterThan(16);
        pc3.forEach(System.out::println);

        System.out.println("*******************33333 ++v2*********************");
        List<Product> pc4= productRepository.searchbyPrice(16);
        pc4.forEach(System.out::println);

    }
}

