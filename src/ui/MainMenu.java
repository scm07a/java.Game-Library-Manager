package ui;
import java.util.Scanner;

// import game.Game;

public class MainMenu {
    private Scanner sc = new Scanner(System.in);
    private int choices = 0;
    // private Game game = new Game();
    private void comingSoon() throws InterruptedException {
        System.out.println("[W.I.P]Coming Soon.....");
        Thread.sleep(1000);
    }
    private void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showMainMenu(){
        clearScreen();
        System.out.println("=== Game Library Manager ===");
        System.out.println("0. Exit");
        System.out.println("1. Add Game");
        System.out.println("2. Remove Game");
        System.out.println("3. Show Games");
    }

    public void exec() throws InterruptedException{
        while (true){
            showMainMenu();
            System.out.print("Choice: ");
            choices = sc.nextInt();
            switch (choices) {
                case 0:
                    return;

                case 1:
                    comingSoon();
                    break;

                case 2:
                    comingSoon();
                    break;
                
                case 3:
                    comingSoon();
                    break;
            
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
