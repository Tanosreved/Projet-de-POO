/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author RELEX INFOS
 */
public class ServiceProduction extends Employe 
  {
    
    public int nombreUnite;
    public ServiceProduction(String matricule,String nom, String prenom,int age, String dateEn,int nombreUnite ){
                super(matricule,nom,prenom,age,dateEn,nombreUnite);
                this.nombreUnite=nombreUnite;}
    
    public double calculerSalaire(){ return nombreUnite*5+getsalaireBase();}
    
}
