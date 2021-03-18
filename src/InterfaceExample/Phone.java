package InterfaceExample;
//Java interface with two method declaration
public interface Phone {
    void PhoneSound();//abstract methods
     void SwitchOff();//abstracts methods
     void MusicPlayer();//abstracts methods



}
// implementing phone interface
class Samsung implements Phone {
// implementing the phoneSound in interface
    @Override
    public void PhoneSound() {
        System.out.println("Press the + button to increase and - button to decrease");

    }
//Implementing phone interface
    @Override
    public void SwitchOff() {

        System.out.println("Press the red button to switch off the phone");
    }
// Implementing phone interface
    @Override
    public void MusicPlayer()
    {
        System.out.println("Press Play button to start MusicPlayer");
    }
}

//Applying the function of phone
class Main{
    public static void main(String[] args) {
        Samsung myPhone = new Samsung();
        myPhone.PhoneSound();
        myPhone.SwitchOff();
        myPhone.MusicPlayer();

    }
}
// An interface is an abstract methods to compile or to group with related or empty bodies.
//Override methods is important to implement the interface.
// Constructor cannot be used in interface method.