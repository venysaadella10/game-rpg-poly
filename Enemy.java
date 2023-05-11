public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy gerak!");
    }
    public void move(int step) {
        System.out.println("Enemy melangkah sebanyak berapa step "+step);
    }

}
