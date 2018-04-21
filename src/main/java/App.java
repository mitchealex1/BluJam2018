import processing.core.PApplet;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App extends PApplet{
	private Asteroid asteroid;
	private Layer[] layers;
	
    public void mousePressed() {
        InputHandler.addEvent(new MouseEvent(this, mouseX, mouseY, MouseEvent.Type.PRESS));
    }

    public void mouseReleased() {
        InputHandler.addEvent(new MouseEvent(this, mouseX, mouseY, MouseEvent.Type.RELEASE));
    }

    public void keyPressed() {
        InputHandler.keyDown.put(keyCode, true);
    }

    public void keyReleased() {
        InputHandler.keyDown.put(keyCode, false);
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        ellipse(width/2, height/2, height, height);
        layers = new Layer[5];
        
    }

    public static void main(String[] args) {
        PApplet.main(App.class);
    }

    public Asteroid getAsteroid() {
        return asteroid;
    }
}
