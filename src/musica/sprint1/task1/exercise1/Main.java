package musica.sprint1.task1.exercise1;

public class Main {

    public static void main(String[] args) {
        /*
         * Activitat per demostrar la càrrega de classes, blocs d'inicialització i blocs estàtics, amb un mètode abstracte.
         * Requereix la creació d'una classe mare (Instrument) i tres classes filles (Vent, Corda i Percussio)
         */

        System.out.println("========= DEMOSTRACIÓ DE CÀRREGA DE CLASSES =========");

        System.out.println("\n--- 1. ACCÉS A MEMBRE ESTÀTIC (sense crear instància) ---");
        System.out.println("Accedint a comptadorInstruments de Instrument: " + Instrument.comptadorInstruments);

        System.out.println("\n--- 2. CREACIÓ DE PRIMERA INSTÀNCIA DE VENT ---");
        Vent flauta = new Vent("Flauta", 50.0);
        flauta.play();

        System.out.println("\n--- 3. ACCÉS A ATRIBUT ESTÀTIC DE CORDA ---");
        System.out.println("Tipus de Corda: " + Corda.TIPUS_CORDA);

        System.out.println("\n--- 4. CREACIÓ DE PRIMERA INSTÀNCIA DE CORDA ---");
        Corda guitarra = new Corda("Guitarra", 200.0);
        guitarra.play();

        System.out.println("\n--- 5. CREACIÓ DE PRIMERA INSTÀNCIA DE PERCUSSIÓ ---");
        Percussio bateria = new Percussio("Bateria", 500.0);
        bateria.play();

        System.out.println("\n--- 6. CREACIÓ DE SEGONA INSTÀNCIA DE VENT ---");
        Vent trompeta = new Vent("Trompeta", 150.0);
        trompeta.play();

        System.out.println("\n--- 7. DEMOSTRACIÓ COMPLETA ---");
        System.out.println("Comptador d'instruments carregats: " + Instrument.comptadorInstruments);

        System.out.println("\n--- 8. ARRAY D'INSTRUMENTS POLIMORFISME ---");
        Instrument[] orchestra = {
                new Vent("Saxofon", 300.0),
                new Corda("Violí", 400.0),
                new Percussio("Tambor", 80.0)
        };

        for (Instrument instrument : orchestra) {
            instrument.play();
        }
    }
}
