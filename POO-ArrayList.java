import java.util.ArrayList;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Employe {
    //Attribu de la class employe
    private String nom;
    private int age;
    float salaire;
    
    //Contructeur par defaut
    public Employe(){
        
    }
    //Constructeur 
    
    public Employe(String nom,int age, float salaire){
        this.nom=nom;
        this.age = age;
        this.salaire=salaire;
    }
    
    //methode
    
    public void afficherSalaire(){
        System.out.println("Le salaire de l'employe est de "+ salaire);
    }
    
    //Encapsulation
    public float getSalaire(){
        return salaire;
    }
    
    
}//Fin class Employe

class Programme{
    public static void main(String[] args){
        //Creation du salaire
        Employe employe1 = new Employe("John Doe",30,3750000);
        Employe employe2 = new Employe("John Dak",30,500000);
        //Employe[] tableauemp = {employe1,employe2};
        ArrayList<Employe> listemploye = new ArrayList<Employe>();
        listemploye.add(employe1);
        listemploye.add(employe2);

        //tableauemp[0] = employe1;
        
        for(Employe emp :listemploye){
            System.out.println("Le salaire de l'employe est de "+ emp.getSalaire());
         
        }

        
        //Affichage du salire
        
    }
}
