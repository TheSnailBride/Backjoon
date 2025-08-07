package Test.homework.work0804_2;

public class Speaker extends ElectronicDevice implements RemoteControllable{

    int volume;

    Speaker(String brand){
        super(brand);
    }

    @Override
    public void turnOn(){
        System.out.println("Speaker Turn On");

    }
    @Override
    public void turnOff(){
        System.out.println("SpeakerTurn Off");
    }
    @Override
    public void setVolume(int volume){

        if(!(volume >0 && volume <100)) {
            volume = 0 ;
            this.volume = volume;
        }
        System.out.println("Speaker Set Volume " + volume);

    }

    @Override
    public void displayInfo(){
        power = !power;
        if (power){
            System.out.println("Speaker Power is on");
        }else{
            System.out.println("Speaker Power is off");
        }
    }
}
