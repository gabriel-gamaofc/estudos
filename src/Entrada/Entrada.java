/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrada;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Entrada {
    public double cap ;
    
    
    public double  captador(){
    Scanner x = new Scanner(System.in);
    System.out.println("Qual seu salário?");
     double salario =  x.nextDouble();
     cap = salario;
     System.out.println("a) "+"O salário antes do reajuste era de R$"+cap);
     return cap;
    }
    
    
    
}
