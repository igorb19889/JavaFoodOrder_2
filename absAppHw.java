package order;
  
  import java.util.Scanner;
  public class absAppHw {
    public static void main(String[] args) {

                Scanner food = new Scanner(System.in);
        
                System.out.println("WELCOME TO MAIN MENU: ");
                System.out.println("Our Menu: ");
                System.out.println("1: Food Menu: ");
                System.out.println("2: Drink Menu: ");
                int menu = food.nextInt();
//==================================FOOD MENU===============================================================
                if( menu == 1) {
                  System.out.println("=== Welcome to Food Menu ===");

                  
                String pizza_name   = "pizza";
                int    pizza_price  = 75;   
        
                String soup_name    = "Soup";
                int    soup_price   = 35;   
        
                String apple_name   = "apple";
                int    apple_price  = 55;   
        
                String salami_name  = "salami";
                int    salami_price = 45;   
                // ==============================================================>
                  System.out.println("1: " + pizza_name  + ": " + pizza_price  + " mdl");
                  System.out.println("2: " + soup_name   + ": " + soup_price   + " mdl");
                  System.out.println("3: " + apple_name  + ": " + apple_price  + " mdl");
                  System.out.println("4: " + salami_name + ": " + salami_price + " mdl");

                  System.out.println("====================");
                  System.out.println(" " + "Alege Produsul! ");
                  System.out.println("====================");
                  // ==============================================================>

                 int food_option = food.nextInt();
  
                 switch ( food_option ) {
                    case 1: System.out.println("Ai ales produsul Nr1: " + pizza_name ) ;break;
                    case 2: System.out.println("Ai ales produsul Nr2: " + soup_name  );break;
                    case 3: System.out.println("Ai ales produsul Nr3: " + apple_name );break;
                    case 4: System.out.println("Ai ales produsul Nr4: " + salami_name);break;
                }
                // ==============================================================>
                System.out.println(" " + "Cite unitati doriti? ");
                System.out.print("====================" );
              //  ===================================================
                int food_quantity = food.nextInt();
                System.out.println(" " + "Ai ales " + food_quantity + ":" + "Buc");
                System.out.println("====================");
                
                // ==============================================================>
                int food_res_pizza  = pizza_price  * food_quantity;
                int food_res_soup   = soup_price   * food_quantity;
                int food_res_apple  = apple_price  * food_quantity;
                int food_res_salami = salami_price * food_quantity;
                // ==============================================================>

                  if( food_option == 1) {
                  System.out.println("1: " + pizza_name  + ": " + pizza_price  + " x " + food_quantity + "buc" + " = " + food_res_pizza + " mdl");
                }
                else if(food_option == 2) {
                  System.out.println("2: " + soup_name   + ": " + soup_price  + " x " + food_quantity + "buc" + " = " + food_res_soup +  " mdl");
                }
                else if(food_option == 3){
                  System.out.println("3: " + apple_name  + ": " + apple_price  + " x " + food_quantity + "buc" + " = " + food_res_apple +  " mdl");
                }
                else if(food_option == 4) {
                  System.out.println("4: " + salami_name + ": " + salami_price + " x " + food_quantity + "buc" + " = " + food_res_salami +  " mdl");
                }
                // ==============================================================>

                int food_result = food_option;

                if(food_result == 1) {
                  food_result = pizza_price * food_quantity;
                }
                else if( food_result == 2) {
                  food_result = soup_price * food_quantity;
                }
                else if( food_result == 3) {
                  food_result = apple_price * food_quantity;
                }
                   else if(food_result == 4) {
                    food_result = salami_price * food_quantity;
                }
                // ==============================================================>

                if ( food_res_pizza >= 500 || food_res_soup >= 500 || food_res_apple >= 500 || food_res_salami >= 500) {
                  System.out.println("===================================");
                  System.out.println("Felicitari!");
                  // System.out.println("De la 500mdl in sus:");
                  System.out.println("Livrare Gratuita la Domiciliu:");
                  System.out.println("===================================");
                  System.out.println("Pentru Confirmare: ");
                  System.out.println("Accesa-ti:");
                  System.out.println(" Nr:3 Livrare Gratis");
                  System.out.println(" Nr:4 Pick-Up");
                  System.out.println("===================================");
                  
                 }
                 // ==============================================================>
                else if( food_res_pizza <= 499 && food_res_soup <= 499 && food_res_apple <= 499 && food_res_salami <= 499) {
                  System.out.println("===================================");
                  System.out.println("Dori-ti Cu livrare la Domiciliu?");
                  System.out.println("Livrarea contra plata: 75mdl");
                  System.out.println("===================================");
                  System.out.println("Va rugam sa face-ti Alegerea? ");
                  System.out.println("===================================");
          
                  System.out.println("Nr:1 Da");
                  System.out.println("Nr:2 Nu");

                  System.out.println("===================================");
                  System.out.println("Livare gratuita Se face de la 500mdl:");
                  System.out.println("===================================");
                }
                // ==============================================================>
                int food_del = 75;
                int food_delivery = food.nextInt();
                int food_total = food_option;
            
                if(food_total == 1) {
                  food_total = food_del + food_res_pizza;
                }
                else if( food_total == 2) {
                  food_total = food_del + food_res_soup;
                }
                else if( food_total == 3) {
                  food_total = food_del + food_res_apple;
                }
                else if(food_total == 4) {
                  food_total = food_del + food_res_salami;
                }
                // ==============================================================>

                switch ( food_delivery ) {
                  case 1:
                  
                    System.out.println("Ai ales Optiunea: Cu livrare la Domiciliu: ");
                    System.out.println("Suma totala spre achitare va fi de:");
                    System.out.print("Total:" + food_total);
                    System.out.println(" mdl:"); 
                    System.out.println("===================================");
                    System.out.println("Pentru mai multe detalii,astepta-ti sunetul Operatorului!");

                    break;

                    case 2:
                    System.out.println("Ai ales Optiunea fara Livrare:");
                    System.out.println("Suma totala spre achitare va fi de:");
                    System.out.print("Total: " + food_result);
                    System.out.println("mdl");
                    System.out.print("Pentru a ridica Produsul: Va asteptam pe Adresa: Bucuresti 49/5: ");
                    break;

                    case 3:
                    System.out.println("Ai ales Optiunea: livrare Gratuita la Domiciliu: ");
                    System.out.println("Suma totala spre achitare va fi:");
                    System.out.print("Total: " + food_result);
                    System.out.println(" mdl:");
                    System.out.println();
                    System.out.println("Pentru mai multe detalii,astepta-ti sunetul Operatorului!");
                    System.out.println("Va multumim pentru alegere!");

                    break;

                    case 4:
                    System.out.println("Ai ales Optiunea: Pick-Up ");                  
                    System.out.println("Suma totala spre achitare va fi de:");
                    System.out.print("Total: " + food_result);
                    System.out.println(" mdl:");
                    System.out.println("Va asteptam la Adresa: Dacia 49/5: ");
                    System.out.println("Sa ave-ti o zi cit mai frumoasa: ");
                    break;

                  default:
                    break;
                    // ==============================================================>
                }
                
                // int Scanner = food.nextInt();
                // Scanner scanner = new Scanner(System.in);
            }
    
  
//==================================DRINK MENU=================================================================
  
    Scanner drink = new Scanner(System.in); {
                    if(menu == 2) {
                  System.out.println("=== Welcome to Drink Menu ===");
                
                    
                String beer_name  = "Beer";
                int    beer_price = 100;   
                
                String soda_name  = "Soda";
                int    soda_price = 105;   
        
                String cola_name  = "Cola";
                int    cola_price = 85;   
        
                String wather_name  = "Wather";
                int    wather_price = 15;   
                    
                 // ==============================================================>
                  System.out.println("1: " + beer_name + " " + beer_price + " mdl");
                  System.out.println("2: " + soda_name + " " + soda_price + " mdl");
                  System.out.println("3: " + cola_name + " " + cola_price + " mdl");
                  System.out.println("4: " + wather_name + " " + wather_price + " mdl");

                  System.out.println("====================");
                  System.out.println(" " + "Alege Produsul! ");
                  System.out.println("====================");
                  // ============================================================>
                 int drink_option = drink.nextInt();

                 switch ( drink_option ) {
                    case 1: System.out.println("Ai ales produsul Nr1: " + beer_name ) ;break;
                    case 2: System.out.println("Ai ales produsul Nr2: " + soda_name  );break;
                    case 3: System.out.println("Ai ales produsul Nr3: " + cola_name  );break;
                    case 4: System.out.println("Ai ales produsul Nr4: " + wather_name);break;
                }
                System.out.println(" " + "Cite unitati doriti? ");
                System.out.print("====================" );
                //=================================================================>
                
                int drink_quantity = drink.nextInt();
                System.out.println(" " + "Ai ales " + drink_quantity + "Buc");
                System.out.println("====================");
                //---------------------------------------------------------------->
                
                int drink_res_beer = beer_price * drink_quantity;
                int drink_res_soda = soda_price * drink_quantity;
                int drink_res_cola = cola_price * drink_quantity;
                int drink_res_wather = wather_price * drink_quantity;

                // ===============================================================>
                if( drink_option == 1) {
                  System.out.println("1: " + beer_name  + ": " + beer_price  + " x " + drink_quantity + "buc" + " = " + drink_res_beer + " mdl");
                }
                else if(drink_option == 2) {
                  System.out.println("2: " + soda_name   + ": " + soda_price  + " x " + drink_quantity + "buc" + " = " + drink_res_soda +  " mdl");
                }
                else if(drink_option == 3){
                  System.out.println("3: " + cola_name  + ": " + cola_price  + " x " + drink_quantity + "buc" + " = " + drink_res_cola +  " mdl");
                }
                else if(drink_option == 4) {
                  System.out.println("4: " + wather_name + ": " + wather_price + " x " + drink_quantity + "buc" + " = " + drink_res_wather +  " mdl");
                }
                // ===============================================================>
                int drink_result = drink_option;

                if(drink_result == 1) {
                  drink_result = beer_price * drink_quantity;
                }
                else if( drink_result == 2) {
                  drink_result = soda_price * drink_quantity;
                }
                else if( drink_result == 3) {
                  drink_result = cola_price * drink_quantity;
                }
                   else if(drink_result == 4) {
                    drink_result = wather_price * drink_quantity;
                }
                // ==============================================================>
                if( drink_res_beer <= 499 && drink_res_soda <= 499 && drink_res_cola <= 499 && drink_res_wather <= 499 ) {
                  System.out.println("===================================");
                  System.out.println("Dori-ti Cu livrare la Domiciliu?");
                  System.out.println("Livrarea contra plata 75mdl");
                  System.out.println("===================================");
                  System.out.println("Va rugam sa face-ti Alegerea? ");
                  System.out.println("===================================");
          
                  System.out.println("Nr:1 Da");
                  System.out.println("Nr:2 Nu");

                  System.out.println("===================================");
                  System.out.println("Livare gratuita Se face de la 500mdl:");
                  System.out.println("===================================");
                }
                 // ==============================================================>
                 if( drink_res_beer >= 500 || drink_res_soda >= 500 || drink_res_cola >= 500 || drink_res_wather >= 500) {
                  System.out.println("===================================");
                  System.out.println("Felicitari!");
                  System.out.println("De la 500mdl in sus:");
                  System.out.println("Livrare la Domiciliu este gratuita:");
                  System.out.println("===================================");
                  System.out.println("Pentru Confirmare: ");
                  System.out.println("Accesa-ti:");
                  System.out.println("Nr:3 - Livrare Gratuita:");
                  System.out.println("Nr:4 - In Magazin:");
                  System.out.println("===================================");
                 }
                 // ==============================================================>

                int drink_del = 75;
                int drink_delivery = drink.nextInt();
                int drink_total = drink_option;
              

                if(drink_total == 1) {
                  drink_total = drink_del + drink_res_beer;
                }
                else if( drink_total == 2) {
                  drink_total = drink_del + drink_res_soda;
                }
                else if( drink_total == 3) {
                  drink_total = drink_del + drink_res_cola;
                }
                else if(drink_total == 4) {
                  drink_total = drink_del + drink_res_wather;
                }
              // ==============================================================>

                switch ( drink_delivery) {
                  case 1:
                  
                    System.out.println("Ai ales Optiunea: Cu livrare la Domiciliu: ");
                    System.out.println("Suma totala spre achitare va fi:");
                    System.out.print("Total: " + drink_total );
                    System.out.println(" mdl:");
                    System.out.print("===================================");
                    System.out.println();
                    System.out.println("Pentru mai multe detalii,astepta-ti sunetul Operatorului!");
                    System.out.println("==================================");
                    break;

                    case 2:
                    System.out.println("Ai ales Optiunea fara Livrare:");
                    System.out.println("Suma totala spre achitare va fi:");
                    System.out.print("Total: " + drink_result);
                    System.out.println("mdl");
                    System.out.print("Pentru a ridica Produsul: Va asteptam pe Adresa: Bucuresti 49/5: ");
                    System.out.println("==================================");
                    break;

                    case 3:
                    System.out.println("Ai ales Optiunea: livrare Gratuita la Domiciliu: ");
                    System.out.println("Suma totala spre achitare va fi:");
                    System.out.print("Total: " + drink_result);
                    System.out.print(" mdl:");
                    System.out.println();
                    System.out.println("Pentru mai multe detalii,astepta-ti sunetul Operatorului!");
                    System.out.println("Va multumim pentru alegere!");
                    System.out.println("==================================");
                    break;

                    case 4:
                    System.out.println("Ai ales Optiunea: In Magazin ");                  
                    System.out.println("Suma totala spre achitare va fi de:");
                    System.out.print("Total: " + drink_result);
                    System.out.print(" mdl:");
                    System.out.println();
                    System.out.println("Va asteptam la Adresa: Dacia 49/5: ");
                    System.out.println("Sa ave-ti o zi cit mai frumoasa: ");
                    System.out.println("==================================");
                    break;

                  default:
                    break;
                }
                // ==============================================================>
                 int Scanner = drink.nextInt();
                Scanner scanner = new Scanner(System.in);
              }
          
              }
      
              }}
          
        
        
        // HW1: 
        //                 write an app that lets users order drinks online
        //                    1. outputs the name and price of drink
        //                    2. asks user for quantity:
        //                    3. after the quantity ins inputed calculates the price
        //                    4. calculate delivery cost like this:
        //                     if the order contains 5+ drinks -> delivery cost is free
        //                       otherwise the cost if 100












          



    

