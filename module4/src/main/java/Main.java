public class Main {

    public static void main(String[] args) {
        System.out.println("I'm from unnamed module");
        System.out.println(Main.class.getModule());
    }
}
