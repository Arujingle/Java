/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class Rectangle extends GeometricObject  {
  
  private double width;
    private double height;

    public Rectangle() {
		
    }

    public Rectangle(double Width, double Height){
        this.width = Width;
        this.height = Height;
    }

    public Rectangle(double Width, double Height, String Color, boolean Filled){
        this.width = Width;
        this.height = Height;
        setColor(Color);
        setFilled(Filled);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double Height){
        this.height = Height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }        
}
