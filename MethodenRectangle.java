package be.intecbrussel.hoofdstuk8.parameters;

public class MethodenRectangle
{
    public int height;
    public int width;

    public void setSize(int heightP, int widthP)
    {
        this.height = heightP;
        this.width = widthP;
    }
    public void setSize(double heightP, double widthP)
    {
        this.height = (int) heightP;
        this.width = (int) widthP;
    }
}
