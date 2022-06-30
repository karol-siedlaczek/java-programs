class Punkt implements Interface{
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

    public static void main (String[] args) {
        Punkt punkt = new Punkt(1, 1);
        punkt.setPunkt(5, 1);
        System.out.println("punkty: " + punkt.toString());
    }
}