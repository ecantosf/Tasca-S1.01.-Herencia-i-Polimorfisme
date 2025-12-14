public class Percussio extends Instrument {

    //Atribut estàtic específic
    public static String descripcio;

    //Bloc Static: es carrega quan s'accedeix a la classe (percussió) per primera vegada
    static {
        System.out.println("BLOQ ESTÀTIC de la classe Percussió - Carregant classe...");
        descripcio = "Instrument de percussió";
        System.out.println("Tipus d'instrument: " + descripcio);
    }

    //Bloc d'inicialització d'instància
    {
        System.out.println("Bloc d'inicialització d'instància de percussió.");
    }

    //Constructor
    public Percussio(String name, double price) {
        super(name, price);
    }

    //Implementació del mètode abstracte
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
