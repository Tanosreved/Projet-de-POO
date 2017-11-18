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
public class RepresentantServiceCommercial extends ServiceCommercial  {
    

public RepresentantServiceCommercial(String matricule,String nom, String prenom,int age, String dateEn,double chiffreAffaire){
    super( matricule, nom, prenom, age, dateEn, chiffreAffaire);}
         public double calculerSalaire() {return chiffreAffaire*0.2+ getsalaireBase()+200.0;}

   
}