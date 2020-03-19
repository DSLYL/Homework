class Triangle{
    int bottom;
    double high;
    Triangle(double high){
        this.high=high;
    }
    Triangle(int bottom){
        this.bottom=bottom;
    }
    Triangle(double high,int bottom){
        this.bottom=bottom;
        this.high=high;
    }
    public double aera(){
        double s=bottom*high;
        return s;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Triangle t1=new Triangle(2.0);
        System.out.println(t1.aera());
        Triangle t2=new Triangle(5);
        System.out.println(t1.aera());
        Triangle t3=new Triangle(2.0,5);
        System.out.println(t3.aera());
    }
}
