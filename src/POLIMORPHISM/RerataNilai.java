/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORPHISM;

/**
 *
 * @author Taka
 */
public class RerataNilai {
    int x1, x2, x3;
    double y1, y2;
    
    //overloading
    public int average(int x1, int x2){
        return (x1+x2)/2;
    }
    public double average(double y1, double y2){
        return (y1+y2)/2;
    }
    public int average(int x1, int x2, int x3){
        return (x1+x2+x3)/3;
    }
}
