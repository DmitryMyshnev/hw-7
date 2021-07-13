package main.java;

public class ShowParam {

    public String getName(Shape shapes){
        if (shapes == null)
            return "not found shapes";

        return "Name shape is " + shapes.getName();
    }

}
