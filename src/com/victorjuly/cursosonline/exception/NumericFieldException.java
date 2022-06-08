/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victorjuly.cursosonline.exception;

import javax.swing.JTextField;

/**
 *
 * @author Victor Hugo
 */
public class NumericFieldException extends RuntimeException {
    private JTextField field;
    
    public NumericFieldException(JTextField field, String message) {
        super(message);
        this.field = field;
    }

    public JTextField getField() {
        return field;
    }
    
    
}
