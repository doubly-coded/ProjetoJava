package com.victorjuly.cursosonline.util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {
    public static int testAndGetNumericField(JTextField field, String name) {
        try {
            int val = Integer.parseInt(field.getText());
            return val;
        } catch (NumberFormatException ex) {
            field.requestFocus();
            JOptionPane.showMessageDialog(null, "Utilize apenas valores numericos no(a) " + name);
        }
        return -1;
    }
    
    public static double testAndGetDoubleField(JTextField field, String name) {
        try {
            double val = Double.parseDouble(field.getText());
            return val;
        } catch (NumberFormatException ex) {
            field.requestFocus();
            JOptionPane.showMessageDialog(null, "Utilize apenas valores numericos no(a) " + name);
        }
        return -1;
    }
}
