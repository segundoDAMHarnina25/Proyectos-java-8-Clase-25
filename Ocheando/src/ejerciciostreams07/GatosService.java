package ejerciciostreams07;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GatosService {
	GatosRepository gatosRepository = new GatosRepository();

	public Set<Gato> getGatos() {
		return gatosRepository.getGatos();
	}

	public boolean addOneThousandCats() {
		GatoOM gatoOM = new GatoOM();
		int thousand = 1000;
		do {
			gatosRepository.add(gatoOM.getRandomCat());
		} while (gatosRepository.size() < thousand);
		return true;
	}

	public Map<Raza, Long> findCatsByRace() {
		return null;
	}

public Optional<Entry<Raza, Long>> findMostNumerousRace(){
	//y ahora la pregunta es: aqui o en el repo
	// de nuevo experto en informacion
	return null;
}
public Optional<Entry<Raza, Long>> findMostNumerousRaceMax(){
	//y ahora la pregunta es: aqui o en el repo
	// de nuevo experto en informacion
	return null;
}
}