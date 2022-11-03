class Shape{
    void display(){
        System.out.println("Shape Class");
    }
}

class Circle extends Shape{ // Circle inherits Shape
    public void area(){
        System.out.println("Area method");
    }
}

class Sphere extends Circle{ // Sphere inherits Circle
    public void volume(){
        System.out.println("Volume method");
    }
}

public class MultilevelInheritance{
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        obj.display();
        obj.area();
        obj.volume();
    }
}