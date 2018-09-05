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
public class Laki_laki extends Manusia {
    public Laki_laki(double TB)
    {
        this.TinggiBadan = TB;
    }
    public double HtgBBI()
    {
        return ((TinggiBadan - 100) - ((TinggiBadan-100) * 0.1));
    }
}
