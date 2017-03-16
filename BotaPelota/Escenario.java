import greenfoot.*;  

public class Escenario extends World {

    public Escenario() {
        super(600, 400, 1, true); 
        prepare();
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
    
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,262,370);
        jugador.setLocation(257,340);
        jugador.setLocation(240,352);
        Pelota pelota = new Pelota();
        addObject(pelota,116,118);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,529,47);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,291,209);
        jugador.setLocation(264,365);
    }
}