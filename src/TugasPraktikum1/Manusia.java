/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author Taka
 */
public abstract class Manusia {
    public double TinggiBadan;
    
    public void Manusia(double TB)
    {
        this.TinggiBadan = TB;
    }
    public double getTB()
    {
        return TinggiBadan;
    }
    public abstract double HtgBBI();
}
