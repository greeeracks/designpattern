package decorator;

    public class chocosyrup implements Icecream {

        private Icecream icecream;

        public chocosyrup(Icecream icecream) {//here we are not using default constructor because without base we cannot just add vanilla scoop we arer making cone icecream only
            this.icecream = icecream;
        }

        @Override
        public int getCost() {
            return icecream.getCost() + 45;
        }

        @Override
        public String getDescription() {
            return icecream.getDescription() + ", chocosyrup";
        }
    }
