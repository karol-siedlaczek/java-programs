class Punkt implements Interface, Interface2{
    static class InnerPunkt implements Interface, Interface2{
        int j;
        int i;
        public InnerPunkt(int j, int i){
            this.j = j;
            this.i = i;
        }
        @Override
        public String metoda(){
            return "siema";
        }

        @Override
        public String metoda2(){
            return "siema";
        }
    }
    int x;
    int y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPunkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return this.x + ", " + this.y;
    }

    @Override
    public String metoda(){
        return "siema";
    }

    @Override
    public String metoda2(){
        return "siema";
    }

    public static void main (String[] args) {
        Punkt punkt = new Punkt(1, 1);
        punkt.setPunkt(5, 1);
        System.out.println("punkty: " + punkt.toString());
    }
}