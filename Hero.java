
public class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Hero gerak");
    }

    public void move(String direction) {
        System.out.println("Hero gerak ke arah "+direction);
    }
    
    
    
}