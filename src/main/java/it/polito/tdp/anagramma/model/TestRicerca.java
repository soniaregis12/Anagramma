package it.polito.tdp.anagramma.model;

import java.util.List;

public class TestRicerca {

	public static void main(String[] args) {
		Ricerca ric = new Ricerca() ;
		
		List<String> ana_dog = ric.anagrammi("dog") ;
		System.out.println(ana_dog) ;
		
		List<String> ana_vac = ric.anagrammi("vacanze") ;
		System.out.println(ana_vac) ;

		List<String> ana_prg = ric.anagrammi("bau") ;
		System.out.println(ana_prg) ;

	}

}
