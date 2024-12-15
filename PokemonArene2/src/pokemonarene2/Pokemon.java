/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonarene2;

/**
 *
 * @author ephraim
 */
public abstract class Pokemon {
    
    protected String nom ;
    protected double hp ;
    protected double atk ;

    public Pokemon(){};
    public Pokemon( String _nom ,  double _hp ,  double _atk){
        this.nom = _nom ;
        this.hp  = _hp  ;
        this.atk = _atk ;
    }

    //getters && setters

    public String getNom() {
        return nom;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    //methodes
    public boolean isDead(){
        if (this.hp == 0){
            return true;
        }else {
            return false;
        }
    }

    public abstract void attaquer(PokemonNormal p) ;
    public abstract void attaquer(PokemonFeu p) ;
    public abstract void attaquer(PokemonEau p) ;
    public abstract void attaquer(PokemonPlante p) ;
           
    public void afficher(){
        System.out.println("\n\t Nom du pokemon : " + this.nom + " \n\t Points de vie : " + this.hp + " \n\t Force de base : " + this.atk + "\n ==============================");
    }

    

}
