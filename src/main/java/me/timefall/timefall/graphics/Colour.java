package me.timefall.timefall.graphics;

public class Colour implements Cloneable
{
    // Colours
    public static Colour COLOUR_BLACK = new Colour(1, 0, 0, 0);

    public float alpha, red, green, blue;

    public Colour(float alpha, float red, float green, float blue)
    {
        this.alpha = alpha;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour clone()
    {
        return new Colour(alpha, red, green, blue);
    }

    public int getColourInt()
    {
        return ((int) (alpha * 255F + 0.5F) << PixelUtils.ALPHA_SHIFT | (int) (red * 255F + 0.5F) << PixelUtils.RED_SHIFT | (int) (green * 255F + 0.5F) << PixelUtils.GREEN_SHIFT | (int) (blue * 255F + 0.5F));
    }
}
