package org.aio.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalculatorController {
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public TextArea TextAria;
    public int somme;

    public void addZero(ActionEvent actionEvent) {
        TextAria.appendText("+0");
    }

    public void addOne(ActionEvent actionEvent) {
        TextAria.appendText("+1");
        somme += 1;
    }

    public void addTwo(ActionEvent actionEvent) {
        TextAria.appendText("+2");
        somme += 2;
    }

    public void addThree(ActionEvent actionEvent) {
        TextAria.appendText("+3");
        somme += 3;
    }

    public void addFour(ActionEvent actionEvent) {
        TextAria.appendText("+4");
        somme += 4;
    }

    public void addFive(ActionEvent actionEvent) {
        TextAria.appendText("+5");
        somme += 5;
    }

    public void addSix(ActionEvent actionEvent) {
        TextAria.appendText("+6");
        somme += 6;
    }

    public void addSeven(ActionEvent actionEvent) {

        TextAria.appendText("+7");
        somme += 7;
    }

    public void addEight(ActionEvent actionEvent) {
        TextAria.appendText("+8");
        somme += 8;
    }

    public void addNine(ActionEvent actionEvent) {
        TextAria.appendText("+9");
        somme += 8;
    }

    public void emptyTextaria(ActionEvent actionEvent) {
        TextAria.clear();
    }

    public void calculate(ActionEvent actionEvent) {
        TextAria.appendText("="+somme);

    }
}
