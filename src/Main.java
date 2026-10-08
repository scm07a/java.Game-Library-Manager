import ui.MainMenu;
public class Main {
    public static void main(String []args){
        try{
            MainMenu menu = new MainMenu();
            menu.exec();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
