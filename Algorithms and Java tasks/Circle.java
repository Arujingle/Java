/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

   public  class Circle extends GeometricObject{
protected double radius;

public Circle(){}

public Circle(double radius,String color,boolean filled){
	setColor(color);
        setFilled(filled);
	this.radius=radius;}
public double getRadius(){
	return radius;
}
public void setRadius(double radius){
	this.radius=radius;
}
public  double getArea(){
	return Math.PI*Math.pow(2,radius);
}

public String toString(){
return "The radius of circle "+radius+"of the subclass"+super.toString();}
}

