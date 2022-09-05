package factoryMethod;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 ky tu C/S/R: ");
        String cha = scanner.next();
        Shape s1 = shapeFactory.getShape(cha);
        s1.draw();

    }

}
