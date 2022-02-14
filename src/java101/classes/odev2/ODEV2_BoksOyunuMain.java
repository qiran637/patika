package java101.classes.odev2;

public class ODEV2_BoksOyunuMain {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 10, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 15, 100, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }

}
