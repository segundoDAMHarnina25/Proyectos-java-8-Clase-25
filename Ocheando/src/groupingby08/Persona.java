package groupingby08;

public class Persona {
	// propiedades
	private String dni;
	private String nombre;
	private byte edad;
	private float saldo;
	private Categoria categoria;

	// Getters and Setters
	public String getDNI() {
		return dni;
	}

	public void setDNI(String DNI) {
		this.dni = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodos
	public Persona(String DNI, String nombre) {
		// TODO Auto-generated constructor stub
		setDNI(DNI);
		setNombre(nombre);
	}

	public Persona(String dni, String nombre, byte edad) {
		this(dni,nombre);
		setEdad(edad);
	}
	

	public Persona(String dni, String nombre, byte edad, float saldo) {
		this(dni,nombre,edad);
		this.saldo = saldo;
	}
	

	public Persona(String dni, String nombre, byte edad, float saldo, Categoria categoria) {
		this(dni,nombre,edad,saldo*categoria.getFactorSaldo());
		this.categoria = categoria;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public byte getEdad() {
		return edad;
	}

	public String getDni() {
		return dni;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

}
