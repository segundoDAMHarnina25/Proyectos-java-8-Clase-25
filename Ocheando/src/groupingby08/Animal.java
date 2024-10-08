package groupingby08;

import java.time.LocalDate;

public class Animal {
    private String especie;
    private double peso;
    private LocalDate fechaNacimiento;
    private boolean esCarnivoro;

    public Animal(String especie, double peso, LocalDate fechaNacimiento, boolean esCarnivoro) {
        this.especie = especie;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.esCarnivoro = esCarnivoro;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isCarnivoro() {
        return esCarnivoro;
    }
}
