package ar.edu.untref.tdd;

public class Rango {

	private int limiteInferior;
	private int limiteSuperior;

	public Rango(int limiteInferior, int limiteSuperior) {
		
		if (limiteInferior > limiteSuperior) {
			Error rangoNoValido = new Error("Rango no válido");
			throw rangoNoValido;
		}
		
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
		
	}

	public boolean contiene(int numero) {
		boolean retorno = false;
		
		if (numero >= this.limiteInferior && numero <= this.limiteSuperior) {
			retorno = true;
		}
		return retorno;
	}

}
