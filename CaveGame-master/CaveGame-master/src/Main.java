import display.Window;
import game.scenes.StartMenu;

public class aMain {
    public static void main(String[] args) {
        Window win = new Window();
        win.init("Dungeon Crawler", 1280, 720);
        win.scene = new StartMenu();
        win.loop();
    }
}