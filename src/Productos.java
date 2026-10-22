
public class Productos {
	private String codigo;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor;
	private String descripcion;
	private int cantidadStock;
	private int precioVenta;
	private int precioProveedor;
	
	public Productos(String codigo, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, int cantidadStock, int precioVenta, int precioProveedor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cantidadStock = cantidadStock;
		this.precioVenta = precioVenta;
		this.precioProveedor = precioProveedor;
	}

	public Productos() {
		this.codigo = "";
		this.nombre = "";
		this.gama = "";
		this.dimensiones = "";
		this.proveedor = "";
		this.descripcion = "";
		this.cantidadStock = 0;
		this.precioVenta = 0;
		this.precioProveedor = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getPrecioProveedor() {
		return precioProveedor;
	}

	public void setPrecioProveedor(int precioProveedor) {
		this.precioProveedor = precioProveedor;
	}

	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", gama=" + gama + ", dimensiones=" + dimensiones
				+ ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", cantidadStock=" + cantidadStock
				+ ", precioVenta=" + precioVenta + ", precioProveedor=" + precioProveedor + "]";
	}
}
