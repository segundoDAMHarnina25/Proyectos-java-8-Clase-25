package ejerciciosstreams01;

import java.util.Set;

public class Apuesta {
	public Set<Integer> bolasRoja;
	public int bolaAzul;

	public Apuesta(Set<Integer> bolasRoja, int bolaAzul) {
		super();
		this.bolasRoja = bolasRoja;
		this.bolaAzul = bolaAzul;
	}

	public boolean comprobarSorteo(BolaDobleColor sorteo2) {
		return bolasRoja.contains(sorteo2.getRoja())&&
		bolaAzul==sorteo2.getAzul();
	}

}