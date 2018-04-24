 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigomorseytexto;
import java.util.Scanner;
/**
 *
 * @author raul_
 */
public class CodigoMorseYTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //  Texto a codigo morse 
         Scanner mensaje = new Scanner(System.in);
   
          String codigo[]= new String[91];
        //Valores del Codigo ASCII de A a Z y Espaciado
          codigo[65]=".- ";
          codigo[66]="-... ";
          codigo[67]="-.-. ";
          codigo[68]="-.. ";
          codigo[69]=". ";
          codigo[70]="..-. ";
          codigo[71]="--. ";
          codigo[72]=".... ";
          codigo[73]=".. "; 
          codigo[74]=".--- ";
          codigo[75]="-.- ";
          codigo[76]=".-.. ";
          codigo[77]="-- ";
          codigo[78]="-. ";
          codigo[79]="--- ";
          codigo[80]=".--. ";
          codigo[81]="--.- ";
          codigo[82]=".-. ";
          codigo[83]="... ";
          codigo[84]="- ";
          codigo[85]="..- ";
          codigo[86]="...- ";
          codigo[87]=".-- ";
          codigo[88]="-..- ";
          codigo[89]="-.-- ";
          codigo[90]="--.. ";
          codigo[32]="  "; //Espaciado 
          //Pidiendo datos al usuario
          System.out.println("Escriba su mensaje:");
          String palabra=mensaje.nextLine();
          //Convierte el mensaje en un array
          palabra=palabra.toUpperCase();
          char texto[]=palabra.toCharArray();
          //Recorriendo el mensaje
          for(int i=0;i<(texto.length);i++){
           int indice=(int)texto[i];
           System.out.print(codigo[indice]+" ");
          }
        
    


System.out.println("\n");      
          
          
//   Codigo Morse a texto 
//Variables
     String cadena;   
     Scanner text =new Scanner(System.in);
//Lectura de datos                 
      System.out.println("Ingrese su mensaje en codigo morse:");
        cadena=text.nextLine();

//Separacion de caracteres
        String [ ] simbolo = cadena.split("\\ ");
        int i=0;
        
        while(i <= simbolo.length-1){
            //Todas las opciones disponibles para cada caso
            if (simbolo[i].equals(".-")){
                 System.out.print("A ");
                 } else if (simbolo[i].equals("-...")){
                 System.out.print("B ");
                  }else if (simbolo[i].equals("-.-.")){
                System.out.print("C ");
                }else if (simbolo[i].equals("-..")){
                System.out.print("D ");
                }else if (simbolo[i].equals(".")){
                System.out.print("E ");
                }else if (simbolo[i].equals("..-.")){
                System.out.print("F ");
                }else if (simbolo[i].equals("--.")){
                System.out.print("G ");
                 }else if (simbolo[i].equals("....")){
                System.out.print("H ");
                }else if (simbolo[i].equals("..")){
                System.out.print("I ");
                }else if (simbolo[i].equals(".---")){
                System.out.print("J ");
                }else if (simbolo[i].equals("-.-")){
                System.out.print("K ");
                }else if (simbolo[i].equals(".-..")){
                System.out.print("L ");
                }else if (simbolo[i].equals("--")){
                System.out.print("M ");
                }else if (simbolo[i].equals("-.")){
                System.out.print("N ");
                }else if (simbolo[i].equals("---")){
                System.out.print("O ");
                }else if (simbolo[i].equals(".--.")){
                System.out.print("P ");
                }else if (simbolo[i].equals("--.-")){
                System.out.print("Q ");
                }else if (simbolo[i].equals(".-.")){
                System.out.print("R ");
                }else if (simbolo[i].equals("...")){
                System.out.print("S ");
                }else if (simbolo[i].equals("-")){
                System.out.print("T ");
                }else if (simbolo[i].equals("..-")){
                System.out.print("U ");
                }else if (simbolo[i].equals("...-")){
                System.out.print("V ");
                }else if (simbolo[i].equals(".--")){
                System.out.print("W ");
                }else if (simbolo[i].equals("-..-")){
                System.out.print("X ");
                }else if (simbolo[i].equals("-.--")){
                System.out.print("Y ");
                }else if (simbolo[i].equals("--..")){
                System.out.print("Z ");
                }else if(simbolo[i].equals(" ")){
                System.out.print("   ");
            }

             i++;
        }
          
//salto de linea
System.out.println("\n"); 
       
    }
    

    }