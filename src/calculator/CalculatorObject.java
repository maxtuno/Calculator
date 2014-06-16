/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author maxtuno
 */
public class CalculatorObject {

    private Double value;

    public CalculatorObject(String value) {
        this.value = Double.parseDouble(value);
    }

    public CalculatorObject(Double value) {
        this.value = value;
    }

    public Double getAsNumber() {
        return this.value;
    }

    public CalculatorObject mul(CalculatorObject obj) {
        return new CalculatorObject(this.getAsNumber() * obj.getAsNumber());

    }

    public CalculatorObject div(CalculatorObject obj) {
        return new CalculatorObject(this.getAsNumber() / obj.getAsNumber());

    }

    public CalculatorObject add(CalculatorObject obj) {
        return new CalculatorObject(this.getAsNumber() + obj.getAsNumber());

    }

    public CalculatorObject sub(CalculatorObject obj) {
        return new CalculatorObject(this.getAsNumber() - obj.getAsNumber());

    }

    public void show() {
        System.out.println(this.value);
    }
}
