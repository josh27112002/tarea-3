/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.tarea3;

/**
 *
 * @author Josue
 */
public class tarea3 {
       
    private static String[][] fa = new String[10][30];
    
    private static void cargaMatriz2(){
        for (int c=0; c<fa[0].length;c++){ 
            for (int f=0; f<fa.length;f++){
                fa[f][c]="\tx";
            }
        
        }
    }
    
    private static void imprimeMatriz2(){
        for (int c=0; c<fa[0].length;c++){ 
            for (int f=0; f<fa.length;f++){
                System.out.print(fa[f][c]);
            }
            System.out.println(" ");
        }
    }
    
    public static void comParImpar1(){
        System.out.println("Matris No.3");
        int can =2;
        int imp =1;
        for(int p=0; p<fa.length; p++){
            for (int f=0; f<fa[0].length; f++){
                if (f%2==0){
                    can=can+2;
                    fa[p][f]="\t+"+can;
                }else if (p%1==0){
                    imp=imp+2;
                    fa[p][f]="\t-"+imp;
                }    
            }
            }
    }
    
    
    public static void main(String[] args) {

        cargaMatriz2();
        comParImpar1();
        imprimeMatriz2();
        
    }
    
    
}

