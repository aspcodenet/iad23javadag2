// Tips EN KLASS PER JAVA-fil
public class Hello{
    public static void main(String []args){

        String namn = System.console().readLine();

        namn = namn.replace("krig", "****");


        String namnUpper = namn.toUpperCase();
        System.out.println(namnUpper);

        int i = 12;
        if(i == 12){
            System.out.println("YES");
        }

        if(namn.equals("Stefan")){
        //if(namn == "Stefan"){
            System.out.println("Snyggt namn");
        }


        // for loop OFTAST numeriskt 1972-2023
        // for each när vi loopar OBJEKT employees i en ArrayList
        // while - vet inte riktigt när nåt är slut

    //     int x = 1;
    //     while(x <= 10){
    //         System.out.println(x);
    //         x++;
    //     }

    //     for(int i=1;i<=10;i++){
    //         System.out.println(i);
    //     }
            
    //         //Alla år från 2021 -> 1972 (baklänges)
    //     for(int year=2021;year>=1972;year--){
    //         System.out.println(year);
    //     }        





    //     System.out.print("Ange månadsnummer 1-12");        
    //     String monthInput = System.console().readLine();

    //     int month = Integer.parseInt(monthInput);
    //     String monthString;
 

    //     switch (month) {
    //         case 1:  monthString = "January";
    //                  break;
    //         case 2:  monthString = "February";
    //                  break;
    //         case 3:  monthString = "March";
    //                  break;
    //         case 4:  monthString = "April";
    //                  break;
    //         case 5:  monthString = "May";
    //                  break;
    //         case 6:  monthString = "June";
    //                  break;
    //         case 7:  monthString = "July";
    //                  break;
    //         case 8:  monthString = "August";
    //                  break;
    //         case 9:  monthString = "September";
    //                  break;
    //         case 10: monthString = "October";
    //                  break;
    //         case 11: monthString = "November";
    //                  break;
    //         case 12: monthString = "December";
    //                  break;
    //         default: monthString = "Invalid month";
    //                  break;
    //     }
    //     System.out.println(monthString);

 


    //     System.out.print("Vad heter du:");        
    //     String namn = System.console().readLine();
    //     System.out.print("Hur gammal är du:");        
    //     String s = System.console().readLine();
    //     int age = Integer.parseInt(s);
    //     if( age > 48 && namn == "Stefan" ){
    //         System.out.println("Du är ung");
    //     }
    //     else if(age <= 48)
    //     {
    //         System.out.println("Ungdom");
    //     }
    //     else{
    //         System.out.println("Du är verkligen gammal");
    //     }




    //     System.out.print("Hur gammal är du:");        
    //     String s = System.console().readLine();
    //     int age = Integer.parseInt(s);
    //     if( age > 17 ){
    //         System.out.println("Du är myndig");
    //     }else if(age < 6){
    //         System.out.println("Du går ej i skolan ens");            
    //     }



    //     // int i = 12; // VERB nåt vi gör '='
    //     // if(i != 12){

    //     // }
    //     // // <EXPRESSION> - uttryck KOMEMR ATT EVALUERAS
    //     // i = i + 1;
    //     // i++;

    //     // i = i + 5;  // jag gillar
    //     // i += 5;



    //     // if(i == 13){ // jämförelse, '=='
    //     //     System.out.println("Bla bla");
    //     // }




    //     // String namn = "Stefan";
    //     // int year = 123;
    //     // int age = 51;
    //     // age = age + 1;
    //     // System.out.println("Du är " + age + " år");                    
    //     // System.out.println(year);                    
    //     // System.out.println(namn);                    
    // 
}
}


