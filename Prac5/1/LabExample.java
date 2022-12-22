import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LabExample extends JFrame
{
    public int MilanScore = 0;
    public int MadridScore = 0;
    private void setWinner(){
        if(MadridScore == MilanScore){
            labelWinner.setText("Winner: DRAW");
        }
        else{
            if (MadridScore > MilanScore){
                labelWinner.setText("Winner: Real Madrid");
            }
            else{
                labelWinner.setText("Winner: AC Milan");
            }
        }
    }
    JButton buttonMilan = new JButton("AC Milan");
    Font fntml = new Font("Times new roman",Font.BOLD,20);
    JButton buttonMadrid = new JButton("Real Madrid");
    Font fntma = new Font("Times new roman",Font.BOLD,20);
    JLabel labelResult = new JLabel("Result " + MilanScore + " X " + MadridScore);
    Font fntres = new Font("Times new roman",Font.BOLD,50);

    JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
    Font fntscr = new Font("Times new roman",Font.BOLD,50);

    JLabel labelWinner = new JLabel("Winner: DRAW");
    Font fntwnr = new Font("Times new roman", Font.BOLD, 40);
    LabExample()
    {
        super("Score");
        setLayout(new FlowLayout());
        setSize(250,250);
        add(buttonMilan);
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MilanScore++;
                labelResult.setText("Result " + MilanScore + " X " + MadridScore);
                labelLastScorer.setText("Last scorer: " + "AC Milan");
                setWinner();


            }
        });
        add(buttonMadrid);
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridScore++;
                labelResult.setText("Result " + MilanScore + " X " + MadridScore);
                labelLastScorer.setText("Last scorer: " + "Real Madrid");
                setWinner();
            }
        });
        add(labelResult);
        add(labelLastScorer);
        add(labelWinner);
        setVisible(true);


    }

    public static void main(String[]args)
    {
        new LabExample();
    }
}