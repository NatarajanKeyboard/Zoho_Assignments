package Inheritance;

public class Shape {
    // for encapsulation as well as these should get inherited
    protected float dimension_1;
    protected float dimension_2;

    public float getDimension_1() {
        return dimension_1;
    }
    public float getDimension_2() {
        return dimension_2;
    }

    public void setDimension_1(float dimension_1) {
        this.dimension_1 = dimension_1;
    }
    public void setDimension_2(float dimension_2) {
        this.dimension_2 = dimension_2;
    }
    
    
}

class Circle extends Shape{

    //for encapsulation purposes....
    static private float PI=(float)Math.PI;
    private float radius=dimension_1;               // variable Shadowing


    //getters....
    public static float getPI() {
        return PI;
    }
    public float getRadius() {
        return radius;
    }

    //setters...
    public void setRadius(float radius) {
        this.radius = radius;
    }




    // behaviors
    public float circumference()
    {
        return 2*PI*this.radius;
    }
    public float area()
    {
        return PI*radius*radius;
    }

}
class Rectangle extends Shape
{

    // behaviours
    public float perimeter()
    {
        return 2*(dimension_1+dimension_2);
    }

    public float area()
    {
        return dimension_1*dimension_2;   
    }
}
