class Shape {
    void draw() {
        System.out.println("I am drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("I am drawing a Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("I am drawing a Square");
    }
}

public class PolyExample {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
