import java.util.*; 
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    
    // code goes here

    String[] palavrasSoltas = str.split("[^a-zA-Z0-9']");
    
    for (int x = 0; x < palavrasSoltas.length; x++){
      
      if (x > 0){
        palavrasSoltas[x] = palavrasSoltas[x].substring(0,1).toUpperCase() + palavrasSoltas[x].substring(1).toLowerCase();
      }
    }

    String palavraJunta = "";

    for (int x = 0; x < palavrasSoltas.length; x++){
        palavraJunta = palavraJunta + palavrasSoltas[x];
    }

    String token = "r1omjb4zc8f";
    String[] tokenSeparado = token.split("");
    String[] palavraJuntaSeparado = palavraJunta.split("");
    int tamanhoArray = tokenSeparado.length + palavraJuntaSeparado.length;
    String resultado = "";

    for (int x = 0; x < tamanhoArray; x++) {
      if(x < palavraJuntaSeparado.length){
        resultado = resultado + palavraJuntaSeparado[x];
      }
      if(x < tokenSeparado.length){
        resultado = resultado + tokenSeparado[x];
      }
    }
    


    
    

    return resultado;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}
