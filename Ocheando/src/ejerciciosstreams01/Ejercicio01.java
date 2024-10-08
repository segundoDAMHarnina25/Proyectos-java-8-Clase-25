package ejerciciosstreams01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio01 {
//	1. Genere 10 n�meros aleatorios que van del 1 al 100
//	y col�quelos en una coleccion. Coloque los n�meros mayores
//	o iguales a 10 en la coleccion 
//	en un conjunto de listas e impr�malos en la consola.
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Integer[] arr= new Integer[10]; // Indica la longitud
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		//20 numero aleatorios de 1 a 100
		//Forma alternativa con p. declarativa
		List<Integer> collect = new Random()
				.ints(1, 100)
				.limit(20)
				.boxed()
				.collect(Collectors.toList());
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 10)
				al.add(arr[i]);
		}
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		List<Integer> listaguay = filtradorGuay(arr);
		System.out.println(listaguay);
	}

	public static List<Integer> filtradorGuay(Integer[] asList) {
		return Arrays.asList(asList).stream()
			.filter(valor->
					valor>10)
			.collect(Collectors.toList());
	}
}
