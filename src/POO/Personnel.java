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
public class Personnel {
        private Employe[] reved;
    private int nbreEmploye; 
    private final static int maxEmploye = 1000000;
    public Personnel() 
        {
   reved = new Employe[maxEmploye];
        nbreEmploye = 0;    }  
 public void ajouterEmploye(Employe e) {
                 ++nbreEmploye;       
                    if (nbreEmploye <= maxEmploye) {
                         reved[nbreEmploye - 1] = e;} else 
                        {System.out.println("Pas plus de " + maxEmploye + " employés");
        }    } 
public double salaireMoyen() {
        double somme = 0.0;       
        for (int i = 0; i < nbreEmploye; i++) {  somme += reved[i].calculerSalaire();  }
        return somme / nbreEmploye; } 


public void afficherSalaires() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(reved[i].getNom() + " gagne "
                    + reved[i].calculerSalaire() + " francs .");
        }    } } 
    

