package ejerciciosstream04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio02 {
	ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void main(String[] args) {
		new Ejercicio02();
	}

	// Duplica los kilometros mapeando
	public Ejercicio02() {
		super();
		vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
		vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
		vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
		vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
		vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
		vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
		vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));
		//
		vehiculos.forEach((vehiculo) -> {
			vehiculo.setKilometros(vehiculo.getKilometros() * 2);
		});
		List<Vehiculo> alteraCollecion = alteraCollecion();
	}

	public List<Vehiculo> alteraCollecion() {
		return vehiculos.stream()
				.map((vehiculo)->{
					vehiculo.setKilometros(vehiculo.getKilometros() * 2);
					return vehiculo;})
				.collect(Collectors.toList());

	}
}
