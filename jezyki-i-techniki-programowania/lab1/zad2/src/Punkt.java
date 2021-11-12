class Punkt implements Inter {
    float x;
    float y;

    Punkt(float x, float y){
        this.x = x;
        this.y = y;
    }

    /* (non-Javadoc)
     * @see Inter#ToString()
     */
    @Override
    public String ToString(){
        return "("+this.x+", "+this.y+")";
    }

    /* (non-Javadoc)
     * @see Inter#Mov(float, float)
     */
    @Override
    public void Mov(float mx, float my){
        this.x += mx;
        this.y += my;
    }
}