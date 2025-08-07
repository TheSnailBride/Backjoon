package Test.homework.work0804_2;

public class Refrigerator extends ElectronicDevice{

    Refrigerator(String brand ){
       super(brand);
    }

    @Override
    public void displayInfo(){
        power = !power;
        if (power){
            System.out.println("Refrigerator Power is on");
        }else{
            System.out.println("Refrigerator Power is off");
        }
    }

}
