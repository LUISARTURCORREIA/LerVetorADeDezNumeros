package lervetoradedeznumeros;

import java.util.Scanner;

public class LerVetorADeDezNumeros {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int busca = 10;
        int[] numeros  = new int[busca];
        int achou = 0;
       
       for(int i = 0; i < numeros.length; i++){
           System.out.println("Informe um numero: ");
           numeros[i] = leia.nextInt();
       if(i >= 9){
           System.out.println("Escreva o último numero: ");
           int buscando = leia.nextInt();
       for(int j = 0; j < numeros.length; j++){
          while(true){
              if(buscando == numeros[j]){
                  System.out.println("Achei" +numeros[j]);
                  achou = j;
                   break;
              }
              else{
              System.out.println("Não Achei...");
              break;
          }
          }
       }
       }
       
       }
       
       for(int i=0; i < numeros.length; i++){
           if(i == achou){
               System.out.println("");
           } else{
               System.out.println(numeros[i]);
           }
       }
    }
    
}