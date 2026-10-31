package game;

import java.util.ArrayList;

import utils.Utils;

public class Interface {
    private ArrayList<Game> gamelist = new ArrayList<>();
    private String buff = "";

    public Interface(){}
    public void addGame()throws InterruptedException{

    String title = IO.readln("Title: ");
    String genre = IO.readln("Genre: ");
    String dev = IO.readln("Developer: ");
    String pub = IO.readln("Publisher: ");
    try{
        double price = Double.parseDouble(IO.readln("Price: $"));
        Game gm = new Game(title, genre, price, dev, pub);
        gm.incrementID();
        gamelist.add(gm);
        IO.println("Game Added Successfully...");
        Thread.sleep(1000);
    }
    catch(Exception e){
        IO.println(e.getMessage());
    }
    }

    private void printGame(Game gm){
        IO.println("Game ID:"+gm.getID());
        IO.println("Title:"+gm.title);
        IO.println("Genre:"+gm.genre);
        IO.println("Price:"+gm.price);
        IO.println("Developer:"+gm.dev);
        IO.println("Publisher:"+gm.pub);
        IO.println();
    }

    public void showAllGames(){
        if (gamelist.isEmpty()){
            IO.println("Empty List...");
            return;
        }
        for (Game games: gamelist){
            printGame(games);
        }
        Utils.enterContinue();
        
    }

    public void removeGame()throws InterruptedException{ // TODO: Broken Method Remember To Fix 
        if (gamelist.isEmpty()){
            IO.println("Empty List...");
            return;
        }
        A:
        while (true){
            buff=IO.readln("Enter The ID Of The Game To Remove: ");
            int choice = Integer.parseInt(buff);
            for (final Game gm: gamelist){

                if(choice<=0 || choice>gm.getID()){
                    IO.println("Invalid Input...");
                    break;
                }
                
                // TODO: Implement Search Algo In A Method 
                if (gm.getID() == choice){
                    
                    gamelist.remove(gm);
                    IO.println("Game Removed Successfully...");
                    Thread.sleep(1000);
                    break A;
                }
                else {
                    IO.println("No Game Exists With That ID In The Library...");
                    Thread.sleep(1000);
                    break;
                }
            }
        }
    }

}
