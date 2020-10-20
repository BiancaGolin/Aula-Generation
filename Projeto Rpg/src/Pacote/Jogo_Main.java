package Pacote;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Jogo_Main {
	public static void main(String args[]) throws InterruptedException 
	{   String nome;
		int num;
		Scanner ler = new Scanner(System.in);
		Personagens character = new Heroi();
		Personagens inimigod = new MonstrosDg1();
		Personagens inimigod2= new MonstrosDg1();
		Batalha batlle= new Batalha(character, inimigod);
		Historia hist = new Historia(character);
	    int opcPular;
	    
		System.out.println("Acorda,acorda..ACORDA!! Ei, você ta bem? Qual seu nome?\nInsira seu nome: ");
		nome= ler.next();
		character.setNome(nome);
		TimeUnit.SECONDS.sleep(2);
		System.out.println(character.getNome()+" né, você parece ter afinidade com os elementos, você lembra seu elemento?");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("1 para elemento Fogo\n2 para elemento Água\n3 para elemento Planta\n4 para elemento Elétrico");
		num = ler.nextInt();
		character.setTipo(num);
		opcPular= hist.pular();
		if(opcPular==1) {
		
		}
		else if(opcPular==2) {
			hist.introHistoria();
		}
		else {
			System.out.println("História pulada");
		}
		
		Dungeon dg1 = new Dungeon(character);
	    dg1.sorteiaBatalhaDg1();
	    dg1.curaPrincipal();
	    dg1.chamaBoss1();
	    dg1.curaPrincipal();
	    
	    opcPular= hist.pular();
		if(opcPular==1) {
		
		}
		else if(opcPular==2) {
			hist.usinaHistoria();
		}
		else {
			System.out.println("História pulada");
		}
	    
	    Dungeon dg2 = new Dungeon(character);
	    dg2.sorteiaBatalhaDg2();
	    dg1.curaPrincipal();
	    dg2.chamaBoss2();
	    dg1.curaPrincipal();
	    
	    opcPular= hist.pular();
		if(opcPular==1) {
		
		}
		else if(opcPular==2) {
			hist.fimHistoria();
		}
		else {
			System.out.println("História pulada");
		}
		dg1.chamaBoss3();
	    
	
	}
		
		
	
}
