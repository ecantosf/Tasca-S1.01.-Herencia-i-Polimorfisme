package smartphone.sprint1.task1.level2;

public class Phone {

    //Atributs
    private String marca;
    private String model;

    //Constructor
    public Phone(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    //Getters i Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Mètode per trucar
    public void makeCall(String phoneNumber) {
        System.out.println("S'està trucant al número " + phoneNumber);
    }


}
