import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public interface Shape {
    Point getOrigin();
    void setOrigin(Point origin);

    Color getColor();
    void setColor(Color color);

    void paintComponent(Graphics g);
}