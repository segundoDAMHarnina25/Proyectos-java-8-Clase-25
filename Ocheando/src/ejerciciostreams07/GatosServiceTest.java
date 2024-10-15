package ejerciciostreams07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GatosServiceTest {
	GatosService gatosService;
	
	@BeforeEach
	public void beforeEach() {
		gatosService = new GatosService();
		assertTrue(gatosService.addOneThousandCats());

	}
	
	@Test
	void testByName() {
		String mostRepeatedName = gatosService.findMostRepeatedName();
		String mostRepeatedNameSimplified = gatosService.findMostRepeatedNameSimplified();
		assertEquals(mostRepeatedName,mostRepeatedNameSimplified);
	}
	
	@Ignore
	void testAddOneThousandCats()  {
		Stream<Gato> stream = gatosService.getGatos().stream();
		assertEquals(1000,gatosService.getGatos().size());
	}
	
	@Test
	void testCatsByRace() {
		gatosService.addOneThousandCats();
	}
	
}
