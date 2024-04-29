
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BanCo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        JFrame frame = new JFrame("New form");
        
        frame.setLayout(new GridLayout(8, 8));
        
        JButton[] a = new JButton[64];
        for(int i = 0; i < 64; i++){
            a[i] = new JButton();
        }
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) % 2 == 0)
                    a[i * 8 + j].setBackground(Color.BLACK);
                else a[i * 8 + j].setBackground(Color.WHITE);
            }
        }
        
        for(int i = 0; i < 64; i++)
            frame.add(a[i]);
        
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
