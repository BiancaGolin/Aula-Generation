package Pacote;
import java.util.Random;
public class Monstro extends Personagens {

	
	
	Random aleatorio = new Random();
	public Monstro() {
		super();
		  setVida(aleatorio.nextInt(51)+50);
		  setForca(aleatorio.nextInt(5)+1);
		  setDefesa(aleatorio.nextInt(5)+1);
		  setAgilidade(aleatorio.nextInt(5)+1);
		  setPrecisao(aleatorio.nextInt(5)+1);
		  setTipo(aleatorio.nextInt(5)+1);
  }	
	
} 