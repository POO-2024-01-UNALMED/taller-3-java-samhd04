package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV = numTV + 1;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if(estado == true && canal < 120) {
			canal = canal + 1;
		}
	}
	
	public void canalDown() {
		if(estado == true && canal > 1) {
			canal = canal - 1;
		}
	}
	
	public void volumenUp() {
		if(estado == true && volumen < 7) {
			volumen = volumen + 1;
		}
	}
	
	public void volumenDown() {
		if(estado == true && volumen > 0) {
			volumen = volumen - 1;
		}
	}
}
