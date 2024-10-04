package ejerciciostreams07;

import java.util.HashSet;
import java.util.Set;

public class GatosRepository {
	private Set<Gato> gatos=new HashSet<>();

	public Set<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(Set<Gato> gatos) {
		this.gatos = gatos;
	}

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	
	public int size() {
		return gatos.size();
	}
	
	
}
