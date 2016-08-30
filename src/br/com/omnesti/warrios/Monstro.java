package br.com.omnesti.warrios;

public class Monstro {

	private String nome;
	private int life;
	private int distancia;
	private int dano;
	
	public Monstro(){
		this.nome = "Monstro do Pantano";
		this.distancia = 100;
		this.life = 20;
		this.dano = 5;
	}
	
	public int atacar(){
		return dano;
	}
	
	public int receberDano(int ataque){
		this.setLife(life-=ataque);
		return getLife();
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

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
	
}
