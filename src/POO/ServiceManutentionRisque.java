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
public class ServiceManutentionRisque extends ServiceManutention implements EmployeRisque {
    ServiceManutentionRisque(String matricule,String nom, String prenom,int age, String dateEn,int nombreHeure)
    { super(matricule, nom,  prenom, age, dateEn,nombreHeure);}
public double calculerSalaire(){
return super.calculerSalaire()+ primeRisque;}
}
