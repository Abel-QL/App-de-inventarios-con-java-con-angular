package zd.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zd.inventarios.model.Producto;

@SpringBootApplication
public class InventariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventariosApplication.class, args);

        Producto producto = new Producto();
        producto.setName("Camisa");
        producto.setDescripcion("Camisa roja talla S marca polo");
        producto.setPrice(900.02);
        producto.setStock(10);
        System.out.println(producto);

    }

}
