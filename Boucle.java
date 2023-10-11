//Definir le nom de la class HelloWorld et la rendre public
public class Boucle {//Debut class
    //Definir le nom de la methode principal et la rendre public
    public static void main(String[] args) {//Debut methode
        //Afficher un la moyenne
       //Boucle.mabouclesimple();
       Boucle.maboucletableau();
       Boucle.maboucletableau2();


    }
    public static void mabouclesimple(){
        System.out.println("La boucle simple");
        for(int i=0;i <10 ;i++){
            if(i==5){
                continue;
                //TODO
                
            }
             System.out.println("La boucle simple " + i);
            if(i==6){
                //TODO
                break;
            }
            
        }
        
     
            
    }
    
    public static void maboucletableau(){
        System.out.println("La boucle tableau entier");
        int[] numbers = {-1,2,3,34,5};
        for(int number :numbers){
            System.out.println(number);
        }
    }
    
     public static void maboucletableau2(){
        System.out.println("La boucle tableau chaine de caractere");
        String[] semaines = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        for(String semaine :semaines){
            System.out.println(semaine);
        }
    }
    
    
    
    
}
