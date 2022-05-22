package ru.gb.siyanov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10]; //массив цифровых кнопок
    JButton[] functionButtons = new JButton[9]; // массив функцилнальных кнопок
    JButton addButton,subButton,mulButton,divButton;
    JButton  equButton, clrButton;
    JPanel panel;

    Font myFont = new Font("SansSerif",Font.BOLD,20); // задаём размер и стиль шрифта

    double num1=0,num2=0,result=0;
    char operator;

    Calculator(){
        // размер окна, название, функция прерывания програмы после нажатия на крестик
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        // панель с выводом данных
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        // создание объектов типа кнопка
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");
        // инициализация массива функциональных кнопок
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = clrButton;
        // задаём шрифт функциональным кнопокам
        for(int i =0;i<6;i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        // задаём шрифт номерных кнопок
        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
// создаём панель с кнопками, сортируем и выравниваем

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }
    //метод выводит в панель данных текстовое значение со значения на кнопке
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        // после нажатия на функциональную кнопку значение в панели вывода записывается в переменную, а панель очищается
        if(e.getSource()==addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='+';
            textfield.setText("");
        }
        if(e.getSource()==subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='-';
            textfield.setText("");
        }
        if(e.getSource()==mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='*';
            textfield.setText("");
        }
        if(e.getSource()==divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='/';
            textfield.setText("");
        }
        if(e.getSource()==equButton) {
            num2=Double.parseDouble(textfield.getText());
            // конвертируем текс в числа и проводим арифметическое действие, результат записывается в переменную
            // и выводится в панель
            switch(operator) {
                case'+':
                    result=num1+num2;
                    break;
                case'-':
                    result=num1-num2;
                    break;
                case'*':
                    result=num1*num2;
                    break;
                case'/':
                    result=num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton) {
            textfield.setText("");
        }

    }
}