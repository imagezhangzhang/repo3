public class Circle {
    double radius;
    String name;
    static int count;
    Circle(){
        count++;
        }

        Circle(double pram){
        radius=pram;
        }
        Circle(double pram,String namePram){
            radius=pram;
            name=namePram;
        }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        System.out.println(name);
        return Math.PI*radius*radius;
    }
}
