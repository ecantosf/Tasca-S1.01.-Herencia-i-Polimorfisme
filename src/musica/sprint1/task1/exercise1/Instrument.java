package musica.sprint1.task1.exercise1;
//Classe Abstracta
public abstract class Instrument {

    //Atributs
    private String name;
    private double price;

    //Atribut estàtic per demostrar càrrega de classe
    public static int comptadorInstruments = 0;

    //Bloc estàtic, que s'executarà una sola vegada
    static {
        System.out.println("Bloc estàtic de la classe instrument - Càrrega classe instrument...");
        comptadorInstruments++;
        System.out.println("Comptador estàtic iniciat: " + comptadorInstruments);
    }

    //Bloc d'inicialització d'instància, que s'executa cada vegada que es crea una instància
    {
        System.out.println("Bloc d'inicialització d'instància d'Instrument");
        System.out.println("S'està inicialitzant un nou instrument...");
    }

    //Constructor
    public Instrument (String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor d'Instrument: " + name + " creat amb preu " + price + "€"); // Creació del constructor
    }
    //Getters i Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Mètode propi
    public String toString() {
        return "El nom de l'instrument és " + this.name
                + " i el preu és " + this.price;
    }

    //Mètode abstracte (que implementaran les classes filles)
    public abstract void play();
}

