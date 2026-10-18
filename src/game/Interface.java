package game;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import utils.Utils;

public class Interface {
    private PrintStream ps = System.out;
    private ArrayList<Game> gamelist = new ArrayList<>();

    public Interface(){}

    public void addGame(Scanner sc)throws InterruptedException{
    ps.print("Title: ");
    String title = sc.nextLine();
    ps.print("Genre: ");
    String genre = sc.nextLine();
    ps.print("Developer: ");
    String dev = sc.nextLine();
    ps.print("Publisher: ");
    String pub = sc.nextLine();
    ps.print("Price: ");
    double price = Double.parseDouble(sc.nextLine());
    try{
        Game gm = new Game(title, genre, price, dev, pub);
        gm.incrementID();
        gamelist.add(gm);
        ps.println("Game Added Successfully...");
        Thread.sleep(1000);
    }
    catch(Exception e){
        ps.println(e.getMessage());
    }
    }

    private void printGame(Game gm){
        ps.println("Game ID:"+gm.getID());
        ps.println("Title:"+gm.title);
        ps.println("Genre:"+gm.genre);
        ps.println("Price:"+gm.price);
        ps.println("Developer:"+gm.dev);
        ps.println("Publisher:"+gm.pub);
        ps.println();
    }

    public void showAllGames(Scanner sc){
        if (gamelist.isEmpty()){
            ps.println("Empty List...");
            return;
        }
        for (Game games: gamelist){
            printGame(games);
        }
        Utils.enterContinue(sc);
        
    }

    public void removeGame(Scanner sc)throws InterruptedException{
        if (gamelist.isEmpty()){
            ps.println("Empty List...");
            return;
        }
        while (true){
            ps.print("Enter The ID Of The Game To Remove: ");
            int choice = sc.nextInt();
            for (final Game gm: gamelist){
                if(choice<=0 || choice>gm.getID()){
                    ps.println("Invalid Input...");
                    break;
                }
                if (gm.getID() == choice){ 
                    gamelist.remove(gm);
                    ps.println("Game Removed Successfully...");
                    Thread.sleep(1000);
                    break;
                }
                else{
                    ps.println("No Game Exists With That ID In The Library...");
                    Thread.sleep(1000);
                    break;
                }
            }
        }
    }

}
