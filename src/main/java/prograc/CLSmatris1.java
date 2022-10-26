/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograc;

/**
 *
 * @author Josue
 */
public class CLSmatris1 {
     private static String[][] ma = new String[8][8];
    
   //////matris no.1
    private static void cargaMatriz1(){
        for (int c=0; c<ma[0].length;c++){ 
            for (int f=0; f<ma.length;f++){
                ma[f][c]="\tx";
            }
        
        }
    }
    
    
    private static void imprimeMatriz1(){
        for (int c=0; c<ma[0].length;c++){ 
            for (int f=0; f<ma.length;f++){
                System.out.print(ma[f][c]);
            }
            System.out.println(" ");
        }
    }
    
    public static void columnasx(){
        System.out.println("Matris No.1");
        for (int f=0; f < ma.length;f++){
            ma[f][f]="\t\\";
            ma[ma.length-1-f][f]="\t\\";
        }
    }

    //////matris no.2
    public static void columnasL(){
        System.out.println("Matris No.2");
        for (int f=0; f < ma.length;f++){
            ma[f-f][f]="\t\\";
            ma[f][f-f]="\t\\";    
            
            ma[ma.length-1-f+f][f]="\t/";
            ma[f][ma.length-1-f+f]="\t/"; 
        }  
    }    
        
//        for (int f=0; f < ma.length;f++){
//            System.out.print("\\");
//            for(int l=0; l<ma[f].length;l++){
//             System.out.print(ma[f][l]);
//             if (l!=ma[f].length-1){
//                System.out.print("\t");
//            }
//            }
//        }

//////matris no.3
 
    public static void comParImpar(){
        System.out.println("Matris No.3");
        int can =2;
        int imp =1;
        for(int f=0; f<ma.length;f++){
            for (int p=0; p<ma[0].length;p++){
                if (p%2==0){
                    can=can+2;
                    ma[p][f]="\t+"+can;
                }else if (f%1==0){
                    imp=imp+2;
                    ma[p][f]="\t-"+imp;
                }
                
                
            }
            }
    }
     public static void main(String[] args) {
//        cargaMatriz1();
//        columnasx();
//        imprimeMatriz1();
//        
//        cargaMatriz1();
//        columnasL();
//        imprimeMatriz1();
        
        cargaMatriz1();
        comParImpar();
        imprimeMatriz1();

    }
   
}
