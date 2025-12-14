package musica.sprint1.task1.exercise1;


public class Vent extends Instrument {

    //Atribut estàtic de la classe Vent
    public static String tipusVent = "Instrument de vent";

    //Bloc estàtic: es carrega quan s'accedeix a la classe (vent) per primera vegada
    static {
        System.out.println("BLOQ ESTÀTIC de la classe Vent - Carregant classe...");
        System.out.println("Tipus d'instrument: " + tipusVent);
    }

    //Bloc d'inicialització d'instància no static
    {
        System.out.println("Bloc d'inicialització d'instància de vent.");
    }

    //Constructor
    public Vent(String name, double price) {
        super(name, price);
    }

    //Implementació del mètode abstracte
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}

