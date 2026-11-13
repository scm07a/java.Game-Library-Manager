package game;

class Game {
    private static int nextID=1;
    private final int id;
    protected String title;
    protected String genre;
    protected String dev;
    protected String pub;
    protected double price;

    public Game(String title, String genre, double price, String dev, String pub){
        id = nextID++;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.dev = dev;
        this.pub = pub;
    }

    protected int getID(){
        return id;
    }

}
