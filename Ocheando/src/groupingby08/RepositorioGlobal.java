package groupingby08;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RepositorioGlobal {

	private List<Animal> animales;
	private List<Persona> personas;

	public RepositorioGlobal() {
		super();
		this.animales = AnimalMother.createAnimales();
		this.personas = PersonaMother.createPersonas();
	}

	// 1
	// Agrupar animales por especie
//	Agrupa los animales por su especie y muestra cuántos animales hay de cada especie.

	public Map<String, Long> getAnimalesBySpecies() {
		return animales.stream().collect(Collectors.groupingBy(Animal::getEspecie, Collectors.counting()));
	}

	// 2
	public Map<Boolean, List<Animal>> getTotalWeightByDiet() {
		return animales.stream().collect(Collectors.groupingBy(Animal::isCarnivoro));
	}

	/*
	 * 3 Agrupar animales por décadas de nacimiento
	 * 
	 * Agrupa los animales según la década en que nacieron.
	 */

	public Map<Integer, List<Animal>> getAnimalsByBirthDecade() {
		return animales.stream()
				.collect(Collectors.groupingBy(animal -> animal.getFechaNacimiento().getYear() / 10 * 10));
	}

	/*
	 * 4. Agrupar animales por si pesan más o menos de 500 kg
	 * 
	 * Agrupa los animales en dos grupos: los que pesan más de 500 kg y los que
	 * pesan menos o igual a 500 kg.
	 */
	public Map<Boolean, List<Animal>> getAnimalsByWeightOverWeight(int weight) {
		return animales.stream().collect(Collectors.groupingBy(animal -> animal.getPeso() > weight));
	}

	/*
	 * 5. Agrupar animales por año de nacimiento
	 * 
	 * Agrupa los animales según el año en que nacieron.
	 */
	public Map<Integer, List<Animal>> getAnimalsByBirthYear() {
		return animales.stream().collect(Collectors.groupingBy(animal -> animal.getFechaNacimiento().getYear()));
	}

	/*
	 * 6. Agrupar por dieta y contar el número de animales en cada grupo
	 * 
	 * Agrupa los animales por si son carnívoros o herbívoros, y cuenta cuántos hay
	 * en cada grupo.
	 */
	public Map<Boolean, Long> getAmountAnimalsByDiet() {
		return animales.stream().collect(Collectors.groupingBy(Animal::isCarnivoro, Collectors.counting()));
	}

	/*
	 * 7. Agrupar animales por especie y sumar sus pesos
	 * 
	 * Agrupa los animales por especie y suma el peso total de cada grupo.
	 */
	public Map<String, Double> getTotalWeightByEspecies() {
		return animales.stream()
				.collect(Collectors.groupingBy(Animal::getEspecie, Collectors.summingDouble(Animal::getPeso)));
	}

	/*
	 * 8. Agrupar por dieta y calcular el peso promedio de los animales
	 * 
	 * Agrupa los animales por si son carnívoros o herbívoros, y calcula el peso
	 * promedio de cada grupo.
	 */
	public Map<Boolean, Double> geAvegerWeightbyDiet() {
		return animales.stream()
				.collect(Collectors.groupingBy(Animal::isCarnivoro, Collectors.averagingDouble(Animal::getPeso)));
	}

	/*
	 * 9. Agrupar animales por especies y obtener el animal más pesado de cada grupo
	 */
	public Map<String, Optional<Animal>> getMostHeavyAnimalByEspecie() {
		return animales.stream().collect(Collectors.groupingBy(Animal::getEspecie,
				Collectors.maxBy(Comparator.comparingDouble(Animal::getPeso))));
	}

	/*
	 * 10. Agrupar animales por si nacieron antes o después del año 2015
	 */
	public Map<Boolean, List<Animal>> getAnimalesBeforeAndAfterSelectedYear(int selectedYear) {
		return animales.stream()
				.collect(Collectors.groupingBy(ani -> ani.getFechaNacimiento().getYear() > selectedYear));
	}
}
