import greenfoot.*;  

public class Disparo extends Actor {
    
    @Override
    public void act() {
        
        this.setLocation(this.getX(), this.getY() - 10);
        
         if (this.isTouching(Pelota.class)) {
            this.removeTouching(Pelota.class);
        }
        
        if (this.getY() == 0) {
            World mundo = this.getWorld();
            mundo.removeObject(this);
        }
    }    
}
