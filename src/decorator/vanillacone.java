package decorator;


    public class vanillacone implements Icecream {

        private Icecream icecream;

        public vanillacone() {
        }

        public vanillacone(Icecream icecream) {
            this.icecream = icecream;
        }

        @Override
        public int getCost() {
            if (icecream != null) {
                return icecream.getCost() + 15;
            } else {
                return 15;
            }
        }

        @Override
        public String getDescription() {
            if (icecream != null) {
                return icecream.getDescription() + " ,vanilla cone ";
            } else {
                return "vanillacone";
            }
        }
    }