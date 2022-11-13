public class Fraction {
    private int numer =0;
    private int demon = 1;

    public Fraction(){

    }
    public Fraction(int x, int y){
        numer = x;
        demon = y;
    }
    public Fraction(Fraction f)
    {
        this.numer  = f.numer;
        this.demon = f.demon;
    }

    public String toString(){
        return "["+this.numer+","+this.demon+"]";
    }

    public boolean equals(Object f){
        if(f instanceof Fraction)
        {
            Fraction t = (Fraction) f;
            if(t.numer *this.demon == this.numer*t.demon){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}
