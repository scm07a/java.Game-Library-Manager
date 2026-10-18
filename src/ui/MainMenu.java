package ui;
import java.io.PrintStream;
import java.util.Scanner;
import utils.Utils;
import game.Interface;

public class MainMenu {
    private PrintStream ps = System.out;
    private Scanner sc = new Scanner(System.in);
    private int choices = 0;
    private Interface gameInterface = new Interface();
    
    public void showMainMenu(){
        Utils.clearScreen();
        ps.println("=== Game Library Manager ===");
        ps.println("0. Exit");
        ps.println("1. Add Game");
        ps.println("2. Show Games");
        ps.println("3. Remove Game");
    }

    public void exec() throws InterruptedException{
        while (true){
            showMainMenu();
            ps.print("Choice: ");
            choices = sc.nextInt();
            switch (choices) {
                case 0:
                    while (true){
                        ps.print("Are You Sure You Want To Exit?(Y/n): ");
                        String e=sc.next().trim().toLowerCase();
                        if(e.equals("y")) return;
                        else if (e.equals("n")) break;
                        else ps.println("Invalid Input Try Again");
                        
                    }

                case 1:
                    Utils.clearScreen();
                    gameInterface.addGame();
                    break;

                case 2:
                    Utils.clearScreen();
                    gameInterface.showAllGames();
                    break;
                
                case 3:
                    Utils.clearScreen();
                    Utils.comingSoon();
                    break;
            
                default:
                    ps.println("Invalid Input");
                    break;
            }
        }
    }
}
