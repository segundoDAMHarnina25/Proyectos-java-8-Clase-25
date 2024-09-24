package optional02;

import java.util.ArrayList;
import java.util.Optional;

public class Arrayador {
	public ArrayList<String> getArray(String something) {
		if (something.equals("hola")) {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add(something);
			return arrayList;
		}
		return null;
	}
	public Optional<ArrayList<String>> getArrayOptional(String something) {
		if (something.equals("hola")) {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add(something);
			return Optional.of(arrayList);
		}
		return Optional.empty();
	}
}
