
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CalcButtons extends JFrame{
    String op1, op2, operator;
    double result;
    boolean startOp2 = false;
    CalcButtons(){
        JTextField tf = new JTextField();
        tf.setBounds(2,10,387,55);
        ActionListener numClickListener = new ActionListener (){

            public void actionPerformed(ActionEvent e) {
                if (startOp2) {
                    tf.setText(e.getActionCommand());
                } else {
                    tf.setText(tf.getText() + e.getActionCommand());

                }
                startOp2 = false;
            }
        };
        JButton b7 = new JButton ("7");
        b7.addActionListener(numClickListener);

        JButton b8 = new JButton ("8");
        b8.addActionListener(numClickListener);

        JButton b9 = new JButton ("9");
        b9.addActionListener(numClickListener);

        JButton b4 = new JButton ("4");
        b4.addActionListener(numClickListener);

        JButton b5 = new JButton ("5");
        b5.addActionListener(numClickListener);

        JButton b6 = new JButton ("6");
        b6.addActionListener(numClickListener);

        JButton b1 = new JButton ("1");
        b1.addActionListener(numClickListener);

        JButton b2 = new JButton ("2");
        b2.addActionListener(numClickListener);

        JButton b3 = new JButton ("3");
        b3.addActionListener(numClickListener);

        JButton b0 = new JButton ("0");
        b0.addActionListener(numClickListener);



        JButton bdot = new JButton (".");
        bdot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tf.getText().indexOf('.') == -1)
                    tf.setText(tf.getText() + ".");

            }

        });

        ActionListener operation = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                op1 = tf.getText();
                operator = e.getActionCommand();
                startOp2 = true;

            }

        };

        JButton bminus = new JButton ("-");
        bminus.addActionListener(operation);

        JButton bplus = new JButton ("+");
        bplus.addActionListener(operation);

        JButton bmulti = new JButton("X");
        bmulti.addActionListener(operation);

        JButton bdive = new JButton("/");
        bdive.addActionListener(operation);



        JButton bcls = new JButton ("CLS");
        bcls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText("");
                op1 = "";
                op2 = "";
                operator = "";
                startOp2 = false;
            }
        });
        JButton bc = new JButton ("C");
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String tfText = tf.getText();
                int end = tfText.length() == 0 ? 0 : tfText.length() - 1;
                tf.setText(tfText.substring(0, end));
            }
        });


        ActionListener equal = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                op2 = tf.getText();
                Double.parseDouble(op1);
                Double.parseDouble(op2);
                //result = Double.parseDouble(op1) + Double.parseDouble(op2);

                switch (operator){
                    case "-":
                        result = Double.parseDouble(op1) - Double.parseDouble(op2);
                        break;
                    case "+":
                        result = Double.parseDouble(op1) + Double.parseDouble(op2);
                        break;
                    case "*":
                        result = Double.parseDouble(op1) * Double.parseDouble(op2);
                        break;
                    case "/":
                        result = Double.parseDouble(op1) / Double.parseDouble(op2);
                        break;
                    case "%":
                        //result = (Double.parseDouble(op1) + Double.parseDouble(op2))*100;
                        //default:
                        result = 0;

                }

                tf.setText(String.valueOf(result));
            }

        };

        JButton bequal = new JButton ("=");
        bequal.addActionListener(equal);



        JButton bgst = new JButton ("GST");
        //bgst.addActionListener(gstper);
        JButton bpercent = new JButton ("%");
        bgst.addActionListener(operation);



        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout (5,4));

        add(tf);
        buttons.add(bcls);
        buttons.add(bgst);
        buttons.add(bpercent);
        buttons.add(bdive);

        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(bmulti);

        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(bminus);

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(bplus);

        buttons.add(b0);
        buttons.add(bc);
        buttons.add(bdot);
        buttons.add(bequal);

        add(buttons);
        buttons.setBounds(2,68,387,310);

        setSize(398,414);
        setResizable(false);
        setTitle("Calculator");
        setLayout (new FlowLayout());
        //setLayout(new GridLayout(4,3));
        setLayout(null);
        setVisible(true);

    }


}