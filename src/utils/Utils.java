package utils;

import java.io.PrintStream;
import java.util.Scanner;

public class Utils {
    private static PrintStream ps = System.out;

    public static void comingSoon() throws InterruptedException {
        ps.print("[W.I.P]Coming Soon.....");
        Thread.sleep(1000);
    }
    public static void clearScreen(){
        ps.print("\033[H\033[2J");
        ps.flush();
    }

    public static void enterContinue(Scanner sc){
        ps.print("Press Enter To Return To Main Menu...");
        sc.nextLine(); 
    }
}
