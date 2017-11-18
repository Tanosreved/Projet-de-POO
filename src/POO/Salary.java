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
public class Salary {
     public static void main(String[] args) {
        Personnel pres = new Personnel();  
       
        /*public ServiceManutention(String matricule,String nom, String prenom,int age, String dateEn,int nombreHeure)*/
        pres.ajouterEmploye(new ServiceManutention("17C0200SM","Maina", "Sergio",20, "2017",200));
        
        /* VendeurServiceCommercial(String matricule,String nom, String prenom,int age, String dateEn,double chiffreAffaire)*/
        pres.ajouterEmploye(new VendeurServiceCommercial("15A0053VSC","Digai", "Remy",17, "2015",1500.0));
       
        /*ServiceManutentionRisque(String matricule,String nom, String prenom,int age, String dateEn,int nombreHeure)*/
        pres.ajouterEmploye(new ServiceManutentionRisque("89SMR3506FD","Moustique", "guy",66, "1989", 7));
        
        /* public RepresentantServiceCommercial(String matricule,String nom, String prenom,int age, String dateEn,double chiffreAffaire)*/
        pres.ajouterEmploye(new RepresentantServiceCommercial("200dh7","Tchou", "Dany", 22, "2003", 25.0));
        
        /* public ServiceProduction(String matricule,String nom, String prenom,int age, String dateEn,int nombreUnite )*/
        pres.ajouterEmploye(new ServiceProduction("07CD2809","Guidame", "Esthere", 18, "2016",95));
      
        
        /*ServiceProductionRisque(String matricule,String nom, String prenom,int age, String dateEn,int nombreUnite ).*/
        pres.ajouterEmploye(new ServiceProductionRisque("2002A02703SPR","Reved", "Salomon", 21, "2002", 300));
       
         
        pres.afficherSalaires();     
        System.out.println("le salaire moyen des employés de la collection. "
                + pres.salaireMoyen() + " francs "); }

    
}
