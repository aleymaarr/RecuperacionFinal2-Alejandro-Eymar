public class Main {

    public static void main(String[] args) {
        DragonFly dragonFly = new  DragonFly("234567-LLL", 300,300,100,30);
        System.out.println("El nivel de energia actual es: " + dragonFly.energyLevel());
        for (int i = 0; i < 7; i++) {
           dragonFly.move();
        }

        System.out.println(dragonFly.status());
        dragonFly.recharge();
        System.out.println(dragonFly.status());
    }
}
