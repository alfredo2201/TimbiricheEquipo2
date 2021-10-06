package Control;

public class Punto {
    private int x =0;
    private int y = 0;
    private int weidt = 0;
    private int high = 0;

    public Punto() {
    }
    
    
    public Punto(int x, int y, int weidt, int high){
        this.x = x;
        this.y = y;
        this.weidt = weidt;
        this.high = high;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWeidt() {
        return weidt;
    }

    public void setWeidt(int weidt) {
        this.weidt = weidt;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto other = (Punto) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", weidt=" + weidt;
    }

    

  
    
    
}
