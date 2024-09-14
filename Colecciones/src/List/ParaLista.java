package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ParaLista {
	ArrayList ff;
	LinkedList ffd;
	HashSet hs;
	TreeSet<Persona> ts;
	
	public void doIt(List s) {
		LinkedList dd=(LinkedList) s;
		dd.addFirst(null);
		ts=new TreeSet();
		ts.add(new Persona());
	}
	
}
