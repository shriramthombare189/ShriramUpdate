import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CursorPositionApplet extends Applet implements MouseMotionListener, KeyListener {
    private String message;

    @Override
    public void init() {
        setBackground(Color.LIGHT_GRAY);
        setSize(400, 400);
        addMouseMotionListener(this);
        addKeyListener(this);
        message = "Move the cursor to see the coordinates.";
        setFocusable(true); // To ensure the applet can receive key events
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString(message, 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        message = "Cursor Position: X = " + x + ", Y = " + y;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Optional: Implement behavior when dragging
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Optional: You can handle key press events here
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: You can handle key release events here
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Optional: You can handle key typed events here
    }
}






























<!DOCTYPE html>
<html>
<head>
    <title>Cursor Position Applet</title>
</head>
<body>
    <applet code="CursorPositionApplet.class" width="400" height="400">
        Your browser does not support applets.
    </applet>
</body>
</html>




















javac CursorPositionApplet.java








appletviewer CursorPositionApplet.html


