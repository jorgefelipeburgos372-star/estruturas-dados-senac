package exercicio;
import java.util.Scanner; 

    public class Exercicio {
      
    public static void main(String[] args){
    Scanner j = new Scanner(System.in);
    Double [] n = new Double[5];

    for (int i = 0; i <= 4; i++) {
      System.out.println("Digite o valor do caixa" + "" + i + ":");
     n[i] = j.nextDouble();
    }
    Double Total = 0.0;

    for (int i = 0; i <= 4; i++) {
     Total += n[i];
    }
    System.out.println("Total do dia:" + Total );
   
    j.close();  

    

}


public static Double somaCaixa (Double n) {
   if (n <= 0) {
    return 0.0;
   }
 return n + somaCaixa(n - 1);
}


public static Double somaIterativa(Double n) {
    Double soma = 0.0;
  for (int i = 1; i <= n; i++) {
    soma += i;
  }
  return soma;
  }
}
