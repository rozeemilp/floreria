package dao;
import java.util.List;

import model.Producto;


public interface ProductoDAO  {
	public List <Producto> lista();
	public Producto editar(int id);
	public boolean guardar(Producto producto);
	public boolean eliminar(int id);

}
