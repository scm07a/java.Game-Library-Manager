import ui.MainMenu;
void main(){
    try{
        MainMenu app = new MainMenu();
        app.exec();
    }
    catch(Exception e){
        IO.println(e.getMessage());
    } 
}