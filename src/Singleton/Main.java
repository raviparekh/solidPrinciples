package Singleton;

public class Main {

    public static void main(String[] args) {
        Stadium s1 = Stadium.getInstance();
        Stadium s2 = Stadium.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(String.format("Is s1 the same object as s2 = %b",  s1 == s2));
    }


}
