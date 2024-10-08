package groupingby08;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalMother {

    public static List<Animal> createAnimales() {
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Animal("León", 190.5, LocalDate.of(2018, 6, 15), true));
        animales.add(new Animal("Elefante", 1200.75, LocalDate.of(2010, 3, 23), false));
        animales.add(new Animal("Tigre", 220.3, LocalDate.of(2016, 8, 30), true));
        animales.add(new Animal("Jirafa", 900.4, LocalDate.of(2019, 5, 10), false));
        animales.add(new Animal("Cebra", 450.2, LocalDate.of(2021, 1, 5), false));
        animales.add(new Animal("Cocodrilo", 300.8, LocalDate.of(2015, 11, 18), true));
        animales.add(new Animal("Puma", 150.2, LocalDate.of(2017, 9, 25), true));
        animales.add(new Animal("Rinoceronte", 1300.0, LocalDate.of(2008, 4, 1), false));
        animales.add(new Animal("Oso", 400.5, LocalDate.of(2014, 12, 12), true));
        animales.add(new Animal("Búfalo", 800.3, LocalDate.of(2013, 7, 15), false));
        animales.add(new Animal("Canguro", 70.5, LocalDate.of(2020, 3, 22), false));
        animales.add(new Animal("Zorro", 30.2, LocalDate.of(2019, 11, 10), true));
        animales.add(new Animal("Lobo", 45.6, LocalDate.of(2015, 6, 18), true));
        animales.add(new Animal("Hipopótamo", 1500.0, LocalDate.of(2011, 8, 5), false));
        animales.add(new Animal("Águila", 12.5, LocalDate.of(2018, 9, 30), true));
        animales.add(new Animal("Serpiente", 15.3, LocalDate.of(2016, 4, 4), true));
        animales.add(new Animal("Tortuga", 100.0, LocalDate.of(2012, 7, 9), false));
        animales.add(new Animal("Jaguar", 180.4, LocalDate.of(2014, 10, 20), true));
        animales.add(new Animal("Camello", 600.6, LocalDate.of(2019, 2, 28), false));
        animales.add(new Animal("Panda", 120.3, LocalDate.of(2015, 12, 25), false));
        animales.add(new Animal("Chimpancé", 50.0, LocalDate.of(2020, 6, 14), false));
        animales.add(new Animal("Lemur", 4.3, LocalDate.of(2017, 8, 17), false));
        animales.add(new Animal("Pavo Real", 5.5, LocalDate.of(2021, 1, 2), false));
        animales.add(new Animal("Tucán", 3.2, LocalDate.of(2019, 10, 7), false));
        animales.add(new Animal("Pingüino", 25.6, LocalDate.of(2018, 3, 18), false));
        animales.add(new Animal("Buitre", 11.0, LocalDate.of(2014, 5, 22), true));
        animales.add(new Animal("Iguana", 8.5, LocalDate.of(2013, 11, 11), false));
        animales.add(new Animal("Orangután", 55.0, LocalDate.of(2016, 9, 27), false));
        animales.add(new Animal("Cocodrilo", 350.0, LocalDate.of(2012, 5, 5), true));
        animales.add(new Animal("Gorila", 200.0, LocalDate.of(2011, 4, 18), false));

        return animales;
    }
}

