package smartphone.sprint1.task1.level2;

public class Main {

    public static void main(String[] args) {
        //Cridar un objecte Smartphone i cridar als mètodes d'altres classes

        Smartphone smartphone1 = new Smartphone("iPhone","16e");
        smartphone1.takePicture();
        smartphone1.soundAlarm();
        System.out.println(); //Salt de pàgina

        System.out.println("Marca del smartphone: " + smartphone1.getMarca());
        System.out.println("Model del smartphone: " + smartphone1.getModel());
    }
}
