import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle implements Shape {
    private Point origin;
    private float radius;
    private Color color;

    public Circle() {
        this(0, 0, 0.5f, Color.BLACK);
    }

    public Circle(int x, int y, float radius, Color color) {
        this(new Point(x, y), radius, color);
    }

    public Circle(Point origin, float radius, Color color) {
        this.origin = origin;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        int diameter = (int) (this.radius * 2);
        int x = (int) (origin.x - this.radius);
        int y = (int) (origin.y - this.radius);

        g.setColor(this.color);
        g.fillOval(x, y, diameter, diameter);
    }
}