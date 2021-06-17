package com.imc.provider.implementations;
import java.lang.Float;

import com.imc.provider.ICalculationImcProvider;

public class CalculationImcProvider implements ICalculationImcProvider {
    @Override
    public float stringToFloat(String value){
            if(value.contains(",")) {
                String data = value.replace(",", ".");
                return Float.parseFloat(data);
            } else {
                return Float.parseFloat(value);
            }
    }

    @Override
    public float imc(String weigth, String height) {
        return this.stringToFloat(weigth) / (this.stringToFloat(height) * this.stringToFloat(height));
    }
}
