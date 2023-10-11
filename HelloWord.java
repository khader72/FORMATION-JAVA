// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//Definir le nom de la class HelloWorld et la rendre public
public class Operation {//Debut class
    //Definir le nom de la methode principal et la rendre public
    public static void main(String[] args) {//Debut methode
        //Afficher un message  AKWABA, World!
        System.out.println("AKWABA, World!");
        //Appel de la fonction akwaba sans parametre
        akwaba();
        compare(3,6);
        racine(4);
        
    }//Fin methode
    
    //Definr la methode akwaba
    public static void akwaba(){
        System.out.println("Bienvenue a Yamoussoukro !");
    }
    
    //Methode compare
    public static void compare(int a,int b){
        int monmax=Math.max(a,b);
       // System.out.println("Maximun de "+ a +" et "+ b +" est " + Math.max(a,b));
        System.out.println("Maximun de "+ a +" et "+ b +" est " + monmax);

    }
    
    public static void racine(int a){
        System.out.println("Racine carre de"+ a +" est " + Math.sqrt(a));
    }
    
}//Fin class
