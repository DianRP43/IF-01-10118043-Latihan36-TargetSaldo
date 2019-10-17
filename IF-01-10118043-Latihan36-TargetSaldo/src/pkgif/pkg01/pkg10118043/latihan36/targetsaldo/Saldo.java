/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class Saldo {
    public static double saldo = 3500000;
    public static double bunga;   
    public static void main(String[] args) {
        //pembuat format 
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        for (int i = 1;i<=12;i++){
            bunga = saldo * 0.08;
            saldo += bunga;
            if(saldo <= 6500000){
                System.out.printf("Saldo di bulan ke - " + i + " %s%n",rupiah.format(saldo) );
            }
        }
    }
}
