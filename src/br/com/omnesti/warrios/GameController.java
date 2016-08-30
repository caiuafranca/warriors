package br.com.omnesti.warrios;

import java.util.Scanner;

public class GameController {

	public static void main(String[] args) {
		
		int contadorTempo = 0;
		int distanciaCastelo = 10000;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Nome do seu Guerreiro:");
		String s = scan.next();
		
		Guerreiro g = new Guerreiro();
		g.setNome(s);
		
		while (g.getDistanciaPercorrida()< distanciaCastelo) {
			contadorTempo++;
			
			if(contadorTempo%5 == 1){
				Monstro m = new Monstro();
				System.out.println("Apareceu um "+ m.getNome()+ " com " + m.getDistancia()+
								   " mts de distancia,\né "+m.getLife()+" de Life" );
				
				System.out.println("Sua Situação é:");
				g.situacao();
				
				System.out.println("O que deseja fazer? 1-Atacar ou 2-Fugir");
				int opcao = Integer.parseInt(scan.next());
				switch (opcao) {
					case 1:
						while (m.getLife()> 0) {
							m.receberDano(g.atacar());
							System.out.println("Você Atacou. sua força é "+ g.getForca()+
										       " e deixou o Monstro com\n "+ m.getLife() +" de Life");
							g.receberDano(m.getDano());
						}
						System.out.println("Parabens o " + m.getNome()+ " foi derrotado!!!");
						g.andar(m.getDistancia());
						g.setForca(g.getForca()+10);
						g.setXp(g.getXp()+1);
						break;

					case 2:
						 System.out.println("Você quer fugir?");
						 break;
				}
			}		
			
		}
		System.out.println("Parabens Bravo Guerreiro: " + g.getNome());
		System.out.println("Sua Decicação e seu maior atributo, seja feliz em sua longa jornada.....");	

	}

}
