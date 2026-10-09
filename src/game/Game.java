package game;
import java.io.PrintStream;
import java.util.Scanner;


public class Game {
    private Scanner sc = new Scanner(System.in);
    private PrintStream ps = System.out;
    private String title;
    private String genre;
    private String dev;
    private String pub;
    private double price;

    public Game(String title, String genre, double price, String dev, String pub){
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.dev = dev;
        this.pub = pub;
    }

    public void addGame(){
        ps.print("Title: ");
        title = sc.nextLine();

        ps.print("Genre: ");
        genre = sc.nextLine();

        ps.print("Developer: ");
        dev = sc.nextLine();

        ps.print("Publisher: ");
        pub = sc.nextLine();

        ps.print("Price: ");
        price = Double.parseDouble(sc.nextLine());

    }

}
