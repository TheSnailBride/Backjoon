package Test.homework.work0804_2;

public abstract class ElectronicDevice {


    String brand;
    Boolean power = false ;

    ElectronicDevice(String brand){
        this.brand = brand;

    }

    public void displayInfo(){
        power = !power;
        if (power){
            System.out.println("Power is on");
        }else{
            System.out.println("Power is off");
        }
    }
}
