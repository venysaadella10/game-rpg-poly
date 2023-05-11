public class App {
    public static void main(String[] args) {
        System.out.println("Nama : Venysa adella aulida laily putri");
        System.out.println("NIM  : 225150607111032");
        System.out.println("=======================================");

        Hero hero = new Hero();
        hero.move();
        hero.move("back");
        System.out.println("---------------------------------------");
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(7);
        System.out.println("---------------------------------------");

        Character character = new Character();
        character.move();
        character = new Hero();
        character.move();
        character = new Enemy();
        character.move();
        character = new Witch();
        character.move();
        character = new Fighter();
        character.move();
        System.out.println("----------------------------------------");

    
        Character ch = new Witch();
        ch.move();
        Character fg = (Fighter)ch;
        fg.move();
       
    }
}