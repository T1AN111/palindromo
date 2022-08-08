/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
    import javax.swing.*;
import com.mycompany.mavenproject2.suma;
import com.mycompany.mavenproject2.suma;
import com.mycompany.mavenproject2.palindromo2;
import java.util.Scanner;
/**
 *
 * @author pc
 */







public class palindromo {
    
 public static void main (String []args){
     int calculos =0;
     Scanner lector=new Scanner(System.in);
     String cadena="";
     char []cadenadearray;
     char caracter;
     int contador=0;
     boolean parar=true;
     while(parar==true){
         calculos=Integer.parseInt(JOptionPane.showInputDialog(null,"selecciones una opcion\n1-palindromo\n2-repetir\n3salir"));
         switch (calculos){
                 case 1:
                 Scanner teclado=new Scanner(System.in);
                 String nuevo;
                 palindromo2 objclass=new palindromo2();
                 System.out.println("ingrese la palabra");
                 nuevo=teclado.nextLine();
                 if(objclass.espalindromo(nuevo)){
                     System.out.println("palindromo");
                 }
                     else
                     {
                     System.out.println("no palindromo");
                             }
         
                 break;
                 case 2:
                System.out.println("ingrese un texto");
                cadenarepeticion=cadenarepeticion.toCharArray();
                cadenadearray=cadenareoeticion.toCharArray();
                for(int i=0;i<cadenadearray.lenght;i++){
                caracter=cadenadearray[i];
                for (int j=0;j<cadenadearray.lenght;j++){
                if(cadenadearray[j=caracter]){
                contador++;
     }
     }
                 break;
                 case 3:
                 
                 break;
     } 
         }
         }
 }
    
}


