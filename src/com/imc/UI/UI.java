package com.imc.UI;
import java.awt.*;
import java.awt.event.*;

import com.imc.provider.implementations.CalculationImcProvider;
import com.imc.usecase.*;

public class UI extends Frame {
    private Button calculate;
    private TextField weigthInput, heightInput;
    private Label weigthLabel, heightLabel, Imc;

    private Panel p1 = new Panel();
    private Panel p2 = new Panel();
    private Panel p3 = new Panel();

    public UI() {
        super("IMC CALCULATOR");

        weigthLabel = new Label("Weigth:"); weigthInput = new TextField(15);
        heightLabel = new Label("Height:"); heightInput = new TextField(15);
        calculate = new Button("Calcule");
        Imc = new Label("RESULT");

        setLayout(new GridLayout(2,1));
        p1.setLayout(new GridLayout(2,1));
        p2.setLayout(new GridLayout(2,1));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));

        p1.add(weigthLabel); p1.add(weigthInput);
        p2.add(heightLabel); p2.add(heightInput);
        p3.add(calculate); p3.add(Imc);

        add(p1); add(p2); add(p3);

        calculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CalculationImcProvider equation = new CalculationImcProvider();
                    CalculationImcUseCase total = new CalculationImcUseCase(equation);
                    CalculationImcDTO data = new CalculationImcDTO(weigthInput.toString(), heightInput.toString());

                    float result = total.execute(data);

                    Imc.setText(String.format("%.2f %n", result));
                } catch (Exception err) {
                    Imc.setText("0");
                }
            }
            
        });
    }
}
