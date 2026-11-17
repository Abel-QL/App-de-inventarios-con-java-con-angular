package zd.inventarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zd.inventarios.model.Producto;

public interface IProductoRepository  extends JpaRepository <Producto,Integer> {
}
