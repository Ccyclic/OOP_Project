package game.ui;

import java.awt.Graphics2D;
import java.awt.Image;

import display.Window;
import game.entities.Camera;
import utils.Time;
import utils.Timer;
import utils.resources.Assets;

public class FPSLabel extends UI {
    private final Timer updateTimer = new Timer(0.2);
    private int fps = 0;
    private Image heart, half_heart, empty_heart;

    public FPSLabel(Camera cam) {
        super(cam);
    }

    @Override
    public void render() {
        Window.getBuffer().drawString(String.format("" +
                "FPS: %d       Pos: (%d, %d)", fps,
                (int) camera.getFocus().getPosition().x, (int) camera.getFocus().getPosition().y),
                (int) (camera.getPosition().x), (int) (camera.getPosition().y + 20));
        
        
        if (updateTimer.isDone()) {
            fps = (int) (1 / Time.deltaT());
            updateTimer.restart();
        }
    }

    @Override
    public void init() {

    }

    @Override
    public void update() {
        updateTimer.update();
    }
    
//    public void drawPlayerLife(Graphics2D g2) {
//    	int x = 20;
//    	int y = 20;
//    	int i = 0;
//    	
//    	while(i<maxLife/2) {
//    		g2.drawImage(heart, (int) x, (int) y, null);
//    		i++;
//    		x+=20;
//    	}
//    }
}
