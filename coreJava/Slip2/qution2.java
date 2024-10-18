import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    TextField t = new TextField(20), t1 = new TextField(20);
    Label l = new Label("Mouse clicking"), l1 = new Label("Mouse Movement");

    MyFrame(String title) {
        super(title);
        setLayout(new FlowLayout());
        Panel p = new Panel(new GridLayout(2, 2, 5, 5));
        p.add(l); p.add(t); p.add(l1); p.add(t1);
        add(p);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                t.setText("X=" + me.getX() + " Y=" + me.getY());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me) {
                t1.setText("X=" + me.getX() + " Y=" + me.getY());
            }
        });
        setSize(500, 500);
        setVisible(true);
    }
}

class S2A {
    public static void main(String[] args) {
        new MyFrame("Slip Number 2");
    }
}
