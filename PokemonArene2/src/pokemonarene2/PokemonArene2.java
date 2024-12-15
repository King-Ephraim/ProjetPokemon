/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonarene2;

/**
 *
 * @author ephraim
 */
public class PokemonArene2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // pokemon de type normal
        PokemonNormal pn1 = new PokemonNormal("Necrozma" , 100 , 10) ;
        PokemonNormal pn2 = new PokemonNormal("Roucoul" , 100 , 10) ;
        
        // pokemon de type eau
        PokemonEau pe1 = new PokemonEau("Léviator", 100, 40) ;
        PokemonEau pe2 = new PokemonEau("Ecrapince", 100, 40) ;
        // pokemon de type feu
        PokemonFeu pf1 = new PokemonFeu("Feunard" , 100 , 30);
        PokemonFeu pf2 = new PokemonFeu("Dracaufeu" , 100 , 30);
        // pokemon de type plante
        PokemonPlante pl1 = new PokemonPlante("Mistherbe" ,100 , 20) ;
        PokemonPlante pl2 = new PokemonPlante("Florizarre" ,100 , 20) ;
        
        // les attaques
        
        pn2.attaquer(pe2);
        pn2.attaquer(pn1);
        
        pf1.attaquer(pl2);
        pf2.attaquer(pn1);
        
        // affichons les informations sur les pokemons attaqués
        pe2.afficher();
        pn1.afficher();
        pl2.afficher();
        pn1.afficher();
                
       
    }
    
    
}
