import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        // Inheritence

        // Rectangle rectangle = new Rectangle("Rectangle", 34, 34,);
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle2 = new Rectangle("Rectangle 2", 45, 35, 54);
        rectangle2.Area();

        // rectangle.Area();
        // rectangle.Display();
        // System.out.println();
        // circle.Area();
        // circle.Display();

    }
}

class Figure {
    String Name;

    void Area() {
        System.out.println("This is the Area of Figure.");
    }

    void Display() {
        System.out.println("This display properties of figure.");
    }
}

class Rectangle extends Figure {

    String Name;
    int length;
    int breath;
    int height;

    Rectangle(String Name, int length, int breath, int height) {
        this.Name = Name;
        this.breath = breath;
        this.length = length;
        this.height = height;
    }

    void Area() {
        System.out.println("This is Area of " + Name + " =  " + "height is : " + height +  (length * breath));
    }

    void Display() {
        System.out.println("Object Shape : " + Name);
        System.out.println("Length : " + length);
        System.out.println("Breath : " + breath);
    }

}

class Circle extends Figure {

    float radius;

    Circle(String Name, float radius) {
        this.Name = Name;
        this.radius = radius;
    }

    void Area() {
        System.out.println("This is the Area of " + Name + " =  " + (radius * radius * 3.14));
    }

    void Display() {
        System.out.println("This is all the properties of : " + Name);
        System.out.println("Radius : " + radius);
    }
}