package main.java;

public class ShowParam {
   // Shapes main.java.shapes;

    public String getName(Shapes shapes){
        if (shapes == null)
            return "not found main.java.shapes";

        return "Name shape is " + shapes.getName();
    }

}
