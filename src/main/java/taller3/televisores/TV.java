package taller3.televisores;

public class TV {
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
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
		if(estado == true && (canal >= 1 && volumen <= 120)) {
			this.canal = canal;
		} 
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
		if(estado == true && (volumen >= 0 && volumen <= 7)) {
			this.volumen = volumen;
		} 
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
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
		if(estado == true && (canal >= 1 && canal < 120)) {
			canal = canal + 1;
		} 
	}
	
	public void canalDown() {
		if(estado == true && (canal > 1 && canal <= 120)) {
			canal = canal - 1;
		} 
	}
	
	public void volumenUp() {
		if(estado == true && (volumen >= 0 && volumen < 7)) {
			volumen = volumen + 1;
		} 
	}
	
	public void volumenDown() {
		if(estado == true && (volumen > 0 && volumen <= 7)) {
			volumen = volumen - 1;
		} 
	}
}
