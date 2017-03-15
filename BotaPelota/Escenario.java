import greenfoot.*;  

public class Escenario extends World {

    public Escenario() {
        super(600, 400, 1, true); 
    }
    
    @Override
    public void act () {
        if (Greenfoot.mouseClicked(this)) {
            MouseInfo raton = Greenfoot.getMouseInfo();
            Pelota pel = new Pelota();
            addObject(pel, raton.getX(), raton.getY());
            pel.act(); 
        }
    }
}