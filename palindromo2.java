/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pc
 */
public class palindromo2 {
    public boolean espalindromo(String cadena){
        boolean valor=true ;
        int i,ind ;
        String cadena2="";
        for(int x=0;x<cadena.length();x++){
            if(cadena.charAt(x)!=' '){
                cadena.charAt(x);
            }
            cadena=cadena2;
            ind =cadena.length();
            for (i=0;i<(cadena.length());i++){
                if(cadena.substring(i,i+1).equals(cadena.substring(ind - 1,ind))==false){
                valor=false;
                break;
            }
                ind--;
            }
        }
        return valor;
    }
}
