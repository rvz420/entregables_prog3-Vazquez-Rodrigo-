package tp3ej1GDlista;

public class Adyacente {
	
	Nodo destino;
	double peso;
	
	public Adyacente(Nodo destino) {
		this.destino = destino;
	}
	
	public Adyacente(Nodo destino, double peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

}
