package Pacote;

public class Boss1 extends Boss{

     public Boss1(String nome) {
     super(nome);
  
	  setVida(h1.getVida()-50);
	  setForca(h1.getForca()-5);
	  setDefesa(h1.getDefesa()-3);
	  setAgilidade(h1.getAgilidade()-4);
	  setPrecisao(h1.getPrecisao()-3);
	 
	}
   
}
