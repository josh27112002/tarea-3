/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.tarea3.newpackage;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Clsinicio {
      
    private static final String[][] cantidad = new String[4][4];
    
    private static final int columna1=0;
    private static final int columna2=1;
    private static final int columna3=2;
    private static final int columna4=3;
    
    private static void IngresarDatos(int fila){
        Scanner can = new Scanner(System.in);
        System.out.println("ingrese la cantidad de fila 1 ");
        cantidad[fila][0]=can.nextLine();     
        System.out.println("ingrese la cantidad de fila 2 ");
        cantidad[fila][1]=can.nextLine();
        System.out.println("ingrese la cantidad de fila 3 ");
        cantidad[fila][2]=can.nextLine();
        System.out.println("ingrese la cantidad de fila 4 ");
        cantidad[fila][3]=can.nextLine();
    }
    
    
    public static void IngresarDatos2(){
        for (int i=0;i<4;i++){ 
            IngresarDatos(i);
        }
    }
    
    public static void sumasFilas(){
        Scanner sum = new Scanner(System.in);
        int dato,suma=0;
       System.out.println("\ningrese la fila a sumar del 1 al 4:");
        dato=sum.nextInt(); 
        if (dato==1){
            for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[0][i]);
            }}else if (dato==2){
                for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[1][i]);
                }}else if(dato==3){
                    for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[2][i]);
                    }}else if(dato==4){
                    for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[3][i]);
                    }}
        
        System.out.println("\nLa suma de la fila "+dato+" es:"+suma);
    }
    
    public static void sumasColumnas(){
        Scanner sum = new Scanner(System.in);
        int dato,suma=0;
       System.out.println("\ningrese la columna a sumar del 1 al 4:");
        dato=sum.nextInt(); 
        if (dato==1){
            for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[i][0]);
            }}else if (dato==2){
                for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[i][1]);
                }}else if(dato==3){
                    for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[i][2]);
                    }}else if(dato==4){
                    for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[i][3]);
                    }}
        
        System.out.println("\nLa suma de la columna "+dato+" es:"+suma);
    }
    
    public static void Diagonalprincipal(){
        int suma=0;
        
        for (int i=0; i < cantidad.length;i++){
            suma= suma + Integer.valueOf(cantidad[i][i]);
        }
        System.out.println("\nLa suma de la diagonal principal es: "+suma);
    }
    
    public static void DiagonalInvera(){
        int suma=0;
        
        for (int i=0; i < cantidad.length;i++){
            suma= suma + Integer.valueOf(cantidad[cantidad.length-1-i][i]);
        }
        System.out.println("\nLa suma de la diagonal Inversa es: "+suma);
    }
    
  
    public static void imprimirDecorado(){
        for(int x=0;x< cantidad.length;x++){
            System.out.print("");
            for (int y=0; y<cantidad[x].length;y++){
                System.out.print(cantidad[x][y]);
                if(y!= cantidad[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    
    public static void MediaTodo(){      
        int suma=0;
        float media1=0.0f;
            
            for (int i=0;i<4;i++){
          suma= suma + Integer.valueOf(cantidad[i][0]);    
          suma= suma + Integer.valueOf(cantidad[i][1]);    
          suma= suma + Integer.valueOf(cantidad[i][2]);         
          suma= suma + Integer.valueOf(cantidad[i][3]);
          media1 = suma/16;
            }
            System.out.println("\nLa media de toda la matriz es: "+media1);
                    
    }
    
    
    
    public static void main(String[] args) {
       IngresarDatos2(); 
       imprimirDecorado();
       sumasFilas();
       sumasColumnas();
       Diagonalprincipal();
       DiagonalInvera();
       MediaTodo();
       

    }
    
    
}
