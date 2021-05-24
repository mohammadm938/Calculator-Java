package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JButton buttonNumber1;
    JButton buttonNumber2;
    JButton buttonNumber3;
    JButton buttonAdd;
    JButton buttonNumber4;
    JButton buttonNumber5;
    JButton buttonNumber6;
    JButton buttonMult;
    JButton buttonNumber7;
    JButton buttonNumber8;
    JButton buttonNumber9;
    JButton buttonDiv;
    JButton buttonDecimal;
    JButton buttonZero;
    JButton buttonMinus;
    JButton buttonEqual;
    JButton buttonDelete;
    JButton buttonClear;
    JTextField textField;

    String operator = "";
    double firstInput = 0.0;
    double secendInput = 0.0;
    double result;

    public Calculator() {

    }

    public void setupAndShow() {
        frame = new JFrame("Calculator");
        frame.setSize(350, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public void createAndShowButtons() {
        // -------------------------------------------
        // textField
        textField = new JTextField();
        textField.setBounds(30, 40, 280, 40);
        frame.add(textField);


        // -------------------------------------------
        // 1 - 2 - 3 - +
        buttonNumber1 = new JButton("1");
        buttonNumber2 = new JButton("2");
        buttonNumber3 = new JButton("3");
        buttonAdd = new JButton("+");
        buttonNumber1.addActionListener(this);
        buttonNumber2.addActionListener(this);
        buttonNumber3.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonNumber1.setBounds(40, 100, 50, 40);
        buttonNumber2.setBounds(110, 100, 50, 40);
        buttonNumber3.setBounds(180, 100, 50, 40);
        buttonAdd.setBounds(250, 100, 50, 40);
        frame.add(buttonNumber1);
        frame.add(buttonNumber2);
        frame.add(buttonNumber3);
        frame.add(buttonAdd);


        // -------------------------------------------
        // 4 - 5 - 6 - *
        buttonNumber4 = new JButton("4");
        buttonNumber5 = new JButton("5");
        buttonNumber6 = new JButton("6");
        buttonMult = new JButton("*");
        buttonNumber4.addActionListener(this);
        buttonNumber5.addActionListener(this);
        buttonNumber6.addActionListener(this);
        buttonMult.addActionListener(this);
        buttonNumber4.setBounds(40, 170, 50, 40);
        buttonNumber5.setBounds(110, 170, 50, 40);
        buttonNumber6.setBounds(180, 170, 50, 40);
        buttonMult.setBounds(250, 170, 50, 40);
        frame.add(buttonNumber4);
        frame.add(buttonNumber5);
        frame.add(buttonNumber6);
        frame.add(buttonMult);


        // -------------------------------------------
        // 7 - 8 - 9 - /
        buttonNumber7 = new JButton("7");
        buttonNumber8 = new JButton("8");
        buttonNumber9 = new JButton("9");
        buttonDiv = new JButton("/");
        buttonNumber7.addActionListener(this);
        buttonNumber8.addActionListener(this);
        buttonNumber9.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonNumber7.setBounds(40, 240, 50, 40);
        buttonNumber8.setBounds(110, 240, 50, 40);
        buttonNumber9.setBounds(180, 240, 50, 40);
        buttonDiv.setBounds(250, 240, 50, 40);
        frame.add(buttonNumber7);
        frame.add(buttonNumber8);
        frame.add(buttonNumber9);
        frame.add(buttonDiv);


        // -------------------------------------------
        // Decimal - Zero - Minus - Equal
        buttonDecimal = new JButton(".");
        buttonZero = new JButton("0");
        buttonMinus = new JButton("-");
        buttonEqual = new JButton("=");
        buttonDecimal.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDecimal.setBounds(40, 310, 50, 40);
        buttonZero.setBounds(110, 310, 50, 40);
        buttonMinus.setBounds(180, 310, 50, 40);
        buttonEqual.setBounds(250, 310, 50, 40);
        frame.add(buttonDecimal);
        frame.add(buttonZero);
        frame.add(buttonMinus);
        frame.add(buttonEqual);


        // -------------------------------------------
        // Delete - Clear
        buttonDelete = new JButton("Delete");
        buttonClear = new JButton("Clear");
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.setBounds(60, 380, 100, 40);
        buttonClear.setBounds(200, 380, 100, 40);
        frame.add(buttonDelete);
        frame.add(buttonClear);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonNumber1) {
            textField.setText(textField.getText().concat("1"));
        }
        if (actionEvent.getSource() == buttonNumber2) {
            textField.setText(textField.getText().concat("2"));
        }
        if (actionEvent.getSource() == buttonNumber3) {
            textField.setText(textField.getText().concat("3"));
        }
        //-------
        if (actionEvent.getSource() == buttonNumber4) {
            textField.setText(textField.getText().concat("4"));
        }
        if (actionEvent.getSource() == buttonNumber5) {
            textField.setText(textField.getText().concat("5"));
        }
        if (actionEvent.getSource() == buttonNumber6) {
            textField.setText(textField.getText().concat("6"));
        }
        //-------
        if (actionEvent.getSource() == buttonNumber7) {
            textField.setText(textField.getText().concat("7"));
        }
        if (actionEvent.getSource() == buttonNumber8) {
            textField.setText(textField.getText().concat("8"));
        }
        if (actionEvent.getSource() == buttonNumber9) {
            textField.setText(textField.getText().concat("9"));
        }
        //----------------------------
        if (actionEvent.getSource() == buttonZero) {
            textField.setText(textField.getText().concat("0"));
        }
        if (actionEvent.getSource() == buttonAdd) {
            firstInput = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }
        if (actionEvent.getSource() == buttonMinus) {
            firstInput = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }
        if (actionEvent.getSource() == buttonMult) {
            firstInput = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }
        if (actionEvent.getSource() == buttonDiv) {
            firstInput = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }
        if (actionEvent.getSource() == buttonDecimal) {
            textField.setText(textField.getText().concat("."));
        }
        if (actionEvent.getSource() == buttonEqual) {
            if (operator.equals("+")) {
                secendInput = Double.parseDouble(textField.getText());
                result = firstInput + secendInput;
                textField.setText(result + "");
            }
            if (operator.equals("-")) {
                secendInput = Double.parseDouble(textField.getText());
                result = firstInput - secendInput;
                textField.setText(result + "");
            }
            if (operator.equals("*")) {
                secendInput = Double.parseDouble(textField.getText());
                result = firstInput * secendInput;
                textField.setText(result + "");
            }
            if (operator.equals("/")) {
                secendInput = Double.parseDouble(textField.getText());
                result = firstInput / secendInput;
                textField.setText(result + "");
            }
        }
        if (actionEvent.getSource() == buttonClear) {
            operator = "";
            textField.setText("");
        }
        if (actionEvent.getSource() == buttonDelete) {
            String content = textField.getText();
            textField.setText("");
            for (int i = 0; i < content.length() - 1; i++) {
                textField.setText(textField.getText()+content.charAt(i));
            }
        }

    }
}