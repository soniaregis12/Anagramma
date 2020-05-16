package it.polito.tdp.anagramma.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ricerca {
	
	private List<String> soluzione;

	/**
	 * Genera tutti gli anagrammi della parola specificata in ingresso.
	 * @param parola parola da anagrammare
	 * @return elenco di tutti gli anagrammi della parola data
	 */
	public List<String> anagrammi(String parola) {
		this.soluzione = new ArrayList<String>();
		String parziale = "";
		int livello = 0;
		
		parola = parola.toUpperCase();
		List<Character> lettereDisponibili = new ArrayList<Character>();
		for(int i=0; i<parola.length(); i++) {
			lettereDisponibili.add(parola.charAt(i));
		}
		
		cerca(parziale, livello, lettereDisponibili);
		
		return this.soluzione ;
	}
	
	public void cerca(String parziale, int livello, List<Character> lettereDisponibili) {
		//Se sono all' ultimo livello, quindi ho soluzione finale
		if(lettereDisponibili.size() == 0) {
			this.soluzione.add(parziale);
		}
		
		// Caso normale: aggiungo alla soluzione parziale tutti i caratteri presenti tra quelli disponibili
		for(Character ch : lettereDisponibili) {
			String tentativo = parziale + ch;
			
			List<Character> rimanenti = new ArrayList<Character>(lettereDisponibili);
			rimanenti.remove(ch);
			
			cerca(tentativo, livello+1, rimanenti);
		}
		
	}
/*
 * Dato di partenza: parola da anagrammare di lunghezza N
 * Soluzione parziale: una parte dell'anagramma già costruito(primi caratteri)
 * Livello: numero di lettere di cui è composta la soluzione parziale
 * Soluzione finale: soluzione di lunghezza N
 * Caso terminale: salvo soluzione trovata
 * Generazione soluzioni: provare ad aggiungere lettera scegliendo tra quelle non ancora usate nella soluzione parziale
 */
	
}
