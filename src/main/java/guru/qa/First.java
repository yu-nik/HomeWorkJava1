package guru.qa;

public class First {
    public static void main(String[] args) {
        Airplane samolet = new Airplane(160,"Airbus");
        Airplane fighter = new Airplane(300, "CU");
        samolet.gotoTakeoff();
        fighter.gotoTakeoff();
    }
}
