package ui;
import utils.ConsoleUtils; 
import game.GameLibrary;

public class MainMenu {
    private GameLibrary gameLib = new GameLibrary();
    
    public void showMainMenu(){
        ConsoleUtils.clearScreen();
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
                    ConsoleUtils.clearScreen();
                    while (true){
                        String e=
                        IO.readln("Are You Sure You Want To Exit?(Y/n): ").trim().toLowerCase();
                        if(e.equals("y")) return;
                        else if (e.equals("n")) break;
                        else IO.println("Invalid Input Try Again");
                    }
                    break;

                case 1:
                    ConsoleUtils.clearScreen();
                    gameLib.addGame();
                    break;

                case 2:
                    ConsoleUtils.clearScreen();
                    gameLib.showAllGames();
                    break;
                
                case 3:
                    ConsoleUtils.clearScreen();
                    gameLib.removeGame();
                    break;
            
                default:
                    IO.println("Invalid Input");
                    break;
            }
        }
    }
}
