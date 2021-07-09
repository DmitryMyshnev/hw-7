package main.java;

import main.java.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shapes circle = new Circle();
        Shapes ellipse = new Ellipse();
        Shapes quad = new Quad();
        Shapes rectangle = new Rectangle();
        Shapes trapeze = new Trapeze();
        Shapes triangle = new Triangle();

        ShowParam showParam = new ShowParam();
        System.out.println(showParam.getName(circle));
        System.out.println(showParam.getName(ellipse));
        System.out.println(showParam.getName(quad));
        System.out.println(showParam.getName(rectangle));
        System.out.println(showParam.getName(trapeze));
        System.out.println(showParam.getName(triangle));
    }
}
