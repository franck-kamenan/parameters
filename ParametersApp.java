package be.intecbrussel.hoofdstuk8.parameters;

public class ParametersApp
{
    public static void main(String[] args)
    {
        MethodenRectangle unRectangle = new MethodenRectangle();
        unRectangle.setSize(9, 6);
        System.out.println(unRectangle.height);
        System.out.println(unRectangle.width);
        unRectangle.setSize(5.2, 10.7);
        System.out.println(unRectangle.height);
        System.out.println(unRectangle.width);
    }
}
