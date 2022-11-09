class Shape{
    void draw(){
        System.out.println("Shape");
    }
    void fill(){
        System.out.println("Shape filled with color");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}

class Hexagon extends Shape{
    void draw(){
        System.out.println("Hexagon");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Shape obj = new Shape();
        Circle c1 = new Circle();
        Hexagon h1 = new Hexagon();
        obj.draw();
        obj.fill();
        c1.draw();
        h1.draw();
    }
}