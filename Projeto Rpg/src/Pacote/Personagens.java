package Pacote;
import java.util.*;

public class Personagens {
	private String nome;
	private String tipos[]= {"Fogo","Água","Planta","Elétrico","Normal"};
	private String tipo;
	protected double vida;
	private int forca;
	private int defesa;
	private int agilidade;
	private int precisao;
	
	Scanner entrada= new Scanner(System.in);
	
	
	public Personagens() {
		super();
		this.nome = null;
		this.tipo = "nulo";
		this.vida = 0;
		this.forca =0 ;
		this.defesa = 0;
		this.agilidade = 0;
		this.precisao = 0;
	}
	

    public void checar() {
    	System.out.println("Nome "+getNome());
    	System.out.println("Vida: "+getVida());
    	System.out.println("Força: "+getForca());
    	System.out.println("Defesa : "+getDefesa());
    	System.out.println("Agilidade: "+getAgilidade());
    	System.out.println("Precisão : "+getPrecisao());
    	System.out.println("Tipo : "+getTipo());
    }
	


	public String[] getTipos() {
		return tipos;
	}


	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public String getTipo() {
		
		return tipo;
	}

	public String getInfo() {
		return nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo( int num ) {
		this.tipo = tipos[num-1];
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public int getForca() {
		return forca;
	}
	public void setForca( int forca) {
		this.forca = forca;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade( int agilidade) {
		this.agilidade = agilidade;
	}
	public int getPrecisao() {
		return precisao;
	}
	public void setPrecisao( int precisao) {
		this.precisao = precisao;
	}

	
	
}