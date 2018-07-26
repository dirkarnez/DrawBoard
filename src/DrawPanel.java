import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener {
    private static final long serialVersionUID = -6817035652787391530L;

    private List<Shape> shapes;
    protected float radius;

    private float sat = 0.7f;
    private float bri = 0.8f;

    public DrawPanel(float radius) {
        this.shapes = new ArrayList<Shape>();
        this.radius = radius;

        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (Shape shape : shapes) {
            shape.paintComponent(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        shapes.add(new Circle(e.getX(), e.getY(), radius, randHue(sat, bri)));

        repaint();
    }

    private Color randHue(float saturation, float brightness) {
    	 return Color.getHSBColor(new Random(System.currentTimeMillis()).nextFloat(), saturation, brightness);
	}

	@Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}