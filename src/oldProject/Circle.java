package oldProject;

public class Circle extends Figure implements Circumference{
    private int radius;

    public Circle(){ }

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int findArea() {
        return (int)Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double findCircumference(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString(){
        return "Круг." +
                " Радиус: " + radius + ".";
    }
}