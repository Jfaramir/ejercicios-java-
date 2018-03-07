   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;




/**
 *
 * @author Juan Pablo Carpio
 */
public class EjerciciosJava {
    
    
     public void calendario (int n){
        String [] lineas = new String[7];
        if(n>=7){
                n %=7;
                       
        }
        if(n>4){
            for (int i=0; i<7;i++){
                lineas[i] ="";
            }
            String y = " 0";
            int x = 0;
            int dia = 0;
            for (int i=0; i<=5;i++ ){
                for (int j=0;j<lineas.length;j++){
                    if(x>=n){
                        y=" 0";
                        dia +=1;
                    }
                    if(dia > 9) {
                        y= " ";
                    }
                    if (dia > 31 || x<n){
                        y=" XX";
                    }
                    lineas[i] += y;
                    if (dia <= 31 && x>=n){
                        lineas[i] +=dia;
                    }
                    x += 1;
                }
            }
            for (int i=0; i<lineas.length; i++){
                System.out.println(lineas[i]);
            }
        }
        if(n<=4){
            for (int i=0; i<7;i++){
                lineas[i] ="";
            }
            String y = " 0";
            int x = 0;
            int dia = 0;
            for (int i=0; i<=4;i++ ){
                for (int j=0;j<lineas.length;j++){
                    if(x>=n){
                        y=" 0";
                        dia +=1;
                    }
                    if(dia > 9) {
                        y= " ";
                    }
                    if (dia > 31 || x<n){
                        y=" XX";
                    }
                    lineas[i] += y;
                    if (dia <= 31 && x>=n){
                        lineas[i] +=dia;
                    }
                    x += 1;
                }
            }
            for (int i=0; i<lineas.length; i++){
                System.out.println(lineas[i]);
            }
        }
    } 
 
    
    
    
    public boolean anagrama (String p1, String p2 ){
        char[] arrayp1 = p1.toCharArray();
        char[] arrayp2 = p2.toCharArray();
        
        Arrays.sort(arrayp1);
        Arrays.sort(arrayp2);
        if(new String(arrayp1).equals(new String(arrayp2))){
            return true;
        }
        return false;
    }
    public String acronimo (String palabra){
        
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTEVWXYZ";
        String frase = "";    
            for(int i=0;i<palabra.length();i++){
                for (int j=0;j<mayus.length();j++){
                    if (palabra.charAt(i) == mayus.charAt(j)){
                        frase += palabra.charAt(i);
                    }
                }
            }        
        return frase;
        
    } 
    public boolean ejemplosString(String frase){    
        String palindromo = "ACASO HUBO BUHOS ACA" ;       
        String p1 = ("");
        String p2 = ("");
        for (int i=0; i < palindromo.length(); i++){
            if (palindromo.charAt(i) != ' ' ){
                p1 = p1 + palindromo.charAt(i);
            }
        }
        // p1 = ACASOHUBOBUHOSACA
        for (int j = 0; j < p1.length()  ; j++) {
            
                p2 = p2 + p1.charAt(p1.length() - j - 1);     
        }      
       return p1.equals(p2);         
    }
    public boolean isograma(){
        String palabra = "murciegalo";
        for (int i=0; i < palabra.length(); i++){
            for (int j = i + 1; j < palabra.length(); j++) {
                if (palabra.charAt(i) == palabra.charAt(j)){
                    return false;
                }
                
            }

        }
        return true;
    } 
    
    // Nivel 2
    
    
    
    
//    public int []  maximo (int [] listaNumeros){
//        int [] numerosMaximos =  {0,0};
//        
//        for (int i=0; i < listaNumeros.length ; i++){
//            
//            
//            if (numerosMaximos [0] < listaNumeros[i]){
//                numerosMaximos[1] = numerosMaximos[0];
//                numerosMaximos[0] = listaNumeros[i];
//            }   
//            
//            else if (numerosMaximos[1] < listaNumeros[i]){
//                
//                numerosMaximos[1] = listaNumeros[i];
//            }
//        }
//        return numerosMaximos;
//    }


    
    /**
     * @param args the command line arguments
     */
//    public void ejemplosString(){
//        String cadena1 = "Acaso hubo buhos aca";
//        
//        System.out.println(cadena1.charAt(0));
//        System.out.println(cadena1.charAt(7));
//        System.out.println(cadena1.charAt(cadena1.length() - 1));
//        
//        System.out.println(cadena1.substring(6,9));
//        System.out.println(cadena1.substring(11,16));
//        
//        System.out.println(cadena1.substring(17));
//        
//        String[] arrayPalabaras = cadena1.split(" ");
//                
//        System.out.println(arrayPalabaras[2]);
//        
//        System.out.println(cadena1.indexOf('h'));
//        
//    }
    
    public static void main(String[] args) {
        EjerciciosJava ejercicio1 = new EjerciciosJava();
        
        
//       int[] listaNumeros = {50,31,27,2,5,99};
//       int[] listaNumeros2 = {150,31,27,2,5,99};
//       System.out.println (Arrays.toString(ejercicio1.maximo(listaNumeros)));
//       System.out.println (Arrays.toString(ejercicio1.maximo(listaNumeros2)));
         System.out.println(ejercicio1.ejemplosString("ACASO HUBO BUHOS ACA"));
         System.out.println(ejercicio1.isograma());
         System.out.println(ejercicio1.anagrama("mora", "amor"));
         System.out.println(ejercicio1.acronimo("Tecnologias de la Informacion y la Comunicacion"));
         ejercicio1.calendario(5);
         
    }
    
}
