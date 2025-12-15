package smartphone.sprint1.task1.level2;

public class Smartphone extends Phone implements Camera,Clock{

    public Smartphone(String marca,String model) {
        super(marca,model);
    }

    @Override
    public void takePicture() {
        System.out.println();
    }

    @Override
    public void soundAlarm() {}
}
