//Definir le nom de la class HelloWorld et la rendre public
public class Operation {//Debut class
    //Definir le nom de la methode principal et la rendre public
    public static void main(String[] args) {//Debut methode
        //Afficher un la moyenne
        double x = Operation.moyenne(12,16);
        //Operation monoperation = new Operation();
        //monoperation.moyenne(4,10);
        age(24);
    }
    
    
    public static double moyenne(double a, double b){
        int levelvalue=12;
        double moy=(a+b)/2;
        
       /* if(moy >levelvalue){
            System.out.println("Votre moyenne est " +moy+ " avec une mentien bien");
        }else{
            System.out.println("Votre moyenne est " +moy+ " avec une mentien passable");
        }*/
        //condition ? valeur1 : valeur2;
       String mention =  moy >levelvalue ? "Bien" : "Passable";
       System.out.println("La mention est " +mention);
        return moy;
    }
    
     public static void age(int a){
        int agelevel=18;

        if(a >agelevel){
            System.out.println("Votre age est " +a+ " ,donc tu es un adulte");
        }else{
            System.out.println("Votre age est " +a+ " ,donc tu es un mineur");
        }
    }
    
    
}
