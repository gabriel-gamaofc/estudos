/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validacao;

import Entrada.Entrada;

/**
 *
 * @author Gabriel
 */
public class Validacao {

    public void chamada() {
        Entrada x = new Entrada();
        x.captador();
        double sal = x.cap;

        if (sal <= 280) {
            double ajs = (sal * 0.2) + sal;
            System.out.println("O seu sálario apos o reajuste de 20% ficou em R$" + ajs);
            double aum = ajs - sal;
            System.out.println("O aumento foi de R$" + aum);
        }
        if (280 <= sal && sal >= 700) {
            double ajs = (sal * 0.15) + sal;
            System.out.println("O seu sálario apos o reajuste de 15% ficou em R$" + ajs);
            double aum = ajs - sal;
            System.out.println("O aumento foi de R$" + aum);
        }

        if (700 <= sal && sal >= 1500) {
            double ajs = (sal * 0.10) + sal;
            System.out.println("O seu sálario apos o reajuste de 10% ficou em R$" + ajs);
            double aum = ajs - sal;
            System.out.println("O aumento foi de R$" + aum);
        }
        if (sal > 1500) {
            double ajs = (sal * 0.05) + sal;
            System.out.println("O seu sálario apos o reajuste de 20% ficou em R$" + ajs);
            double aum = ajs - sal;
            System.out.println("O aumento foi de R$" + aum);
        }
    }

}
