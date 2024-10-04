package ejerciciostreams06bis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlumnoService {
	private AlumnosRepository alumnosRepository = new AlumnosRepository();

	public List<Alumno> getAlumnosAprobados() {
		List<Alumno> aprobados=new ArrayList();
		List<Alumno> all = alumnosRepository.findAll();
		for (Alumno alumno : all) {
			if(alumno.alumnoAprobado()) aprobados.add(alumno);
		}
		return aprobados;
	}
	public List<Alumno> getAlumnosAprobadosStream() {
		return alumnosRepository.findAll().stream()
				.filter(Alumno::alumnoAprobado)
				.toList();
	}

	public List<AlumnoResponse> getInfoAlumnosAprobados() {
		List<AlumnoResponse> respuesta=new ArrayList();
		List<Alumno> alumnosAprobados = getAlumnosAprobados();
		for (Alumno alumno : alumnosAprobados) {
			List<Materias> nombreMaterias=new ArrayList();
			List<Integer> notas = alumno.getNotas();
			for (int i = 0; i < notas.size(); i++) {
				if(notas.get(i)<5) nombreMaterias.add(Materias.getMateria(i));
			} 
			AlumnoResponse alumnoResponse = new AlumnoResponse(alumno.getNombre());
			alumnoResponse.addMateriaSuspensa(nombreMaterias);
			respuesta.add(alumnoResponse);
		}
		return respuesta;
		
	}
}
