/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass8;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class ComplexNumbers {

    protected double a;
    protected double b;

    public ComplexNumbers() {
    }

    public ComplexNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the real part: ");
        a = Double.parseDouble(input.nextLine());
        System.out.println("Enter the virtual part: ");
        b = Double.parseDouble(input.nextLine()); 
    }

    public void output() {
        System.out.println("Complex number is"+a+"+"+b+"i");
    }

    public void add(ComplexNumbers cn) {
        double an = this.getA() + cn.getA();
        double bn = this.getB() + cn.getB();
        ComplexNumbers acn = new ComplexNumbers(an, bn);
        System.out.println("Sum of two complex numbers is " + acn.a+ "+" + acn.b + "i");
    }

    public void sub(ComplexNumbers cn) {
        double an = this.getA() - cn.getA();
        double bn = this.getB() - cn.getB();
        ComplexNumbers scn = new ComplexNumbers(an, bn);
        System.out.println("Difference of two complex numbers is" + scn.a +"+" + scn.b + "i");
    }

    public void mul(ComplexNumbers cn) {
        double an = this.getA() * cn.getA() - this.getB() * cn.getB();
        double bn = this.getB() * cn.getA() + this.getA() * cn.getB();
        ComplexNumbers mcn = new ComplexNumbers(an, bn);
        System.out.println("Product of two complex numbers is " + mcn.a +"+"+ mcn.b + "i");
    }
    public void div(ComplexNumbers cn){
        double an=(this.getA()*cn.getA()-this.getB()*cn.getB())/(int)(Math.pow(cn.getA(), 2)-Math.pow(cn.getB(), 2));
        double bn=(this.getB()*cn.getA()-this.getA()*cn.getB())/(int)(Math.pow(cn.getA(), 2)-Math.pow(cn.getB(), 2));
        ComplexNumbers dcn = new ComplexNumbers(an, bn); 
        System.out.println("Quotient of two complex numbers is "+dcn.a +"+"+dcn.b+"i");
    }
}