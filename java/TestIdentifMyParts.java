// Path: TestIdentifMyParts.java
public class TestIdentifMyParts {
    public static void main(String[] args) {
        IdentiMyParts a = new IdentiMyParts();
        IdentiMyParts b = new IdentiMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifMyParts.x = " + IdentiMyParts.x);
    }
}