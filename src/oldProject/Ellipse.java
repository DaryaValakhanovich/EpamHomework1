package oldProject;

public class Ellipse extends Figure implements Circumference{
    private int radius1;
    private int radius2;

    public Ellipse(int radius1, int radius2){
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public int findArea() {
        return (int)Math.round(Math.PI * radius1 * radius2);
    }
    @Override
    public double findCircumference(){
        return Math.PI * (radius1 +radius2);
    }

    @Override
    public String toString(){
        return "Овал." +
                " Радиусы: " + radius1 + ", " + radius2 +".";
    }
}