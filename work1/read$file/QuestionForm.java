package com.sovannarith.work1.read$file;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionForm extends JFrame {

    JButton jButton;
    ButtonGroup G1;
    JLabel L1;

    // Constructor of Demo class.
    public QuestionForm(MultiChoiceQA qa) {
        this.setLayout(null);
        jButton = new JButton("Check");
        G1 = new ButtonGroup();
        jButton.setBounds(125, 200, 80, 30);
        this.add(jButton);

        int y = 30;
        int count = 0;
        int jRAmount = qa.getAnswers().size();
        JRadioButton radioButtons[] = new JRadioButton[jRAmount];
        JLabel L1 = new JLabel(qa.getQuestion());
        L1.setBounds(20, 0, 250, 50);
        this.add(L1);
        for (String ans : qa.getAnswers()) {
            radioButtons[count] = new JRadioButton();
            radioButtons[count].setText(ans);
            radioButtons[count].setBounds(120, y, 150, 50);
            this.add(radioButtons[count]);
            this.G1.add(radioButtons[count]);
            count++;
            y += 30;
        }

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qual = " ";

                for (JRadioButton b : radioButtons) {
                    if (b.isSelected() && b.getText() == qa.getCorrectAnswer()) {
                        qual = "Bravo, your answer is correct";
                    } else {
                        qual = "Correct answer is " + qa.getCorrectAnswer();
                    }
                }

                // MessageDialog to show information selected radion buttons.
                JOptionPane.showMessageDialog(QuestionForm.this, qual);
            }
        });
    }
} 