package ejerciciostream05;

import java.util.List;
import java.util.stream.Collectors;

public class SociosOM {
	public static List<Socio> getSocios(){
		return new ClientesOM().getClientes().stream()
				.map((cliente)
						->{return new Socio(cliente.getNombre(),300f);})
				.collect(Collectors.toList());
	}
}
