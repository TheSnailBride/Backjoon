package Test.homework.work0804_2;

public class TV extends ElectronicDevice implements RemoteControllable{



    TV(String brand){
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("TV Turn On");
    }
    @Override
    public void turnOff() {
        System.out.println("TV Turn Off");
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("TV Set Volume " + volume);
    }

    @Override
    public void displayInfo(){
        power = !power;
        if (power){
            System.out.println("TV Power is on");
        }else{
            System.out.println("TV Power is off");
        }
    }

}
