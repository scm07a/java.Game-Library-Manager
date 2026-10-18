import ui.MainMenu;
void main(){
    try{
        MainMenu menu = new MainMenu();
        menu.exec();
    }
    catch(Exception e){
        System.err.println(e.getMessage());
    }
}