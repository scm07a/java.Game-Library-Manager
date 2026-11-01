package ui;
import utils.Utils;
import game.Interface;

public class MainMenu {
    private Interface gameInterface = new Interface();
    
    public void showMainMenu(){
        Utils.clearScreen();
        IO.println("=== Game Library Manager ===");
        IO.println("0. Exit");
        IO.println("1. Add Game");
        IO.println("2. Show Games");
        IO.println("3. Remove Game");
    }

    public void exec() throws InterruptedException{
        while (true){
            showMainMenu();
            int choices = Integer.parseInt(IO.readln("Choice: "));
            switch (choices) {
                case 0:
                    Utils.clearScreen();
                    while (true){
                        IO.print("Are You Sure You Want To Exit?(Y/n): ");
                        String e=IO.readln().trim().toLowerCase();
                        if(e.equals("y")) return;
                        else if (e.equals("n")) break;
                        else IO.println("Invalid Input Try Again");
                    }
                    break;

                case 1:
                    Utils.clearScreen();
                    gameInterface.addGame();
                    break;

                case 2:
                    Utils.clearScreen();
                    gameInterface.showAllGames();
                    break;
                
                case 3:
                    gameInterface.removeGame();
                    break;
            
                default:
                    IO.println("Invalid Input");
                    break;
            }
        }
    }
}
