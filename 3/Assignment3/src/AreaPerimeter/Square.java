package AreaPerimeter;
public class Square {
    public double side;
    
    Square(double s){
        side = s;
    }
    
    public double computeArea(){
        return Math.pow(side, 2);
    }
    
    public double computePerimeter(){
        return side*4;
    }
}
