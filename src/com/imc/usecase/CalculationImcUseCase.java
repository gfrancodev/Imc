package com.imc.usecase;
import com.imc.provider.ICalculationImcProvider;

public class CalculationImcUseCase {
    private final ICalculationImcProvider Calculation;

    public CalculationImcUseCase(ICalculationImcProvider Calculation){
        this.Calculation = Calculation;
    }

    public float execute(CalculationImcDTO calculate) {
        return this.Calculation.imc(calculate.weigth, calculate.height);
    }

}