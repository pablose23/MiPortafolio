package repasoExamen;

public class Pedido1 {
	private String codigoPedido;
	private String dniCliente;
	private String descuento;
	private int turno;
	
	public Pedido1(String codigoPedido, String dniCliente, String descuento, int turno) {
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.descuento = descuento;
		this.turno = turno;
	}

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", dniCliente=" + dniCliente + ", descuento=" + descuento
				+ ", turno=" + turno + "]";
	}
}
