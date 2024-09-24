package java8streams03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStream0125 {
	
	// 00 Creando la coleccion
	public static void main(String[] args) {
		List<String> cadenas=List.of("periplo", "nocturno", "cempua","periplo");
		//abro el flujo
		Stream<String> stream = cadenas.stream();
		//si uso un metodo que no retorna stream, entonces cierro el flujo
		System.out.println(stream.count());
//		System.out.println(stream.count());
		Stream<String> map = cadenas.stream().map((String cadena)->{return cadena.toUpperCase();});
		Stream<String> distinct = map.distinct();
		List<String> collect = distinct.collect(Collectors.toList());
		collect.forEach((elemento)->{System.out.println(elemento);});
		
		cadenas.stream()
			.map((String cadena)->{return cadena.toUpperCase();})
			.distinct()
			.collect(Collectors.toList())
			.forEach((elemento)->{System.out.println(elemento);});
	}


}
