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
public abstract class Employe {
    // declaration des Munir  cette classe d'un constructeur prenant en 
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private String dateEn;
    private static final double salaireBase=110000.0;
    //accesseurs sur les differents variable
    public String getmatricule(){ return matricule;}
    public String getnom(){ return nom;}
    public String getprenom(){ return prenom;}
    public int getage(){ return age;}
    public String getdateEn(){return dateEn;}
    public double getsalaireBase(){return salaireBase;}
    
     //le constructeur par défaut (avec paramètre) prenant en paramètre l'ensemble des attributs nécessaires.
        public Employe(String matricule,String nom, String prenom,int age, String dateEn,double salaireBase)
    {
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.dateEn=dateEn;
     
    }

public abstract double calculerSalaire();

public String getNom(){return "L'employé"+" "+prenom+" "+nom;}


    
}
