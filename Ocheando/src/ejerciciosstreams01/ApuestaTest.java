package ejerciciosstreams01;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class ApuestaTest {

	@Test
	void testComprobar() {
		Apuesta apuesta = new Apuesta(Set.of(2, 4, 6, 12, 14, 24), 3);
		Sorteo sorteo=new Sorteo(new BolaDobleColor(6,3));
		assertTrue(apuesta.comprobarSorteo(sorteo.getBolaDobleColor()));
		sorteo=new Sorteo(new BolaDobleColor(1,3));
		assertFalse(apuesta.comprobarSorteo(sorteo.getBolaDobleColor()));
	}
	@Test
	void test() {
		int min = 0, max = 10;
		boolean banderaMin = false, banderaMax = false;
		for (int i = 0; i < 150; i++) {
			int aleatorio = new Sorteo().getAleatorio(max, min);
			if (aleatorio == min)
				banderaMin = true;
			if (aleatorio == max)
				banderaMax = true;
		}
		assertTrue(banderaMax);
		assertTrue(banderaMin);
	}

}
