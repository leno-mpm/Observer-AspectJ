
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorWindows extends JFrame implements ColorObserver {
    private JPanel contentPane;
    private ColorChanger colorChanger;
    
    public ColorWindows() {
        setTitle("Cambiador de Colores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        colorChanger = new ColorChanger();
        colorChanger.subscribe(this);
        
        // Panel principal
        contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        setContentPane(contentPane);
        
        createButton("Rojo", Color.RED);
        createButton("Verde", Color.GREEN);
        createButton("Azul", Color.BLUE);
    }
    
    private void createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(color);
                colorChanger.change(text);
            }
        });
        contentPane.add(button);
    }
    
    @Override
    public void update(String color) {
        System.out.println("[OBSERVER] Color actual: " + color);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorWindows window = new ColorWindows();
            window.setVisible(true);
        });
    }
}