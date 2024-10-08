package groupingby08;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class TesingGrouping {
	List<Persona> personas = PersonaMother.createPersonas();
	
	@Test
	void test01() {
		Map<Byte, List<Persona>> collect = personas.stream()
			.collect(Collectors.groupingBy(Persona::getEdad));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test02() {
		Map<Byte, Set<Persona>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.toSet()));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test03() {
		Map<Byte, Long> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.counting()));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test04() {
		Map<Byte, Double> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.averagingDouble(Persona::getSaldo)));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test05() {
		Map<Byte, Map<Categoria, List<Persona>>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria)));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test06() {
		Map<Byte, Map<Categoria, Long>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria,
								Collectors.counting())));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test07() {
		ToDoubleFunction ff;
		Map<Byte, Map<Categoria, Double>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria,
								Collectors.averagingDouble(Persona::getSaldo))));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}

}
