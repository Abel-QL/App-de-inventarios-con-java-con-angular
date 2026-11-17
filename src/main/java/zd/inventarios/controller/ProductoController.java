package zd.inventarios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zd.inventarios.model.Producto;
import zd.inventarios.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("inventario-app")//para hacer peticiones http
@CrossOrigin(value = "http://localhost:4200") //puerto default de angular
public class ProductoController {
    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")//htpp://localhost:8080/inventario-app/productos
    public List<Producto> getProductos() {
        List<Producto> productos = this.productoService.findAll();
        logger.info("Productos encontrados");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public Producto createProducto(@RequestBody Producto producto) {
        logger.info("Creando producto " + producto.toString());
        return this.productoService.save(producto);
    }
}