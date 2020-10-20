package Pacote;

import java.util.Random;

public class MonstrosDg2 extends Monstro {
private String monstros[]={"Rob^0","Criatura mutante","Experimento falho"};
	
    Random aleatorio = new Random();
	
	public MonstrosDg2() {
		super();
		  setVida(aleatorio.nextInt(51)+50);
		  setForca(aleatorio.nextInt(5)+1);
		  setDefesa(aleatorio.nextInt(5)+1);
		  setAgilidade(aleatorio.nextInt(5)+1);
		  setPrecisao(aleatorio.nextInt(5)+1);
		  setTipo(aleatorio.nextInt(5)+1);
		  setNome(monstros[aleatorio.nextInt(3)]);
  }	

}
