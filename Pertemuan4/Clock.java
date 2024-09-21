import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalTime;

public class Clock extends JFrame{
    private JLabel timeLabel;
    private ClockDisplay clock;

    public Clock(){
        super("Clock");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        LocalTime now = LocalTime.now();
        clock = new ClockDisplay();
        clock.setTime(now.getHour(), now.getMinute(), now.getSecond());

        timeLabel = new JLabel(clock.getTime(), SwingConstants.CENTER);
        timeLabel.setFont(new Font("Poppins", Font.BOLD, 50));

        add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clock.timeTick();
                timeLabel.setText(clock.getTime()); 
            }       
        });
        timer.start();
        timeLabel.setText(clock.getTime());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Clock().setVisible(true);
            }
        });
    }
}
