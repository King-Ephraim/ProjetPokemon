/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonarene2;

/**
 *
 * @author ephraim
 */
public class PokemonPlante extends Pokemon{
    
    public PokemonPlante(){};
    public PokemonPlante(final String _nom , final int _hp , final int _atk){
        super(_nom , _hp , _atk);
    }


    
    @Override
    public void attaquer(PokemonNormal p){
        p.setHp(p.getHp() - this.atk  );
    }
    
    @Override
    public void attaquer(PokemonFeu p){
        p.setHp(p.getHp() - (0.5*this.atk ) );
    }
    
    @Override
    public void attaquer(PokemonEau p){
        p.setHp(p.getHp() - (2*this.atk )  );
    }
   
    @Override
    public void attaquer(PokemonPlante p){
        p.setHp(p.getHp() - (0.5*this.atk ));
    }
    
   
}