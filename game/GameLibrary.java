package game;

import java.util.ArrayList;

import utils.ConsoleUtils;

public class GameLibrary {
    private int nextID=1;
    private ArrayList<Game> gamelist = new ArrayList<>();
    private String buff = "";
    

    public GameLibrary(){}

    public void addGame()throws InterruptedException{
    String title = IO.readln("Title: ");
    String genre = IO.readln("Genre: ");
    String dev = IO.readln("Developer: ");
    String pub = IO.readln("Publisher: ");
    try{
        double price = Double.parseDouble(IO.readln("Price: $"));
        Game gm = new Game(nextID,title, genre, price, dev, pub);
        gamelist.add(gm);
        IO.println("Game Added Successfully...");
        nextID++;
        Thread.sleep(1000);
        }
    catch(Exception e){
        IO.println(e.getMessage());
        }
    }

    private void printGame(Game gm){
        IO.println();
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
        ConsoleUtils.enterContinue();
        
    }

    public void removeGame()throws InterruptedException{ // TODO: Broken Method Remember To Fix 
        if (gamelist.isEmpty()){
            IO.println("Empty List...");
            return;
        }
        while (true){
            for (Game games: gamelist)
                printGame(games);
            buff=IO.readln("Enter The ID Of The Game To Remove (0 to cancel): ");
            int choice = Integer.parseInt(buff);

            if(choice==0) break;

            if(choice<0){
                IO.println("Invalid Input...");
                continue;
            }

            int found = findID(choice);
            if (found!=-1){
                gamelist.remove(found);
                IO.println("Game Removed Successfully...");
                Thread.sleep(1000);
                break;
            }
            else {
                IO.println("No Game Exists With That ID In The Library...");
                Thread.sleep(1000);
                continue;
            }
            }
        }

    private int findID(int target){
        int left = 0, right = gamelist.size()-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(target>gamelist.get(mid).getID()) left=mid+1;
            else if(target<gamelist.get(mid).getID()) right=mid-1;
            else return mid;
        }
        return -1;
    }
}

