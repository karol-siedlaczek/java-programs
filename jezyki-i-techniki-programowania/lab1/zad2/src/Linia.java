class Linia {
    Inter p1;
    Inter p2;

    Linia(Inter p1, Inter p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public String ToString(){
        return "Poczatek: "+this.p1.ToString()+"\nKoniec: "+this.p2.ToString();
    }

    public void Mov(float mx, float my){
        this.p1.Mov(mx, my);
        this.p2.Mov(mx, my);
    }
}