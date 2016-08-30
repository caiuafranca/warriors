package br.com.omnesti.warrios;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public class Guerreiro {
	
	private String nome;
	private int life;
	private int xp;
	private int forca;
	private List<Item> mochila;
	private int distanciaPercorrida;
	
	public Guerreiro(){
		this.nome = "Arcano";
		this.xp = 1;
		this.life = 100;
		this.forca = 10;
		this.mochila = new ArrayList<Item>();
		this.distanciaPercorrida = 0;		
	}
	
	public int atacar(){
		return forca;
	}
	
	public int receberDano(int ataque){
		this.setLife(life-=ataque);
		return getLife();
	}
	
	public void andar(int distanciaGanha){
		this.distanciaPercorrida+= distanciaGanha;
		System.out.println("parabens você percorreu "+ getDistanciaPercorrida()+ " m\n" );
	}
	
	public void recuperar(){}
	
	public void situacao(){
		
		System.out.println(getNome()+ " você esta com\n"+
									"Life: " +getLife() + 
									"\nForça de Ataque: " + getForca()+
									"\nExperiencia de: "+ getXp() +
									"\nQuantidade de Itens: " + getMochila().size());
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public List<Item> getMochila() {
		return mochila;
	}

	public void setMochila(List<Item> mochila) {
		this.mochila = mochila;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

}
