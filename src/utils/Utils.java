package utils;



public class Utils {

    public static void comingSoon() throws InterruptedException {
        IO.print("[W.I.P]Coming Soon.....");
        Thread.sleep(1000);
    }
    public static void clearScreen(){
        IO.print("\033[H\033[2J");
    }

    public static void enterContinue(){
        IO.print("Press Enter To Return To Main Menu...");
        IO.readln(); 
    }
}
