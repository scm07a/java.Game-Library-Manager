package game;

class Game {
    private int id;
    protected String title;
    protected String genre;
    protected String dev;
    protected String pub;
    protected double price;

    public Game(int id, String title, String genre, double price, String dev, String pub){
        this.id=id;
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
