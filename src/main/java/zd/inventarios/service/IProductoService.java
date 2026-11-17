package zd.inventarios.service;

import zd.inventarios.model.Producto;

import java.util.List;

public interface IProductoService {
public List<Producto> findAll();
public Producto findById(Integer id);
public Producto save(Producto producto);
public void delete(Integer id);

}
