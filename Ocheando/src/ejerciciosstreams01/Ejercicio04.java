package ejerciciosstreams01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ejercicio04 {
	/*Reclamaci�n:

		1. Recorre la colecci�n e imprime el n�mero de serie y el nombre 
		correspondiente.
		2. Inserte un mensaje codificado como 5 y llamado Li Xiaohong 
		en el conjunto de mapas
		3. Elimine la informaci�n numerada 1 en el mapa
		4. Modifique la informaci�n del nombre numerada 2 en el
		 mapa establecido en "Zhou Lin"
			 * 
			 */
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		 map.put (1, " ");
             map.put (2, "Zhou Zhiruo");
             map.put (3, " ");
             map.put (4, "Exterminador tambi�n");
             map.put (5, " ");
             map.put (2, "   "); // Debido a que la clave del mapa es �nica, poner la misma clave es equivalente a sobrescribir
      map.remove(1);
      //map.
      Set<Integer> keyset = map.keySet();
      Iterator it = keyset.iterator();
      while(it.hasNext())
      {
      	Integer integer = (Integer)it.next();
      	System.out.println("key:"+integer+" value:"+map.get(integer));
      }
	}
}
