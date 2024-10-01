package ejerciciostreams06bis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlumnoOM {
	private static String[] nombres = { "juan", "esteban", "arturo", "felipe" };
	private static int notas[][] = { 
			{5,6,7,5,6,4,8}, 
			{5,6,7,4,4,8,8}, 
			{6,6,6,6,6,6,6}, 
			{5,5,4,5,5,6,7} };

	public static List<Alumno> getAlumnos() {
		LinkedList<Alumno> alumnos=new LinkedList<>();
		for (int i = 0; i < nombres.length; i++) {
			alumnos.add(new Alumno(Arrays.stream(notas[i])
				      					.boxed()
				      					.collect(Collectors.toList()), nombres[i]));
		}
		return alumnos;
	}
	public static List<Alumno> getAlumnosStreams() {
		return null;
				
	}
}
