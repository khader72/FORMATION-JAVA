//Definir le nom de la class HelloWorld et la rendre public
public class Boucle {//Debut class
    //Definir le nom de la methode principal et la rendre public
    public static void main(String[] args) {//Debut methode
        //Afficher un la moyenne
       //Boucle.mabouclesimple();
       Boucle.menu2();
    }
   
     public static void menu(){
        System.out.println("La boucle tableau chaine de caractere");
        String[] semaines = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        for(String semaine :semaines){
            switch (semaine){
                case "Lundi": 
                    System.out.println("Le menu du "+semaine+" est Foutou , sauce claire et grane");
                    System.out.println("**********");
                
                    break;
                case "Mardi": System.out.println("Le menu du "+semaine+" est Placali , sauce gombo et grane");
                    System.out.println("**********");
                case "Mercredi": System.out.println("Le menu du "+semaine+" est Riz , sauce tomate");
                    System.out.println("**********");
                case "Jeudi": System.out.println("Le menu du "+semaine+" est Pizza");
                    System.out.println("**********");
                case "Vendredi": System.out.println("Le menu du "+semaine+" est Burger");  
                    System.out.println("**********");
                case "Samedi": System.out.println("Le menu du "+semaine+" est Igname Frit");
                    System.out.println("**********");
                case "Dimanche": System.out.println("Le menu du "+semaine+" est Pomme de terre frit");
                    System.out.println("**********");
            }
        }
    }
    
    public static void menu2(){
        String[] semaines = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        for(String semaine :semaines){
            System.out.println("Le jour de la semaine est "+semaine);
            if(semaine.equals("Lundi")){
                System.out.println("Le menu du "+semaine+" est Burger");
            }
            if(semaine.equals("Mardi")){
                System.out.println("Le menu du "+semaine+" est Pizza");
            }
        }
    }
    
    
    
    
}
