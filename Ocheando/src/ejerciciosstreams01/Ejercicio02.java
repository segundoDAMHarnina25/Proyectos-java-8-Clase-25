package ejerciciosstreams01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejercicio02 {
	/*
	 * La matriz conocida almacena un lote de n�meros QQ. El n�mero QQ m�s largo es
	 * de 11 d�gitos y el m�s corto es de 5 d�gitos String [] strs = {"12345",
	 * "67891", "12347809933", "98765432102", "67891", "12347809933" }. Almacene
	 * todos los n�meros qq en la matriz en LinkedList, elimine los elementos
	 * repetidos en la lista e imprima todos los elementos en la lista con un
	 * iterador y un bucle for mejorado.
	 */
	public static void main(String[] args) {
		LinkedList<String> al = getListQQ();
		for (int j = 0; j < al.size(); j++) {
			for (int k = j + 1; k < al.size(); k++) {
				if (al.get(j).equals(al.get(k))) {
					al.remove(k);
				}
			}
		}
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static List<String> omitirRepetidosStream() {
		return null;
	}

	private static LinkedList<String> getListQQ() {
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
		LinkedList<String> al = new LinkedList<String>();
		for (int i = 0; i < strs.length; i++) {
			al.add(strs[i]);
		}
		return al;
	}

}
