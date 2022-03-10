import java.util.Scanner;

import javax.swing.JOptionPane;
public class IfSimples {
    public static void main(String[] args){
        JOptionPane.showInputDialog("Digite algo");
        //variávelde referência
        Scanner leitor;
        //isso constrói um objeto do tipo Scanner
        //new é semelhante ao malloc da linguagem C
        //temos em funcionamento o Garbage Collector, sem perigo de alocar memória e esquecer o free, free automático
        leitor = new Scanner(System.in); //System.in refere-se aentrada padrão, ler a partir do teclado
        double nota;
        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble(); //nextDouble captura e converte para Double sem parseDouble
        if (nota >= 6){
            System.out.println("Parabéns"); 
            System.out.println("Aprovado");
        }
        leitor.close();
    }
    //outra forma de captura de dados, só para variar    
}
