/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra.w.pszenicy;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import javax.swing.Action;
import javax.swing.JButton;

/**
 *
 * @author Sulf
 */
public class Field extends JButton{

    public int x;
    public int y;
    public boolean alive = false;
    
    @Override
    public void setBackground(Color color) {
        super.setBackground(color); //To change body of generated methods, choose Tools | Templates.
        alive = true;
    }
    
    public void is_alive(boolean what)
    {
        if(what)
        {
           super.setBackground(Color.red); 
           alive=what;
        }
        else
        {
            super.setBackground(Color.white);
            alive=what;
        }
    }
    
    public Field(String txt) {   
        super(txt);
        is_alive(false);
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setBackground(Color.red);
            }
        });
    }
}
