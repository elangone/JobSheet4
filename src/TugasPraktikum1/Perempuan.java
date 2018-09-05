/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author 
 */
final class Perempuan extends Manusia {
    public Perempuan (double TB)
    {
        this.TinggiBadan = TB;
    }
    public double HtgBBI()
    {
        return (TinggiBadan - 100)-((TinggiBadan - 100) * 0.15);
    }
}
