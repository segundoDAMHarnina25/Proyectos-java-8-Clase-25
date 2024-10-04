package ejerciciostreams06bis;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class Alumno {
	private final List<Materias> materias = Arrays.asList(Materias.values());
	private List<Integer> notas;
	private String nombre;
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Alumno(List<Integer> notas, String nombre, int edad) {
		super();
		this.notas = notas;
		this.nombre = nombre;
		this.edad = edad;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public OptionalDouble getMedia() {
		return getNotas().stream()
				.mapToInt(Integer::intValue)
				.average();
	}

	public String getNombre() {
		return nombre;
	}

	public boolean alumnoAprobado() {
		int maximasSuspensas = 2;
		return this.getNotas().stream().filter((nota) -> {
			int minimaNotaAprobado = 5;
			return nota < minimaNotaAprobado;
		}).count() < maximasSuspensas;
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
