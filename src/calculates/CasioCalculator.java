/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculates;

import interfaces.ICalculate;

/**
 *
 * @author ASUS
 */
public class CasioCalculator implements ICalculate{

    @Override
    public int cong(int s1, int s2) {
        return s1+s2;
    }

    @Override
    public int tru(int s1, int s2) {
        return s1-s2;
    }

    @Override
    public int nhan(int s1, int s2) {
        return s1*s2;
    }

    @Override
    public int chia(int s1, int s2) {
        return s1/s2;
    }
    
}
