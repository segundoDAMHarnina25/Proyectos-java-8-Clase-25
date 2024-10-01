package ejerciciostreams06bis;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Alumno {
	private final List<Materias> materias=Arrays.asList(Materias.values());
	private List<Integer> notas;
	private String nombre;
	
	public Alumno(List<Integer> notas, String nombre) {
		super();
		this.notas = notas;
		this.nombre = nombre;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean alumnoAprobado() {
			int maximasSuspensas = 2;
			return this.getNotas().stream()
			.filter((nota)->{
				int minimaNotaAprobado = 5;
				return nota<minimaNotaAprobado;
			})
			.count()<maximasSuspensas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(materias, nombre, notas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(materias, other.materias) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(notas, other.notas);
	}
	
	
}
