package guru.qa;

public class Airplane {
    int speed;
    String name;

    public Airplane(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    void gotoTakeoff() {
        if (speed > 200){
            System.out.println("Экипаж " + name + " идёт на взлёт");
        } else {
            System.out.println("Экипаж " + name + " продолжает набор скорости");
        }
    }

}
