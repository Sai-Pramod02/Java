interface TVremote{
    void ON();
    void OFF();
    void VolumeUP();
    void VolumeDOWN();
}
interface SmartTVremote extends TVremote{
    void Youtube();
    void Netflix();
    void Prime();
}
class TV implements SmartTVremote{
    @Override
    public void ON() {
        System.out.println("Switched ON!");
    }
    public void OFF(){
        System.out.println("Switched OFF!");
    }
    public void VolumeUP(){
        System.out.println("Increased Volume");
    }
    public void VolumeDOWN(){
        System.out.println("Decreased Volume");
    }

    @Override
    public void Netflix() {
        System.out.println("**NETFLIX**");
    }
    public void Youtube(){
        System.out.println("*YOUTUBE**");
    }
    public void Prime(){
        System.out.println("**AMAZON PRIME**");
    }
}
public class Interfaces_Inheritence {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.ON();
        tv.OFF();
        tv.Youtube();
        tv.Netflix();
        tv.Prime();
        tv.VolumeDOWN();
        tv.VolumeUP();
    }

}
