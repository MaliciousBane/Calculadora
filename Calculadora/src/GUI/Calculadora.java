/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author USUARIO
 */
public class Calculadora {
    private double num1;
    private double num2;
    private String signo;
    private double result;
    
    public Calculadora (){
        this.signo="";
    }

    public Calculadora(double num1, double num2, String signo, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.signo = signo;
        this.result = result;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    public double calculo(){
    switch (signo){
        case "+":
            this.result = num1+num2;
            return this.result;
        
        case "-":
            this.result = num1-num2;
            return this.result;
            
        case "*":
            this.result = num1*num2;
            return this.result;
            
        case "/":
          this.result = num1/num2;
            return this.result;
            
        
    }
        return 0;
    }
   // this.result = num1/num2;
    
}
