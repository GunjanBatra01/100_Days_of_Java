class Chocolate{
    void display(){
        System.out.println("Chocolate class - Super Class");
    }
}

class WhiteChocolate extends Chocolate{
    void show(){
        System.out.println("White Chocolate - Child Class 1\n");
    }
}

class DarkChocolate extends Chocolate{
    void show(){
        System.out.println("Dark Chocolate - Child Class 2\n");
    }
}

class MilkChocolate extends Chocolate{
    void show(){
        System.out.println("Milk Chocolate - Child Class 3\n");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
        WhiteChocolate obj1 = new WhiteChocolate();
        DarkChocolate obj2 = new DarkChocolate();
        MilkChocolate obj3 = new MilkChocolate();
        obj1.display();
        obj1.show();
        obj2.display();
        obj2.show();
        obj3.display();
        obj3.show();
    }
}