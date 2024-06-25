package AreaPerimeter;
public class RightTriangle {
    public double base, height;
    
    RightTriangle(double b, double h){
        base = b;
        height = h;
    }
    
    public double computeArea(){
        return .5*base*height;
    }
    
    public double computePerimeter(){
        return base + height + (Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
    }
}
