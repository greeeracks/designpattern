package decorator;
    public class chococone implements Icecream {

        private Icecream icecream;

          public chococone() {//when the cone is the base and on icecream
        }

        public chococone(Icecream icecream) { //here we are passing icecream asan input that means the icecream is already present and now we want to add another cone

            this.icecream = icecream;
        }

        @Override
        public int getCost() {
            if(icecream!=null){
                return icecream.getCost()+20; //here we are adding the cone price as manually
            }else {
                return 20;
            }
        }

        @Override
        public String getDescription() {
            if(icecream !=null){
                return icecream.getDescription() + ", chococone";
            }else {
                return "chococone";
            }
        }
    }

