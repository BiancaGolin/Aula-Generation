package Pacote;

public class Boss extends Personagens {
	
	Heroi h1 = new Heroi();
	
	public Boss(String nome) {
		super();
      setNome(nome);
	  setVida(h1.getVida()-20);
	  setForca(h1.getForca()-2);
	  setDefesa(h1.getDefesa()-2);
	  setAgilidade(h1.getAgilidade()-2);
	  setPrecisao(h1.getPrecisao()-2);
	  
	}
	public void constroiBoss1() {
		  
		  setVida(h1.getVida()-20);
		  setForca(h1.getForca()-2);
		  setDefesa(h1.getDefesa()-2);
		  setAgilidade(h1.getAgilidade()-2);
		  setPrecisao(h1.getPrecisao()-2);
		  setTipo(3);
	}
	public void constroiBoss2() {
		  
		  setVida(h1.getVida()+20);
		  setForca(h1.getForca()-2);
		  setDefesa(h1.getDefesa()-4);
		  setAgilidade(h1.getAgilidade()-2);
		  setPrecisao(h1.getPrecisao()-2);
		  setTipo(4);
	}
	public void constroiBoss3() {
		  
		  setVida(h1.getVida()+60);
		  setForca(h1.getForca()-2);
		  setDefesa(h1.getDefesa()-4);
		  setAgilidade(h1.getAgilidade()-2);
		  setPrecisao(h1.getPrecisao()-2);
		  setTipo(1);
	}
	
	

}
