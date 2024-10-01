package ejerciciostreams06bis;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class testAlumnoOm {

	@Test
	void test() {
		int i = 4;
		List<Alumno> alumnos = AlumnoOM.getAlumnos();
		assertEquals(i, alumnos.size());
		alumnos.stream()
			.forEach((alumno)->{
				int j = 7;
				assertEquals(j, alumno.getNotas().size());
			});
		List<Alumno> alumnosStreams = AlumnoOM.getAlumnosStreams();
		assertEquals(alumnosStreams,alumnos);
	}

}
