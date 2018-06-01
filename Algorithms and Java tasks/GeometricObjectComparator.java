/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class GeometricObjectComparator implements Comparator<GeometricObject> {
    public int compare(GeometricObject a1, GeometricObject a2){
        double area1=a1.getArea();
        double area2=a2.getArea();
        if(area1<area2)
            return -1;
        else if(area1==area2)
            return 0;
        else
            return 1;
    }
}
