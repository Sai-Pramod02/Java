class Telephone{
    public void ring(){
        System.out.println("Ringing..");
    }
    public void lift(){
        System.out.println("Answering the call!!");
    }
    public void disconnect(){
        System.out.println("Disconnecting the call!!");
    }
}
interface Internet{

    void connectNetworks();
    void searchForNetworks();
    }
interface Musicplayer{
    void playMusic();

}

class SmartTelephone extends Telephone implements Internet,Musicplayer{

    public void connectNetworks() {

        System.out.println("Connecting...");
    }

    @Override
    public void searchForNetworks() {
        System.out.println("Searching for available networks...");
    }

    public void playMusic(){
        System.out.println("Playing music...");
    }
    public void playGames(){
        System.out.println("Playing games");
    }
    public void ring(int x ){
        System.out.println(x);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Musicplayer mp3 = new SmartTelephone(); //if you want to use smartphone as Mp3
        mp3.playMusic();
        Internet wifi = new SmartTelephone();
        wifi.searchForNetworks();
        wifi.connectNetworks();
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.playGames();
        smartTelephone.ring();
        smartTelephone.lift();
        smartTelephone.disconnect();

    }

}




