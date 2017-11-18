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
public abstract class ServiceCommercial extends Employe {
    
    public double chiffreAffaire;
   /* public ServiceCommercial(String matricule,String nom, String prenom,int age, String dateEn,double chiffreAffaire){
                super( matricule, nom, prenom, age,  dateEn, chiffreAffaire);
                this.chiffreAffaire=chiffreAffaire;
    }*/
    public ServiceCommercial(String matricule,String nom, String prenom,int age, String dateEn,double chiffreAffaire){
    super(matricule, nom, prenom, age,  dateEn, chiffreAffaire);
 this.chiffreAffaire=chiffreAffaire;
 }
}
