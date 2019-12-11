import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Program {

    public static void main(String[] args) {

        //Board board = new Board();

        JFrame frame = new JFrame("FindTheMines");

        JPanel MyPanel = new JPanel();

        frame.setLayout( new GridLayout(10, 10) );  // 10x10 Grid
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton[][] fields = new JButton[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                fields[x][y]   = new JButton("("+x+","+y+")");
                fields[x][y].setSize(new Dimension(40, 40));
                frame.add(fields[x][y]);
            }
        }
        frame.setSize(500, 500);
        frame.setVisible(true);
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        fields[4][4].addMouseListener(listener);

    }

}
