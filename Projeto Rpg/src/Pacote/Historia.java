package Pacote;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class Historia {
     Personagens principal = new Heroi();
     
     public Historia(Personagens heroi) {
    	 principal = heroi;
    	 
     }
 Scanner ler = new Scanner(System.in);	
     
     
     
     public int pular() {
    	 int opc;
    	 System.out.println("Deseja pular história?\n1 para sim\n2 para não");
    	 opc = ler.nextInt();
    	 return opc;	 
     }
     
     
     public void introHistoria() throws InterruptedException {
		System.out.println(principal.getNome()+" Você precisa me ajudar, a muito tempo atrás antes mesmo do tempo sequer existir nosso destino ja havia sido traçado");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Nosso mundo esta preso em um loop infinito, por incontáveis eras a humanidade repete o ciclo de se auto degradar e destruir");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("No início vivemos pacificamente com os elementos e a natureza, porém a ganancia da humanidade nos leva a um caminho destrutivo");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Algumas pessoas acreditam que esse é o melhor  caminho que o mundo pode seguir e que é a natureza dele repetir esse loop infinitamente. \n"+principal.getNome()
		+" ,somente nos dois podemos quebrar esse ciclo e salvar a humanidade");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("A propósito meu nome é Ícari, e eu consigo viajar pelo tempo, de algum modo eu sei que nós podemos encontrar respostas no passado, VAMOS");
		TimeUnit.SECONDS.sleep(4);
		System.out.println();
		System.out.println("Chegamos, estamos em algum lugar do tempo quando o mundo ainda era jovem, ali, naquela floresta tem algo que pode nos ajudar");
		System.out.println();
	}
     public void usinaHistoria() throws InterruptedException {
         System.out.println("Ícari: Agora temos que ir para o futuro, instantes antes do fim, onde eu serei forçada a reviver o sofrimento de um amigo.");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("\n*Salto no tempo - Ano: 2570 D.A.\n");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("Ícari: Essa é a Usina de Genmópolis, o único local capaz de comportar o último cristal elétrico, precisamos chegar no núcleo para\nimpedir uma catástrofe.");
      }
     public void fimHistoria() throws InterruptedException {
    	 System.out.println("Icari: Eu sei quem esta com o ultimo cristal, ele é meu amigo, o nome dele é Florin.");
    	 TimeUnit.SECONDS.sleep(4);
         System.out.println(principal.getNome() + " e Ícari vão em direção a casa de Florin, real dono da pedra, chegando lá encontram Cintinara com uma faca\napontada para a garganta dele:");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("Cintinara: Bem que Dr. Stein estava certo sobre suas suspeitas, eu estou aqui para recuperar o que é de fato NOSSO… O mundo só estará\nseguro se seguirmos o que o Dr. estava planejando, não teremos chances! Me deem o cristal ou eu corto a garganta desse homem!!");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("Rapidamente " + principal.getNome() + " retira a espada da bainha e avança para cima de Cintinara");
     }
     
     
}
