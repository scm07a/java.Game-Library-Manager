package game;

class Game {
    private int id = 0;
    protected String title;
    protected String genre;
    protected String dev;
    protected String pub;
    protected double price;

    public Game(String title, String genre, double price, String dev, String pub){
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.dev = dev;
        this.pub = pub;
    }

    protected void incrementID(){
        id+=1;
    }

    public int getID(){
        return id;
    }
}
