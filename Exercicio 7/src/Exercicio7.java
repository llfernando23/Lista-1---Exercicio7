import java.util.Scanner;

public class Exercicio7 {


    public static void main(String [] args) {

        //1) Pedir lado do quadrado
        //2) Calcular a àrea do quadrado
        //3) Calcular e mostrar o dobro da àrea do quadrado

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();


        int area = lado * lado;
        int dobro = area * 2;
        System.out.println("O dobro da àrea do quadrao" + lado + " é igual a " + dobro);
        




    }
}