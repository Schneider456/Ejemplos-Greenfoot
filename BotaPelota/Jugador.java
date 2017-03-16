import greenfoot.*;  
import java.util.List;

public class Jugador extends Actor {
    
    private boolean disparando;
    
    public Jugador () {
        disparando = false;
    }
    
    @Override
    public void act() {
        // Si presiona la flecha derecha
        if (Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + 10, this.getY());
        }
        
        if (Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - 10, this.getY());
        }
        
        if (Greenfoot.isKeyDown("space") && !disparando) {
            Disparo disp = new Disparo();
            World mundo = this.getWorld();
            mundo.addObject(disp, this.getX(), this.getY());
            disparando = true;
            
        }
        
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if (lista.isEmpty()) {
            disparando = false;
        }
    }    
}
 