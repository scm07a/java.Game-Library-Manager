package game;

class Game {
    private int id;
    protected String title;
    protected String genre;
    protected String dev;
    protected String pub;
    protected double price;

    public Game(String title, String genre, double price, String dev, String pub){
        this.id=0;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.dev = dev;
        this.pub = pub;
    }

    void incrementID(){
        id++;
    }

    public int getID(){
        return id;
    }
}
