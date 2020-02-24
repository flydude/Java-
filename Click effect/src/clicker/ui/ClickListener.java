/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author viore
 */
public class ClickListener implements ActionListener {

    private Calculator calc;
    private JLabel jl;

    public ClickListener(Calculator calc, JLabel jl) {
        this.calc = calc;
        this.jl = jl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        String s=""+calc.giveValue();
        jl.setText(s);
    }

}
