package factoryMethod;


public class ShapeFactory {
    public Shape getShape(String a) {
        if (a.equals("C")) return new Circle();
        else if (a.equals("S")) return new Square();
        else return new Rectangle();
    }
}
