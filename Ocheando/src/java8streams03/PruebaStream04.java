package java8streams03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaStream04 {
	public static void main(String[] args) {
		List<Integer> collect3 = Arrays.asList(8, 4, 5, 4, 3, 9);
		int primerRepetido = -1;
		boolean encontrado = false;
		for (int i = 0; i < collect3.size() - 1 && !encontrado; i++) {
			// aqui hacemos tal
			for (int j = i + 1; j < collect3.size(); j++) {
				if (collect3.get(i) == collect3.get(j)) {
					encontrado = true;
				}
			}
			// aqui esto otro
			if (encontrado) {
				primerRepetido = collect3.get(i);
			}
		}
		System.out.println("no streams " + primerRepetido);
		// y si el primero que se repite es el 4 no el nueve. hazlo convencional y
		// streams
		Integer orElse = collect3.stream()
			.filter((elementoInicial)->
					{return collect3.stream()
						.filter((otroElemento)->
							{return otroElemento==elementoInicial;})
						.count()>1;})
			.findFirst().orElse(-1);
		Integer orElse2 = collect3.stream()
			.filter((ei)->{
				int contador=0;
				if(collect3.contains(ei)) contador++;
				return contador>0;
			})
			.findFirst().orElse(-1);
		System.out.println("orElse "+orElse);
		System.out.println("orElse2 "+orElse2);
	}
}
