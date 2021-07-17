package main.java;

import main.java.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape ellipse = new Ellipse();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape trapeze = new Trapeze();
        Shape triangle = new Triangle();


        ShowParam showParam = new ShowParam();
        System.out.println(showParam.getName(circle));
        System.out.println(showParam.getName(ellipse));
        System.out.println(showParam.getName(quad));
        System.out.println(showParam.getName(rectangle));
        System.out.println(showParam.getName(trapeze));
        System.out.println(showParam.getName(triangle));
    }
}
