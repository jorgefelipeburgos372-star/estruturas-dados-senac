package Recursividade;
import java.util.Scanner;

public class Recursividadade {
  public static void main(String[] args) {
 Scanner J = new Scanner(System.in);
 
double [] n  = new double[5];
double maior_caixa; 
maior_caixa = n[0];
double menor_caixa;
menor_caixa = n [0];
double soma_caixa = 0.0;

  
for (int i = 0; i <= 4; i++) {
  int numero = i + 1;
  System.out.println("Digite o valor do caixa"  + numero + ":");
  n [i] = J.nextDouble();
  int a = 0; 
  
  maior_caixa = n[0];

  for ( a = 1; a < 5; a++){
    if (n[a] > maior_caixa) {
      maior_caixa = n[a];
    }
  }
  }
  
  int b = 0;
  for ( b = 1; b < 5; b++){
    if (n[b] < menor_caixa) {
      menor_caixa = n[b];
    }
  }

  for ( b = 0; b < 5; b++){
      soma_caixa = soma_caixa + n[b];
  }
  
  Double media_caixa = soma_caixa / 5.0;

  System.out.println("Maior valor" + maior_caixa);
  System.out.println("Menor valor" + menor_caixa);
  System.out.println("Total do dia" + soma_caixa);
  System.out.println("Total do dia" + media_caixa);
  J.close();
  }
}

  


                                                                                             
    

   


 



