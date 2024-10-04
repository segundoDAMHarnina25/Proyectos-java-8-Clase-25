package ejerciciostreams07;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GatoOM {
	List<String> nombres = Arrays.asList("Pit�n", " Wifi", " Flash", " Apolo", " Rat�n", " Oreo", " Rayo", " Od�n", " Max", " Poker", "Alan",
			" Yael", " Otto", " Kuno", " Max", " Ian", " Kai", " Nic", " Roi", " Joe", " Vito", " Iker", "Ori�n",
			" Leo", " Khan", " Rajin", " Jade", " Tabby", " Kin", " Elvis", " Baboo", " Nilo", "Ninja", " Batman",
			" Night", " Dark", " Shadow", " Sauron", " Kuro", " Morito", " Tiz�n", " Salem", "Silver", " Bol�n",
			" Amaru", " Joel", " Luc", " Naim", " Teo", " Umi", " Dorian", " Adel" );

	byte edadMaxima = 7;

	public Gato getRandomCat() {
		Random randon=new Random();
		return new Gato(nombres.get(randon.nextInt(nombres.size())),(byte)randon.nextInt(edadMaxima+1),Raza.values()[randon.nextInt(Raza.values().length)]);
	}
}
