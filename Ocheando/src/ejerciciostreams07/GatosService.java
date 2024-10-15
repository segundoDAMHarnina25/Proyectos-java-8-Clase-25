package ejerciciostreams07;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class GatosService {
	GatosRepository gatosRepository = new GatosRepository();

	public Set<Gato> getGatos() {
		return gatosRepository.getGatos();
	}

	public boolean addOneThousandCats() {
		GatoOM gatoOM = new GatoOM();
		int thousand = 10;
		do {
			gatosRepository.add(gatoOM.getRandomCat());
		} while (gatosRepository.size() < thousand);
		return true;
	}

	public Map<Raza, Long> findCatsByRace() {
		return gatosRepository.getGatos().stream().collect(Collectors.groupingBy(Gato::getRaza, Collectors.counting()));
	}

	public String findMostRepeatedName() {
		return gatosRepository.getGatos().stream()
				.collect(Collectors.groupingBy(Gato::getNombre, Collectors.counting()))
				.entrySet().stream()
				.max((a, b) -> (int)(b.getValue() - a.getValue()))
					.get()
					.getKey();
	}
	public OptionalDouble findAgeAverage() {
		return gatosRepository.getGatos().stream()
				.mapToDouble(Gato::getEdad).average();
	}
	
	public String findMostRepeatedNameSimplified() {
		return gatosRepository.getGatos().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Gato::getNombre)))
				.get().getNombre();
				
	}

	public Optional<Entry<Raza, Long>> findMostNumerousRace() {
		return findCatsByRace().entrySet().stream()
//			.collect(Collectors.toList())
//			.stream()
				.sorted((a, b) -> (int) (b.getValue() - a.getValue())).findFirst();
	}

	public Optional<Entry<Raza, Long>> findMostNumerousRaceMax() {
		return findCatsByRace().entrySet().stream().max((a, b) -> (int) (b.getValue() - a.getValue()));
	}
}