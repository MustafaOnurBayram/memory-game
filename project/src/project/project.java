package project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;


public class project extends JFrame{

    public JButton[][] buttons;		//We created variables for button and color
    public Color[][] colors;
    public project(){			//Constructor method
        
    	setTitle("Memory Game");		//We set title,size and exit(how to close window)
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        createButtons();		//Create button,start colors and window visible
        setVisible(true);
    }

    
    
    
    
    
    
    public void createButtons(){		//Method for create buttons
        setLayout(new GridLayout(4,4));		//we create 4x4 layout
        buttons =  new JButton[4][4];
        colors = new Color[4][4];

        ArrayList<Color> colorList = new ArrayList<Color>();	//We created the color list and mixed
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        colorList.add(Color.YELLOW);
        colorList.add(Color.ORANGE);
        colorList.add(Color.PINK);
        colorList.add(Color.CYAN);
        colorList.add(Color.MAGENTA);
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        colorList.add(Color.YELLOW);
        colorList.add(Color.ORANGE);
        colorList.add(Color.PINK);
        colorList.add(Color.CYAN);
        colorList.add(Color.MAGENTA);
        Collections.shuffle(colorList);		//It's necessary for different positioning of colors

        int index = 0;
        for (int i =0; i <4;i++){					//We created each button and set the background color
            for (int j = 0;j < 4;j++) {
                buttons[i][j] =new JButton("");
                buttons[i][j].setBackground(Color.BLACK);
                buttons[i][j].addActionListener(new Click(i,j));
                add(buttons[i][j]);
                colors[i][j]= colorList.get(index);
                index++;
            }
        }
    }
    
    
    
    
    
    public class Click implements ActionListener {		//Events that occur when each button is clicked

        public int row;
        public int col;

        public Click(int row, int col) {	//Constructor method that gets the position of the clicked button
            this.row = row;
            this.col = col;
        }

        public void actionPerformed(ActionEvent e) {		//Event that sets the background color when the button is clicked
            buttons[row][col].setBackground(colors[row][col]);
        }
    }



    
    
    
    public static void main(String[] args) {		//The main method creates the project class and makes it visible
        new project();
    }
}