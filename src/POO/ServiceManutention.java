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
public class ServiceManutention extends Employe {
    int nombreHeure;
    public ServiceManutention(String matricule,String nom, String prenom,int age, String dateEn,int nombreHeure)
    { super(matricule, nom,  prenom, age, dateEn,nombreHeure);
     this.nombreHeure=nombreHeure;}
public double calculerSalaire(){
return nombreHeure*65+getsalaireBase();}
}
