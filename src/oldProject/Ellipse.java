package oldProject;

import annotations.ThisCodeSmells;
import annotations.UseStackOnly;

public class Ellipse extends Figure implements Circumference{
    @UseStackOnly
    private int radius1;
    @ThisCodeSmells(reviewer = "Slava")
    private int radius2;

    public Ellipse(int radius1, int radius2){
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @ThisCodeSmells(reviewer = "Petya")
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