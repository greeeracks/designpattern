package decorator;

import decorator.Icecream;

public class Main {
    public static void main(String[] args) {
        Icecream ic = new vanillascoop(new vanillacone(new chocosyrup(new chococone())));
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
