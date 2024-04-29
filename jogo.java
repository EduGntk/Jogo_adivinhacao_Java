import java.util.Random;
import java.util.Scanner;
public class jogo {
    public static void main(String[] args) {
        Random generator=new Random();
        int numero = generator.nextInt(101);

        Scanner input= new Scanner(System.in);

        System.out.print("Em qual dificuldade vc deseja jogar? \n" + "Fácil (Tecle 1) = 10 tentativas\n" + "Médio (Tecle 2) = 6 tentativas\n" + "Difícil (Tecle 3) = 3 tentativas\n" + "\nDificuldade: ");
        int escolha = input.nextInt();

        if (escolha==1){
            System.out.println("Tente adivinhar um número aleatório de 0 a 100. Vc tem 10 tentativas.");
            for (int i=0 ; i<10 ; i++){
                int resposta=input.nextInt();
                if (resposta==numero){
                    System.out.println("Parabens vc acertou!");
                    break;
                }else if(resposta<numero){
                    System.out.println("Que pena, o numero secreto é maior");
                }else if(resposta>numero){
                    System.out.println("Que pena, o numero secreto é menor");
                }if (i==9){
                    System.out.println("Você não tem mais tentativas, fim de jogo.");
                }
            }
        }else if (escolha==2){
            System.out.println("Tente adivinhar um número aleatório de 0 a 100. Vc tem 6 tentativas.");
            for (int i=0 ; i<6 ; i++){
                int resposta=input.nextInt();
                if (resposta==numero){
                    System.out.println("Parabens vc acertou!");
                    break;
                }else if(resposta<numero){
                    System.out.println("Que pena, o numero secreto é maior");
                }else if(resposta>numero){
                    System.out.println("Que pena, o numero secreto é menor");
                }if (i==5){
                    System.out.println("Você não tem mais tentativas, fim de jogo.");
                }
            }
        }else if (escolha==3){
            System.out.println("Tente adivinhar um número aleatório de 0 a 100. Vc tem 3 tentativas.");
            for (int i=0 ; i<3 ; i++){
                int resposta=input.nextInt();
                if (resposta==numero){
                    System.out.println("Parabens vc acertou!");
                    break;
                }else if(resposta<numero){
                    System.out.println("Que pena, o numero secreto é maior");
                }else if(resposta>numero){
                    System.out.println("Que pena, o numero secreto é menor");
                }if (i==2){
                    System.out.println("Você não tem mais tentativas, fim de jogo.");
                }
            }
        }
        input.close();
    }
}
