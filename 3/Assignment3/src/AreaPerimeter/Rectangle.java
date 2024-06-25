package AreaPerimeter;
public class Rectangle {
    public double length, width;
    
    Rectangle(double l, double w){
        length = l;
        width = w;
    }
    
    public double computeArea(){
        return length*width;
    }
    
    public double computePerimeter(){
        return 2*(length+width);
    }
}
