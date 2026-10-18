package game;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    private PrintStream ps = System.out;
    private ArrayList<Game> gamelist = new ArrayList<>();

    public Interface(){}

    public void addGame(Scanner sc){
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

    Game gm = new Game(title, genre, price, dev, pub);
    gamelist.add(gm);
    }

    private void printGame(Game gm){
        ps.println("Title:"+gm.title);
        ps.println("Genre:"+gm.genre);
        ps.println("Price:"+gm.price);
        ps.println("Developer:"+gm.dev);
        ps.println("Publisher:"+gm.pub);
        ps.println();
    }

    public void showAllGames(){
        if (gamelist.isEmpty()){
            ps.println("Empty List...");
            return;
        }
        for (Game games: gamelist){
            printGame(games);
        }
        
    }

    public void removeGame(Scanner sc){

    }

}
