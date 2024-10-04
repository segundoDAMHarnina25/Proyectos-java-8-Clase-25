package ejerciciostreams06bis;

import java.util.List;
import java.util.Optional;

public class AlumnosRepository {
	private List<Alumno> alumnos=AlumnoOM.getAlumnos();

	public Optional<Alumno> getByKey(String nombre){
		return alumnos.stream()
				.filter(alumno
						->alumno.getNombre().equals(nombre))
				.findFirst();
	}
	public float getEdadMedia() {
		int acumulador=0;
		int contador=0;
		for (Alumno alumno : alumnos) {
			contador++;
			acumulador+=alumno.getEdad();
		}
		return (float) acumulador/contador;
	}
	public float getEdadMediaStream() {
		return (float) alumnos.stream()
				.mapToInt(Alumno::getEdad)
				.average()
				.getAsDouble();
	}
	
	public List<Alumno> findAll() {
		return alumnos;
	}
	public double getNotaMedia(String nombre) {
		Optional<Alumno> alumno = getByKey(nombre);
		if(alumno.isPresent()) {
			return alumno.get().getMedia().getAsDouble();
		}
		return -1.0;
	}
}
