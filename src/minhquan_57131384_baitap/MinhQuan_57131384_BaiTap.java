/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhquan_57131384_baitap;

import calculates.CasioCalculator;
import interfaces.ICalculate;

/**
 *
 * @author ASUS
 */
public class MinhQuan_57131384_BaiTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalculate calculate = new CasioCalculator();
        System.out.println("7+8= " +calculate.cong(7, 8));
    }
    
}

