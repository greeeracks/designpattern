package decorator;

import decorator.Icecream;

public class vanillascoop implements Icecream {

    private Icecream icecream;

    public vanillascoop(Icecream icecream) {//here we are not using default constructor because without base we cannot just add vanilla scoop we arer making cone icecream only
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", vanilla scoop";
    }
}
