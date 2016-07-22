package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionDb;
import factory.FactoryConnectionDb;
import model.Producto;

public class ProductoDaoImpl implements ProductoDAO {

	ConnectionDb conn;
	
	public ProductoDaoImpl() {

	}
	
	public ProductoDaoImpl(ConnectionDb conn) {
		super();
		//this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
	}

	@Override
	public List<Producto> lista() {
		this.conn = FactoryConnectionDb.open();
		StringBuilder sql= new StringBuilder();
		sql.append("SELECT * FROM producto");
		
		List<Producto> lista= new ArrayList<Producto>();
		try{
			ResultSet rs= this.conn.query(sql.toString());
			while(rs.next()){
				Producto producto = new Producto();
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setEstado(rs.getInt("estado"));
				lista.add(producto);
			}
		}catch(Exception e){
			}finally{
				this.conn.close();
			}
		return lista;
		}
		
		

	@Override
	public Producto editar(int id) {
		this.conn = FactoryConnectionDb.open();
		Producto producto = new Producto();
		StringBuilder sql= new StringBuilder();
		sql.append("SELECT * FROM producto WHERE id * ").append(id);
		try{
			ResultSet rs= this.conn.query(sql.toString());
			while(rs.next()){
				
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setEstado(rs.getInt("estado"));
			}
		}catch(Exception e){
		}finally{
			this.conn.close();
		}
		return producto;		
	}

	@Override
	public boolean guardar(Producto producto) {
				this.conn = FactoryConnectionDb.open();
		
				boolean guardar = false;
				try{
					if(producto.getId()==0){ //new 
						StringBuilder sql= new StringBuilder();
						sql.append("INSERT INTO producto (nombre,estado) VALUES ('").append(producto.getNombre());
						sql.append("', ").append(producto.getEstado()).append(")");
						this.conn.execute(sql.toString());
					}else{//update
						StringBuilder sql= new StringBuilder();
						//Statement st = this.miConnection.conexion().createStatement();
						
						sql.append("UPDATE producto set id = ").append(producto.getId());
						sql.append(", nombre = '").append(producto.getNombre());
						sql.append("', estado = ").append(producto.getEstado()).append("WHERE id = ").append(producto.getId());
						this.conn.execute(sql.toString());
					}
				}catch(Exception e){
				}finally{
					this.conn.close();
				}
				
		return guardar;
					
	}

	@Override
	public boolean eliminar(int id) {

		this.conn = FactoryConnectionDb.open();
		boolean eliminar=  false;
		try{
			StringBuilder sql= new StringBuilder();
			sql.append("DELETE FROM producto WHERE id = ").append(id);
			this.conn.execute(sql.toString());
		}catch(Exception e){
		}finally{
			this.conn.close();
		}
		return eliminar;
	}

}
