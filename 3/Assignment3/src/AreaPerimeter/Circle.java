package AreaPerimeter;
public class Circle {
    public double radius;
    
    Circle(double r){
        radius = r;
    }
    
    public double computeArea(){
        return Math.PI*(Math.pow(radius, 2));
    }
    
    public double computeCircumference(){
        return 2*Math.PI*radius;
    }
}
