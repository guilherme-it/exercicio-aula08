
package aula08;

import java.util.Scanner;

public class Aula08 {

    public static void main(String[] args) {
        String Nome;
        String Email;
        String Senha;
        int x;
        int y;
        
        
        
        Scanner sc = new Scanner(System.in);
        cauculadora u = new cauculadora();
        
        x = sc.nextInt();
        y = sc.nextInt();
        u.Soma(x, y);
        u.Subtracao(x, y);
        u.multiplicacao(x, y);
        u.divisao(x, y);
        
        
      
        Nome = sc.nextLine();
        Email = sc.nextLine();
        Senha = sc.nextLine();
        
       
        usuario u = new usuario();
        u.mostrarNome(Nome);
        u.mostraEmail(Email);
        u.mostraSenha(Senha);
        
        
        
       
        
        
        
       
        
    }
    
}
