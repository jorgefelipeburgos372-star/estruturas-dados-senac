package Recursividade;
import java.util.Scanner;


public class Recursividadade {
  public static void main(String[] args) {
 Scanner J = new Scanner(System.in);
  System.out.println("Digite o valor de n :");
int n = J.nextInt();

    
    System.out.println(somaRecursiva(n));
    System.out.println(somaIterativa(n));                                                                                           
    

}
  
public static int somaRecursiva (int n) {
   if (n <= 0) {
    return 0;
   }
 return n + somaRecursiva(n - 1);
}


public static int somaIterativa(int n) {
  int soma = 0;
  for (int i = 1; i <= n; i++) {
    soma += i;
  }
  return soma;
  }
}
 



