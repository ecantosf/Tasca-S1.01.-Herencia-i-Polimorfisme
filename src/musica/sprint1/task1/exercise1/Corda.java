package musica.sprint1.task1.exercise1;

public class Corda extends Instrument {

    //Atribut estàtic específic de la classe Corda
    public static final String TIPUS_CORDA = "Instrument de corda";

    //Bloc Static: es carrega quan s'accedeix a la classe (corda) per primera vegada
    static {
        System.out.println("BLOQ ESTÀTIC de la classe Corda - Carregant classe...");
        System.out.println("Tipus d'instrument: " + TIPUS_CORDA);
    }

    //Bloc d'inicialització d'instància
    {
        System.out.println("Bloc d'inicialització d'instància de Corda.");
    }

    //Constructor
    public Corda(String name, double price) {
        super(name, price);
    }

    //Implementació del mètode abstracte
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}
