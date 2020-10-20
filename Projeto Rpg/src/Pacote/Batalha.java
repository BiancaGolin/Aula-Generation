package Pacote;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.*;
public class Batalha {
	private boolean vitoria;
	private double vantagemPrincipal;
	private double vantagemInimigo;
	private int turno ;
	Personagens principal;
	Personagens inimigo;
	private boolean fugir;
	private int escolha;
	

	Scanner ler = new Scanner(System.in);
	
	private String tipos[]= {"Fogo","Água","Planta","Elétrico","Normal"};
	Random aleatorio = new Random();
	
	public Batalha(Personagens heroi, Personagens oponente) {
        principal = heroi;
        inimigo = oponente;
		setTurno(1);
        setVitoria(false);
		setFugir(false);
	}
	
	public void iniciarBatalha() {
		System.out.println("O inimigo "+inimigo.getNome()+" Apareceu!");
		while(inimigo.getVida()>0 && principal.getVida()>0 && isFugir()== false) {
			
				miniStatus();
				menu();
				if(getEscolha()==1)
				{
					atacar(principal, inimigo);
					setTurno(getTurno()+1);	
				}
				else if (getEscolha()==2)
				{
					checar(inimigo);
					setTurno(getTurno()+1);
				}
				else if(getEscolha()==3)
				{
					checar(principal);
					setTurno(getTurno()+1);
				}
				else if(getEscolha()==4) {
					System.out.println("Você fugiu!!");
				    fuga();
				}
				
				atacar(inimigo,principal);
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		if(inimigo.getVida()<=0 ){
			System.out.println("Você venceu!!!!");
			setVitoria(true);
		}
		else
		{
			System.out.println("Voce perdeu.....");
		}
		
		
	}
	public void miniStatus() {
		System.out.println();
		System.out.println("PERSONAGEM \t\tINIMIGO ");
		System.out.println(principal.getNome()+"\t\t\t"+inimigo.getNome());
		System.out.println(principal.getVida()+"\t\t\t"+inimigo.getVida());
		System.out.println();
	}
	
	
	
	public void calculaVantagem()
	{ 
		int main=-1;
        int enemy=-1;
        double vantagem;

        for (int i = 0; i < tipos.length; i++) {
            if(principal.getTipo().equals(tipos[i])){
                main = i;
            }
            if(inimigo.getTipo().equals(tipos[i])){
                main = i;
            }
        }

        //nós = fogo, ele = água
        if(main == 0 && enemy == 1) {
            setVantagemInimigo((inimigo.getForca() * 2)/10);
            setVantagemPrincipal(-((principal.getForca() * 2)/10));
        }
        //nós = água, ele = fogo
        else if(main == 1 && enemy == 0) {
            setVantagemPrincipal((principal.getForca() * 2)/10);
            setVantagemInimigo(-((inimigo.getForca() * 2)/10));
        }

        //nós = Planta, ele = Elétrico
        else if(main == 2 && enemy == 3) {
            setVantagemPrincipal((principal.getForca() * 2)/10);
            setVantagemInimigo(-((inimigo.getForca() * 2)/10));
        }

        else if(main == 3 && enemy == 2) {
            setVantagemInimigo((inimigo.getForca() * 2)/10);
            setVantagemPrincipal(-((principal.getForca() * 2)/10));
        }

        else {
            setVantagemInimigo(0.0);
            setVantagemPrincipal(0.0);
        }
	
	}
	
	public void atacar(Personagens agressor, Personagens vitima) {
		calculaVantagem();
		if(agressor.getNome().equals(principal.getNome()))
				{
			      double dano=(agressor.getForca()+vantagemPrincipal+aleatorio.nextInt(11));
			      vitima.setVida((vitima.getVida()-dano));
			      System.out.println("Você atacou e o dano causado foi: "+dano);
			      System.out.println();
				}
		else {
			double dano=(agressor.getForca()+vantagemInimigo+aleatorio.nextInt(7));
			vitima.setVida((vitima.getVida()-dano));
			System.out.println("Você Recebeu um ataque e o dano recebido foi: "+dano);
			System.out.println();
		}	
	}
	
	public void fuga() {
		if(getEscolha()==4) {
			setFugir(true);
		}
		
	}
	
	public void menu() {
		int opc;
		System.out.println();
		System.out.println("Escolha uma opção:");
		System.out.println("1 para atacar");
		System.out.println("2 para chechar Status do inimigo");
		System.out.println("3 para checar Status do personagem");
		System.out.println("4 para fugir ");
		opc= ler.nextInt();
		setEscolha(opc);
	    
	}
	
	
	public void checar(Personagens personagem) {
		personagem.checar();	
    }
	
	public boolean isFugir() {
		return fugir;
	}
	public void setFugir(boolean fugir) {
		this.fugir = fugir;
	}
	public int getEscolha() {
		return escolha;
	}
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	public boolean isVitoria() {
		return vitoria;
	}


	public void setVitoria(boolean vitoria) {
		this.vitoria = vitoria;
	}


	public double getVantagemPrincipal() {
		return vantagemPrincipal;
	}


	public void setVantagemPrincipal(double vantagemPrincipal) {
		this.vantagemPrincipal = vantagemPrincipal;
	}


	public double getVantagemInimigo() {
		return vantagemInimigo;
	}


	public void setVantagemInimigo(double vantagemInimigo) {
		this.vantagemInimigo = vantagemInimigo;
	}


	public int getTurno() {
		return turno;
	}


	public void setTurno(int turno) {
		this.turno = turno;
	}



}
