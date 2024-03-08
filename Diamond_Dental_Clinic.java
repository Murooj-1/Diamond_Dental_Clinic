
package Diamond_Dental_Clinic;


//Murooj Al-zahrani


//website to Diamond Dental Clinic


import java.util.Random;//import to make the Random class available to my program
import java.util.Scanner;//import to make the Scanner class available to my program
import java.util.Date;//import to make the Date class available to my program
public class Diamond_Dental_Clinic { //to open the class block


     public static void main(String[] args) {//to open the main block
       Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
       Scanner KeyBoard = new Scanner(System.in);//to creates an object of the class Scanner and names it Scanner


     
       int service = 0 ;//initializing variable-It stores the value of the service entered by the user
       int total=0 ;//initializing variable-Stores the price of all services booked by the user
       int price=0;//initializing variable-Stores the value of each service separately from the other service
         
       String [] Sub_Services = new String [22];/*declare, create, and initialize the array
       (This matrix represents the sub-services in the clinic - that is, there are 23 sub-services)*/
       
       String doctor1 = null;//initializing variable-Stores the name of the doctor chosen by the user
       int age = 0;//initializing variable-It stores the age of the user you entered

     


       //program execution begins here

       //firstly, prints : welcome messages
       System.out.println("---------------------------------------------------------------------------------------------");
       System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
       System.out.println("                 Welcome to Diamond Dental Clinic,\n the clinic that offers you a variety of dental services and many special offers.");
       System.out.println("        Your presence on the clinic website makes us happy,\n and excited to start your journey to make your teeth look like a luminous diamond set");
       System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
       System.out.println("---------------------------------------------------------------------------------------------");
       System.out.println(" please fill out the personal information form below \n to be able to benefit from the services of Diamond dental clinic");
       System.out.println("----------------------------------------------------------------------------------------------");
    
       // Second : the program asks for the user's personal information
      
       System.out.println("First name ");//print : (To direct the user to the next command)
       String name1 = KeyBoard.next();//reads one word from the user
       System.out.println("Last name ");//print : (To direct the user to the next command)
       String name2 = KeyBoard.next();//reads one word from the user
       String Name=name1+" "+name2; //A process that collects a user's first and last name together ,and stores them in variable -Name
       System.out.println("///////////////////////////////////////////////////////////////////");
       //print a welcome message with the addition of the first and last name entered by the user
       System.out.println("          the owner of the wonderful smile: "+ Name+"\n we are pleased to enroll you in the clinic. we wish you healthy teeth always");
       System.out.println("///////////////////////////////////////////////////////////////////");
       boolean  indexnum;//variable declaration to return a true or false value according to the result of the mobile number index test
       String num; // A variable declaration in which the mobile number entered by the user is stored

       System.out.println("Enter the mobile number (start with 05)");//print : (To direct the user to the next command)
       num= input.nextLine();//Allows the user to enter his mobile number
       indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));//to Check the entered mobile number if it consists of 10 digits and starts with 05

        if( indexnum==true) //If the user enters the mobile number with the correct index, the program allows him to continue entering the clinic
        {//to open the if block , Executes what is inside the block if the condition is true
        System.out.println(" Number is valid");//print Number is valid
       }//end of the  block if
        while(indexnum==false){//If the user enters the mobile number with an incorrect index, the loop starts repeating
          //and he is not allowed to continue entering the clinic unless he enters the mobile number in the correct way
         System.out.println(" Number is invalid, Please enter your mobile number again");// print Number is invalid
         System.out.println("Enter the mobile number (start with 05)");//print : (To direct the user to the next command)
         num= input.nextLine();//Allows the user to enter his mobile number
         indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));//to Check the entered mobile number if it consists of 10 digits and starts with 05
       }//end of the  block while
               //In this step, the application will check if the user is an adult or a child
               System.out.println("  Enter the age    ");//print : (To direct the user to the next command)
                age = input.nextInt();//Allows the user to enter the age
                if (age<=12){ //If the user is less than 12 years old, the program shows him an apology letter for the inability of its services to help children under 12 years old
                System.out.println("We apologize, dear user, Diamond dental clinic services are provided to those over 12 years old");
                System.exit(0);//The user exits the entire program
                }//end of the block  if 
                else if (age>12)//If the user is more than 12 years old, he is allowed to benefit from the services of the clinic
                {//to open the else if block

      

       //Second: The program displays the homepage of the user
       
       /*A method Declaration  has been outside the Main Class, her name is (Homepage()) which displays the user's home page 
          and asks him to enter the Category number he wants to move to*/
    
      int Category= Homepage();/*initializing variable-that stores the value of a method (Homepage()) 
                              This value represents the category number that the user wants to move to*/
      
    
     while(Category>=1|| Category<=3)//The loop is repeated whenever the user enters a category number that satisfies the condition
     {//to open the while block
          
  
        switch(Category){//to open the switch Category

            case 1: /*If the value entered by the user in method (Homepage()) , 
                and stored in variable (Category) equals one. it will be moved to About Diamond Dental Clinic*/
                //Display a page containing information about the clinic and its purpose

                System.out.println("------------------~~About Diamond Dental Clinic~~----------------- ");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Diamond dental clinic includes a group of doctors who always strive\n  to provide care based on the latest scientific foundations using the \n latest digital technologies and modern treatment methods.");
                System.out.println("the clinic offers all dental specialties that focus on raising the level \n of preventive oral care in a therapeutic environment that provides \n the highest levels of prevention and sterilization for all our patients\n with the aim of drawing a confident, healthy smile.");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("===================================================================");
                System.out.println("///////////////////////////////////////////////////////////////////");
                System.out.println("///////////////////////////////////////////////////////////////////");
                //A message appears asking the user if he wants to return to the main page or exit the program
                System.out.println("Do you want to return to the homepage? ");
                System.out.println("              1=Yes                     \n              2=No");
                System.out.println("Enter number 1 (yes) or number 2 (no)");
                int homepage = input.nextInt();//Allows the user to enter Desire to come back(1) or leave (2)
                
                
                if (homepage>2|| homepage==0 )//If the user enters a number other than one and two
                     {//to open the if block , Executes what is inside the block if the condition is true
                             do {//The program executes between parentheses (do -while), at least once
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("         The number entered is incorrect,\n  please enter number( 1)  if you want to return to the main page, \n or enter number (2) if you want to exit the program");    
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("Do you want to return to the homepage? ");
                            System.out.println("              1=Yes                     \n              2=No");
                            System.out.println("Enter number 1 (yes) or number 2 (no)");
                            homepage = input.nextInt();//Allows the user to enter Desire to come back(1) or leave (2)
                                   }//end of the block do
                          while(homepage>2||homepage==0 );//The loop is repeated until the user enters the correct number
                                     }//end of the block if(homepage>2|| homepage==0 )
                
            
                if ( homepage==1)//If user enters 1
                {//to open the if block , Executes what is inside the block if the condition is true
               
                  Category=Homepage();/*Display (method (Homepage()), and store the resulting value in a variable( Category),
                  and repeated( loop while(Category>=1|| Category<3)) again*/
                 
                }//end of the block  if 
                
                else if ( homepage == 2) //If user enters 2
                {//to open the else if block , Executes what is inside the block if the condition is true
                System.out.println("************************************************************************************");
                System.out.println("Thank you for checking out the clinic's , we will be lucky if you book next time");
                System.exit(0);//The user exits the entire program
                }//end of the block else if 
                
             

                break; // The program will exit switch

            case 2:  /*If the value entered by the user in method (Homepage()) , 
                and stored in variable (Category) equals 2. it will be moved to Our Services and prices*/
                //display a page containing all the main sections, services provided and their prices

                System.out.println("****************Welcom To our Diamond dental clinic****************") ;
                System.out.println("============================transparent============================");
                System.out.println("       transparent                            2000SAR      ");
                System.out.println("       metallic1                              2500SAR      ");
                System.out.println("       metallic2                              3000SAR      ");
                System.out.println("       ceramics                               3500SAR      ");
                System.out.println("==========================dental implants==========================");
                System.out.println("       Full set of upper and lower dentures   360SAR       ");
                System.out.println("       Full set of teeth for one jaw          180SAR       ");
                System.out.println("       partial dentures 2-6 teeth             360SAR       ");
                System.out.println("==============================Surgery==============================");
                System.out.println("       simple tooth extraction                200SAR       ");
                System.out.println("       surgical extraction                    250SAR       ");
                System.out.println("       abscess treatment and removal          250SAR       ");
                System.out.println("       jaw fracture treatment                 400SAR       ");
                System.out.println("===============================nerve===============================");
                System.out.println("Partial nerve pull                                300SAR       ");
                System.out.println("Primary nerve treatment for the anterior tooth    350SAR       ");
                System.out.println("Primary nerve treatment for the posterior tooth   360SAR       ");
                System.out.println("===============================Rays================================");
                System.out.println("       Xray per one tooth                     150SAR      ");
                System.out.println("       panoramic rays                         150SAR      ");
                System.out.println("       transsectional rays                    200SAR      ");
                System.out.println("===========================Cleaning teeth==========================");
                System.out.println("       cut and clean the gums                 600SAR      ");
                System.out.println("       Full mouth supragingival scaling       580SAR      ");
                System.out.println("       polishing                              900SAR      ");
                System.out.println("==============================bleaching============================");
                System.out.println("       laser teeth whitening                  1000SAR      ");
                System.out.println("       Home bleaching                         650SAR       ");
                System.out.println("       gum supply for one jaw                 800SAR       ");
                System.out.println("===================================================================");
                System.out.println("///////////////////////////////////////////////////////////////////");
                System.out.println("///////////////////////////////////////////////////////////////////");
                //A message appears asking the user if he wants to return to the main page or exit the program
                System.out.println("Do you want to return to the homepage? ");
                System.out.println("              1=Yes                     \n              2=No");
                System.out.println("Enter number 1 (yes) or number 2 (no)");
                homepage = input.nextInt();//Allows the user to enter Desire to come back(1) or leave (2)
                
                
                if (homepage>2|| homepage==0 )//If the user enters a number other than one and two
                     {//to open the if block , Executes what is inside the block if the condition is true
                             do {//The program executes between parentheses (do -while), at least once
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("         The number entered is incorrect,\n  please enter number( 1)  if you want to return to the main page, \n or enter number (2) if you want to exit the program");    
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("Do you want to return to the homepage? ");
                            System.out.println("              1=Yes                     \n              2=No");
                            System.out.println("Enter number 1 (yes) or number 2 (no)");
                            homepage = input.nextInt();//Allows the user to enter Desire to come back(1) or leave (2)
                                   }//end of the block do
                          while(homepage>2||homepage==0 );//The loop is repeated until the user enters the correct number
                            }//end of the block   if (homepage>2|| homepage==0 )
                
                if ( homepage==1)//If user enters 1
                {//to open the if block , Executes what is inside the block if the condition is true
               
                  Category=Homepage();/*Display (method (Homepage()), and store the resulting value in a variable( Category),
                  and repeated( loop while(Category>=1|| Category<=3)) again*/
                 
                }//end of the block  if 
                
                else if ( homepage == 2) //If user enters 2
                {//to open the else if block , Executes what is inside the block if the condition is true
                System.out.println("************************************************************************************");
                System.out.println("Thank you for checking out the clinic's services, we will be lucky if you book next time");
                System.exit(0);//The user exits the entire program
                }//end of the block else if 
    
                break; // The program will exit switch
                    
           
                
            case 3: /*If the value entered by the user in method (Homepage()) , 
                and stored in variable (Category) equals 3 . it will be moved to Our Services and prices*/
               
                    //display basic clinic services
                     System.out.println("=============================services============================== ");
                     System.out.println(" 1- orthodontia\n 2- dental implants\n 3-Surgery\n 4-nerve\n 5-Rays\n 6-Cleaning teeth\n 7-bleaching      ");
                     System.out.println(" ===================================================================");
                     System.out.println(" Enter the number of the service you want to book from     ");  //print : (To direct the user to the next command)
                     
                     /*A method Declaration  has been outside the Main Class, her name is (service()) 
                     The user is asked for the service number he wants to book from,It checks if the service number entered is available or not
                     If it is available, the user is transferred to it,
                     and if it is not available, the user is asked to enter the number again */
                     
                     
                     service = service ();/*Display (method ( service()), and store the resulting value in a variable(  service),
                             This value represents the service number that the user wants to book from*/
                    
                    while ( service >=1 &  service <= 7 )//The number entered by the user must be greater than or equal to 1 and less than or equal to 7 (because the clinic only has 7 services),If the condition is met, the loop is repeated
                    {//to open the loop while block

                  
                        if ( service == 1)// If the user enters the number services 1. it will be moved to orthodontia
                        {//to open the if block , Executes what is inside the block if the condition is true
                            //display The type of orthodontia to be reserved
                           
                          
                             System.out.println("--------------The type of orthodontia to be reserved-------------- ");
                             System.out.println(" 1-  temporary orthodontics\n 2-  permanent orthodontics");
                             System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
                             
                             /*A method Declaration  has been outside the Main Class, her name is (orthodontia()) 
                              The user is asked for Type of  orthodontia he wants to book from,It checks if Type of orthodontia entered is available or not
                              If it is available, the user is transferred to it,
                              and if it is not available, the user is asked to enter the number again */
                         
                             int orthodontia =orthodontia(); /*Display (method (orthodontia ()), and store the resulting value in a variable(orthodontia),
                                     This value represents Type of dental orthodontia that the user wants to book from*/
                          
                            switch(orthodontia)//to defining type of orthodontia for each entry "nested switch" for  if( service == 1)
                            { //to open the switch orthodontia
                                case 1: //If the user enters the type of orthodontia is 1 . it will be moved to temporary orthodontics
                                    //display The type of temporary orthodontic to be reserved
                                    System.out.println("------------Type of temporary orthodontic to be reserved------------");
                                    System.out.println(" 1-  transparent\n 2-   metallic1");
                                    System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
                                    
                                      /*A method Declaration  has been outside the Main Class, her name is (temporary ()) 
                                      The user is asked for Type of temporary orthodontic  he wants to book from,It checks if Type of temporary orthodontic entered is available or not
                                      If it is available, the user is transferred to it,
                                      and if it is not available, the user is asked to enter the number again */

                                    
                                    int tem = temporary ();/*Display (method ( temporary ()), and store the resulting value in a variable(tem),
                                     This value represents Type of temporary orthodontic  that the user wants to book from*/
                                    
                                    switch(tem)//to defining type of temporary orthodontic for each entry "nested switch" for switch orthodontic
                                    {//to open the switch tem
                                        case 1: //If the user enters the Type of temporary orthodontic is 1(transparent) . display Booking details
                                            Sub_Services [0] = "your reservation has been confirmed in section : temporary orthodontics - transparent       2000SAR\n     ";//Assignment statement
                                            price=2000;//Assignment statement
                                            total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                            System.out.println(Sub_Services [0]);//print
                                            System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                            break;// The program will exit switch
                                        case 2 ://If the user enters the Type of temporary orthodontic is 2(metallic1) . display Booking details
                                            Sub_Services [1]= "your reservation has been confirmed in section : temporary orthodontics - metallic1       2500SAS\n";//Assignment statement
                                            price=2500;//Assignment statement
                                            total = total +price ;//Assignment statement (To collect the prices of the reserved services)
                                            System.out.println(Sub_Services [1]);//print
                                            System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                            break; }// The program will exit switch
                                    break;// The program will exit switch
                                
                                
                                case 2: //If the user enters the type of orthodontia is 2 . it will be moved to permanent orthodontics
                                    //display The type of permanent orthodontics to be reserved
                                    System.out.println("------------Type of permanent orthodontics to be reserved------------ ");
                                    System.out.println(" 1-  metallic2\n 2-  ceramics        ");
                                    System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
                                  
                                     /*A method Declaration  has been outside the Main Class, her name is (permanent ()) 
                                      The user is asked for Type of permanent  orthodontic  he wants to book from,It checks if Type of permanent orthodontic entered is available or not
                                      If it is available, the user is transferred to it,
                                      and if it is not available, the user is asked to enter the number again */
                            
                                    
                                    int per = permanent ();/*Display (method ( permanent ()), and store the resulting value in a variable(per),
                                     This value represents Type of permanent  orthodontic  that the user wants to book from*/
                                    
                                    
                                    switch(per)//to defining type of permanent orthodontic for each entry "nested switch" for switch orthodontic
                                    {//to open the switch tem
                                        case 1://If the user enters the Type of permanent orthodontic is 1 (metallic2) . display Booking details
                                            Sub_Services [2] ="your reservation has been confirmed in section : permanent orthodontics -metallic2       3000SAR\n";//Assignment statement
                                            price=3000;//Assignment statement
                                            total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                            System.out.println(Sub_Services [2]);//print
                                            System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                            break;// The program will exit switch
                                        case 2 ://If the user enters the Type of permanent orthodontic is 2 (ceramics) . display Booking details
                                            Sub_Services [3]="your reservation has been confirmed in section : permanent orthodontics-ceramics       3500SAR\n";//Assignment statement
                                            price=3500;//Assignment statement
                                            total = total +price ; //Assignment statement(To collect the prices of the reserved services)
                                            System.out.println(Sub_Services [3]);//print
                                            System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                            break;// The program will exit switch
                                    }//end of the switch per block
                            }//end of the switch orthodontia block
                        }//end of the if( service == 1) block




                        else if ( service ==2)// If the user enters the number services 2. it will be moved to dental implants
                        { //to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of dental implants to be reserved
                            System.out.println("------------Type of dental implants to be reserved------------ ");
                            System.out.println("1-Full set of upper and lower dentures\n2-Full set of teeth for one jaw\n3-partial dentures 2-6 teeth     ");
                            System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
                          
                         /*A method Declaration  has been outside the Main Class, her name is (implants ()) 
                          The user is asked for Type of  dental implants he wants to book from,It checks if Type of dental implants entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                            
                            int implants=implants();/*Display (method (implants ()), and store the resulting value in a variable(implants),
                                     This value represents Type of dental implants that the user wants to book from*/
                     
                            switch(implants)//to defining type of dental implants for each entry "nested switch" for else if
                            {//to open the switch implants
                                case 1: //If the user enters the Type of dental implants is 1 (Full set of upper and lower dentures) . display Booking details
                                  Sub_Services [4]  ="your reservation has been confirmed in section :dental implants - Full set of upper and lower dentures       360SAR\n";//Assignment statement
                                    price=360;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [4]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of dental implants is 2 (Full set of teeth for one jaw ) . display Booking details
                                    Sub_Services [5]= "your reservation has been confirmed in section :dental implants - Full set of teeth for one jaw       180SAR\n  ";//Assignment statement
                                    price=180; //Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [5]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3:  //If the user enters the Type of dental implants is 3 (partial dentures 2-6 teeth  ) . display Booking details
                                    Sub_Services [6]= "your reservation has been confirmed in section :dental implants - partial dentures 2-6 teeth       120RAS\n  ";//Assignment statement
                                    price=120; //Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [6]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                            }//end of the switch implants block
                        }//end of the if else ( service == 2) block

                        
                        
                        else if ( service ==3)// If the user enters the number services 3. it will be moved to Surgery
                        {//to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of Surgery to be reserved
                            System.out.println("------------Type of Surgery to be reserved------------ ");
                            System.out.println("1-simple tooth extraction\n2-surgical extraction\n3-abscess treatment and removal\n4-jaw fracture treatment");
                            System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
                            
                          /*A method Declaration  has been outside the Main Class, her name is (Surgery ()) 
                          The user is asked for Type of Surgery he wants to book from,It checks if Type of Surgery entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                            
                            int Surgery =Surgery ();/*Display (method (Surgery ()), and store the resulting value in a variable(Surgery),
                            This value represents Type of Surgery that the user wants to book from*/
                        
                            
                            switch(Surgery)//to defining type of Surgery for each entry "nested switch" for else if
                            {//to open the switch Surgery
                                case 1://If the user enters the Type of Surgery  is 1 (simple tooth extraction) . display Booking details
                                    Sub_Services [7]="your reservation has been confirmed in section :Surgery - simple tooth extraction       200RAS\n";//Assignment statement
                                    price=200;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [7]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of Surgery  is 2 (surgical extraction) . display Booking details
                                    Sub_Services [8]="your reservation has been confirmed in section :Surgery - surgical extraction       250RAS\n";//Assignment statement
                                    price=250;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [8]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3: //If the user enters the Type of Surgery  is 3 (abscess treatment and removal) . display Booking details
                                    Sub_Services [9]="your reservation has been confirmed in section :Surgery - abscess treatment and removal       250RAS\n";//Assignment statement
                                    price=250;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [9]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 4: //If the user enters the Type of Surgery  is 4 (jaw fracture treatment) . display Booking details
                                    Sub_Services [10]="your reservation has been confirmed in section :Surgery - jaw fracture treatment       400RAS\n";//Assignment statement
                                    price=400;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [10]);//print
                                    System.out.println("  \n  \n  "); //To arrange the shape of the output only
                            }//end of the switch Surgery block
                        }//end of the if else ( service == 3) block




                        else if ( service ==4)// If the user enters the number services 4. it will be moved to nerve
                        { //to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of nerve to be reserved
                            System.out.println("------------Type of nerve to be reserved------------ ");
                            System.out.println("1-Partial nerve pull\n2-Primary nerve treatment for the anterior tooth\n3-Primary nerve treatment for the posterior tooth");
                            System.out.println("enter the number preceding the name of the type ");
                          
                            /*A method Declaration  has been outside the Main Class, her name is (nerve()) 
                          The user is asked for Type of nerve he wants to book from,It checks if Type of nerve entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                            
                            
                            int nerve =nerve();/*Display (method (nerve ()), and store the resulting value in a variable(nerve),
                            This value represents Type of nerve that the user wants to book from*/
                    
                            switch(nerve)//to defining type of nerve for each entry "nested switch" for else if else
                            {//to open the switch nerve

                                case 1://If the user enters the Type of nerve  is 1 ( Partial nerve pull) . display Booking details
                                    Sub_Services [11]= "your reservation has been confirmed in section :nerve - Partial nerve pull       300RAS\n ";//Assignment statement
                                    price=300;//Assignment statement
                                    total = total +price ; //Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [11]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of nerve  is 2 (Primary nerve treatment for the anterior tooth) . display Booking details
                                    Sub_Services [12]= "your reservation has been confirmed in section: nerve  -Primary nerve treatment for the anterior tooth       350RAS\n";//Assignment statement
                                    price=350;//Assignment statement
                                    total = total +price ;  //Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [12]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3: //If the user enters the Type of nerve  is 3 (Primary nerve treatment for the posterior tooth) . display Booking details
                                    Sub_Services [13]= "your reservation has been confirmed in section :nerve - Primary nerve treatment for the posterior tooth       360RAS\n  ";//Assignment statement
                                    price=360;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [13]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                            }//end of the switch nerve block
                        } //end of the if else ( service == 4) block


                        else if ( service ==5)// If the user enters the number services 5. it will be moved to Rays
                        { //to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of Rays to be reserved
                            System.out.println("------------Type of Rays to be reserved------------ ");
                            System.out.println("1-Xray per one tooth\n2-panoramic rays\n3-transsectional rays");
                            System.out.println("enter the number preceding the name of the type ");
                            
                          /*A method Declaration  has been outside the Main Class, her name is (Rays()) 
                          The user is asked for Type of Rays he wants to book from,It checks if Type of Rays entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                             
                           
                            int Rays=Rays();/*Display (method (Rays()), and store the resulting value in a variable(Rays),
                            This value represents Type of Rays that the user wants to book from*/
                            
                            switch(Rays)//to defining type of Rays for each entry "nested switch" for else if
                            {//to open the switch Rays
                                case 1://If the user enters the Type of Rays  is 1 (Xray per one tooth) . display Booking details
                                    Sub_Services [14]="your reservation has been confirmed in section :Rays - Xray per one tooth       150RAS\n ";//Assignment statement
                                    price=150;//Assignment statement
                                    total = total +price ; //Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [14]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of Rays  is 2 ( panoramic rays) . display Booking details
                                    Sub_Services [15]="your reservation has been confirmed in section: Rays -panoramic rays       150RAS \n ";//Assignment statement
                                    price=150;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [15]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3: //If the user enters the Type of Rays  is 3 (transsectional rays) . display Booking details
                                    Sub_Services [16]="your reservation has been confirmed in section :Rays - transsectional rays       200RAS\n ";//Assignment statement
                                    price=200;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [16]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                            }//end of the switch Rays block
                        } //end of the if else ( service == 5) block


                        else if ( service ==6)// If the user enters the number services 6. it will be moved to Cleaning teeth
                        { //to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of Cleaning teeth to be reserved
                            System.out.println("------------Type of Cleaning teeth to be reserved------------ ");
                            System.out.println("1- cut and clean the gums\n2- Full mouth supragingival scaling\n3- polishing ");
                            System.out.println("enter the number preceding the name of the type ");
                           
                          /*A method Declaration  has been outside the Main Class, her name is (Cleaning()) 
                          The user is asked for Type of Cleaning teeth he wants to book from,It checks if Type of Cleaning teeth entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                            
                            int Cleaning= Cleaning();/*Display (method (Cleaning ()), and store the resulting value in a variable(Cleaning ),
                            This value represents Type of Cleaning teeth that the user wants to book from*/
                           
                            switch(Cleaning)//to defining type of Cleaning teeth for each entry "nested switch" for else if
                            {//to open the switch Cleaning
                                case 1:// cut and clean the gums //If the user enters the Type of Cleaning teeth is 1 (jaw fracture treatment) . display Booking details
                                    Sub_Services [17]= "your reservation has been confirmed in section :Cleaning teeth -  cut and clean the gums       600RAS\n  ";//Assignment statement
                                    price=600;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [17]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of Cleaning teeth is 2 (Full mouth supragingival scaling) . display Booking details
                                    Sub_Services [18]="your reservation has been confirmed in section:Cleaning teeth - Full mouth supragingival scaling       580RAS\n ";//Assignment statement
                                    price=580;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [18]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3:  //If the user enters the Type of Cleaning teeth is 3 ( polishing) . display Booking details
                                    Sub_Services [19]="your reservation has been confirmed in section :Cleaning teeth - polishing       900RAS\n"   ;//Assignment statement
                                    price=900;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [19]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                            }//end of the switch Cleaning block
                        }//end of the if else ( service == 6) block




                        else if ( service ==7)// If the user enters the number services 7. it will be moved to bleaching
                        { //to open the if else block , Executes what is inside the block if the condition is true
                            //display The type of bleaching to be reserved
                            System.out.println("------------Type of bleaching to be reserved------------ ");
                            System.out.println("1- laser teeth whitening\n2- Home_bleaching\n3-gum supply for one jaw  ");
                            System.out.println("enter the number preceding the name of the type ");
                            
                          /*A method Declaration  has been outside the Main Class, her name is (bleaching()) 
                          The user is asked for Type of bleaching he wants to book from,It checks if Type of bleaching entered is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                          
                          
                          int bleaching =bleaching();/*Display (method (bleaching ()), and store the resulting value in a variable(bleaching),
                            This value represents Type of bleaching that the user wants to book from*/
                            
                       
                            switch(bleaching)//to defining type of bleaching for each entry "nested switch" for else if
                            {//to open the switch bleaching
                                case 1:  //If the user enters the Type of bleaching is 1(laser teeth whitening) . display Booking details
                                    Sub_Services [20]="your reservation has been confirmed in section :bleaching -  laser teeth whitening       1000RAS\n";//Assignment statement
                                    price=1000;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [18]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 2://If the user enters the Type of bleaching  is 2 (Home_bleaching) . display Booking details
                                    Sub_Services [21]="your reservation has been confirmed in section:bleaching - Home bleaching       650RAS \n ";
                                    price=650;
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [21]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                                    break;// The program will exit switch
                                case 3:  //If the user enters the Type of bleaching is 3 (gum supply for one jaw) . display Booking details
                                    Sub_Services [22]="your reservation has been confirmed in section :bleaching -gum supply for one jaw       800RAS\n";
                                    price=800;//Assignment statement
                                    total = total +price ;//Assignment statement(To collect the prices of the reserved services)
                                    System.out.println(Sub_Services [22]);//print
                                    System.out.println("  \n  \n  ");//To arrange the shape of the output only
                            }//end of the switch bleaching block
                        }//end of the if else ( service == 7) block

                       //display basic clinic services to book another service
                         System.out.println("**********************Book another service**********************\n");
                         System.out.println("=============================services============================== ");
                         System.out.println(" 1- orthodontia\n 2- dental implants\n 3-Surgery\n 4-nerve\n 5-Rays\n 6-Cleaning teeth\n 7-bleaching      ");
                         System.out.println(" ===================================================================");
                         System.out.println("------------------------------&&&&&-------------------------------------");
                         System.out.println("To complete the reservation and determine the doctor, enter the number 8");
                         System.out.println("------------------------------&&&&&-------------------------------------");
                         System.out.println(" Enter the number of the service you want to book from     ");  //print : (To direct the user to the next command)
                         service = input.nextInt();//Allows the user to enter the number of the service you want to book from     
                         
                         if ( service>=9){//If the user enters a service number that does not exist in the system (greater than or equal to 9)
                             do {//The program executes between parentheses (do -while), at least once
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("The service number you entered is not available, please enter one of the numbers on the screen below");    
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("=============================services============================== ");
                            System.out.println(" 1- orthodontia\n 2- dental implants\n 3-Surgery\n 4-nerve\n 5-Rays\n 6-Cleaning teeth\n 7-bleaching      ");
                            System.out.println(" ===================================================================");
                            System.out.println(" Enter the number of the service you want to book from     ");  //print : (To direct the user to the next command)
                            service = input.nextInt();//Allows the user to enter the number of the service you want to book from  
                                   }
                          while(service>=9 );//The loop is repeated until the user enters an available service 
                           }//end of the  block while(service>=9)
                      
                 }//end loop while (service <= 7 & service>=1) block
                     }//end of the switch (Category) block
        
        
                        if (service==8) //If the user enters a service number equal to 8, 
                        {//to open the if block
                             break;//the program will exit the  loop while(Category>=1|| Category<=3)
                        } //end of the  block if   
                        
                   
                }//end loop while (Category>=1|| Category<=3)

        
                
          
        
        
                          if ( service ==8)// If the user enters the number  8. it will be moved to Names of available doctors
                           {//to open the if block
                            System.out.println("------------------***Doctors***------------------  ");
                            System.out.println("1-Dr: Jihan Ahmad\n2-Dr: Ahmed Yassin\n3-Dr: Razan Al-Arwai\n4-Dr: Saleh Al-Enezi");
                            System.out.println("Select the doctor (enter the number written before the name of the doctor you want to book with)  ");
                         
                          /*A method Declaration  has been outside the Main Class, her name is (Dr()) 
                          The user is asked for the doctor he wants to book from,It checks if the number of the doctor is available or not
                          If it is available, the user is transferred to it,
                          and if it is not available, the user is asked to enter the number again */
                           
                          
                          int Dr =Dr ();/*Display (method (Dr ()), and store the resulting value in a variable(Dr),
                            This value represents doctor that the user wants to book With*/
                  
                            switch(Dr){
                                case 1://Dr: Jihan Ahma
                                    doctor1=" Jihan Ahma" ;
                                    System.out.println("Your reservation has been confirmed with : " + doctor1 );
                                    break;// The program will exit switch
                                case 2://Dr: Ahmed Yassin
                                    doctor1=" Ahmed Yassin" ;
                                    System.out.println("Your reservation has been confirmed with : " + doctor1 );

                                    break;// The program will exit switch
                                case 3://Dr: Razan Al-Arwai
                                    doctor1=" Razan Al-Arwai" ;
                                    System.out.println("Your reservation has been confirmed with : " + doctor1 );

                                    break;// The program will exit switch
                                case 4:// Dr: Saleh Al-Enezi
                                    doctor1="  Saleh Al-Enezi" ;
                                    System.out.println("Your reservation has been confirmed with : " + doctor1 );
                         
                                    break;// The program will exit switch
                                    
                          
                    }//end of the switch Dr block
                    } //end of the if ( service == 8) block
  
           

                        Random Discount = new Random() ;//to creates an object of the class Random and names it Discount
                        Random  Reservation = new Random() ;//to creates an object of the class Random and names it  Reservation
                        int Discount2=Discount.nextInt(50);//The program chooses a random number from 0 to 50 (the chosen number represents the value of the discount percent)
                        int Discount1=Discount.nextInt(10);//The program chooses a random number from 0 to 10 (the chosen number represents the value of the discount percent)
                        int Reservation1=Reservation.nextInt(100);//The program chooses a random number from 0 to 100 (the chosen number represents the user's reservation number)
                        //The number is set 100. Let's say the site will receive 100 reservations per day
                        double dis;//Variable declaration that stores the value of 100 minus the value of the discount
                        double amount;//Variable declaration that stores The total amount of your booking after Discount
                        //Print a message to the user congratulating him on receiving a random discount value
                        System.out.println("*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`\n*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`");
                        System.out.println("congrats! You got a random discount voucher worth: " + Discount2+ "%");
                        System.out.println("*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`\n*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`*`");
                        dis=100-Discount2;//process 100 minus the value of the discount
                        amount=(dis*total)/100;//The total amount of your booking after Discount
                        Date date=new Date();//to creates an object of the class Date and names it date (This object prints the date and time of booking the appointment)
                      
                        //Extra discount, but you must win the contest
                        //explained The idea of the competition
                        System.out.println("*********************************************************************************");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Luck contest!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("The idea of the competition:  consists of 10 numbers, one of these numbers carries \n an additional discount behind it with a value of 100%.\n If you can guess the correct number, your reservation for all services is free.");
                        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
                        System.out.println("(from 1 to 10), enter a number that you expect the full opponent to be behind");
                        
                        int Luck_Contest = Luck_Contest();/*Display (method (Luck_Contest()), and store the resulting value in a variable(Luck_Contest)
                                                          This value represents The number entered by the user to participate in the contest */
                        
                        
                          if (Discount1==Luck_Contest)//If the user guesses the correct number
                          {//to open the if  block , Executes what is inside the block if the condition is true
                             System.out.println("-----------------------------------------:)---------------------------------------------");
                             System.out.println("                Congratulations, you got an extra 100% discount!                         ");
                             System.out.println("-----------------------------------------------------------------------------------------");
                              //display invoice after all discounts
                              System.out.println("****************************Invoice****************************** " );
                              System.out.println("|||||||||||||||||||||Diamond dental clinic|||||||||||||||||||||||||");
                              System.out.println("|||||||||||||||||||||||makkah-Al-sharayie||||||||||||||||||||||||||");
                              System.out.println("\n \n");//Leave two lines (to arrange the shape of the output only)
                              System.out.println("Reservation number : "+ Reservation1);//display the user's reservation number
                              System.out.println("Name: " +Name );//display username
                              System.out.println("Mobile number: " +num );//display user Mobile number
                              System.out.println("The age: " + age +" years" );//display user age
                              System.out.println("Doctor: " + doctor1 );//Display the name of the doctor who was selected previously
                              System.out.println("Date and time of booking the appointment: "+ date );//prints the date and time of booking the appointment
                              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Booked Services~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                       
                         s://The starting point of the iterative loop
                         for (int i =  0 ; i< Sub_Services.length;i++){
                          //Sub-services that have not been booked by the user are ignored and not displayed and printed
                           if (Sub_Services[i]== null) continue s;
                           System.out.println(Sub_Services[i]);
                             }//end loop for block
                        
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("The total amount of your booking :" + total  ); //display The total amount of booking
                        System.out.println("Discount : " +  "100 %" );//display The Discount
                        System.out.println("The total amount of your booking after Discount: " +  "0 SAR");//display The total amount of user booking after Discount
                        
                          }//end if (Discount1==Luck_Contest) block
                          
                          
                          
                        else if(Discount1!=Luck_Contest)//If the user does not guess the correct number
                          {//to open the else if  block , Executes what is inside the block if the condition is true
                        
                              System.out.println("-----------------------------------------):---------------------------------------------");
                              System.out.println("Unfortunately you didn't guess the correct number, better luck with the upcoming bookings");
                              System.out.println("-----------------------------------------------------------------------------------------");

                        //display invoice after all discounts
                        //to display what is inside the parentheses to the user
                       
                        System.out.println("****************************Invoice****************************** " );
                        System.out.println("|||||||||||||||||||||Diamond dental clinic|||||||||||||||||||||||||");
                        System.out.println("|||||||||||||||||||||||makkah-Al-sharayie||||||||||||||||||||||||||");
                        System.out.println("\n \n");//Leave two lines (to arrange the shape of the output only)
                        System.out.println("Reservation number : "+ Reservation1);//display the user's reservation number
                        System.out.println("Name: " +Name );//display username
                        System.out.println("Mobile number: " +num );//display user Mobile number
                        System.out.println("The age: " + age +" years" );//display user age
                        System.out.println("Doctor: " + doctor1 );//Display the name of the doctor who was selected previously
                        System.out.println("Date and time of booking the appointment: "+ date );//prints the date and time of booking the appointment
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Booked Services~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        //System.out.println(a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u);//display All services booked by the user
                         s://The starting point of the iterative loop
                         for (int i =  0 ; i< Sub_Services.length;i++){
                          //Sub-services that have not been booked by the user are ignored and not displayed and printed
                           if (Sub_Services[i]== null) continue s;
                           System.out.println(Sub_Services[i]);
                             }//end loop for block
                        
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("The total amount of your booking :" + total  ); //display The total amount of booking
                        System.out.println("Discount : " +   Discount2+ "%" );//display The Discount
                        System.out.println("The total amount of your booking after Discount: " +  amount);//display The total amount of user booking after Discount
                        //}//end of the if ( service == 9) block
                       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~********~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                       System.out.println("payment methods:\n  1-cash\n  2-Pay by PayPal\n  3-Credit card");
                       System.out.println("Choose the payment method that suits you\n(Enter the number that precedes the payment method that suits you)");
                       System.out.println("-------------------------------------------------------------------------\n-------------------------------------------------------------------------");
                          }//end else if (Discount1!=Luck_Contest) block
                          
                          
                       int payment=payment();/*Display (method (payment ()), and store the resulting value in a variable(payment),
                                                      This value represents payment method  that the user wants to book With*/
                     
                       switch(payment){
                       case 1://cash
                           String payment2 =" cash " ;
                           System.out.println("****************************************************");
                           System.out.println("Your payment method has been confirmed: " + payment2 );
                           break;// The program will exit switch
                       case 2://Pay by PayPal
                           payment2=" Pay by PayPal" ;
                           System.out.println("****************************************************");
                           System.out.println("Your payment method has been confirmed: " + payment2);

                           break;// The program will exit switch
                       case 3://Credit card
                           payment2=" Credit card" ;
                           System.out.println("****************************************************");
                           System.out.println("Your payment method has been confirmed: " + payment2);
                           break;// The program will exit switch
                                
                            }//end of the switch payment block
                       
                       System.out.println("---------------------------------------------------");
                       System.out.println("\n\n");
                       System.out.println("---------------------*~*~*~*-----------------------");
                       System.out.println("Do you want to evaluate the services of the clinic?");
                       System.out.println("Enter number 1 (yes) or number 2 (no)");
                     
                       /*A method Declaration  has been outside the Main Class, her name is (evaluate()) 
                        Asks the user if he wants to evaluate the clinic's services ,
                       If the user enters the number 1(yes) , it will be transferred to the evaluation commands
                       But if the user enters the number 2(No), a thank you message appears and he exits the program
                       If he enters a number other than 1 or 2, it tells him that the number he entered is wrong 
                       and takes him back to the main question again*/
                         
                   
                       evaluate();//Display (method (evaluate())
  
                }//end of the  if (age >12 ) block
     }//end the main block




    
     
//methods Declaration 
     //1: Homepage
public static int Homepage ( ){ //to open the Homepage  block 
      Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
       
        System.out.println("<<<<<<<<<<<<<<<<<HomePage>>>>>>>>>>>>>>>> ");
       System.out.println("   1- About Diamond Dental Clinic \n   2- Book Your Abbointment\n   3-Our Services and prices         ");
       System.out.println("    Enter the required category number    ");//print : (To direct the user to the next command)

        int CategoryNum= input.nextInt();  //Allows the user to enter the page number he/she wants to access
        if(CategoryNum <1||CategoryNum >3)//If the user enters a section number that is not available on the home page ,Executes what is inside the block if the condition is true
        {//to open the if block
      //Second: The program displays the home page of the user
        do  //Executes what is inside the block do is performed at least once- nested For if(CategoryNum <1||CategoryNum >=4)
        {//to open the block do
        System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
        //To inform the user that the service he entered is not available
        System.out.println("The homepage of the clinic does not contain a page deicated to the number you entered \n   please enter a number within the numbers displayed here: ");
        System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<HomePage>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
        System.out.println("   1- About Diamond Dental Clinic \n   2- Book Your Abbointment\n   3-Our Services and prices         ");         
        System.out.println("    Enter the required category number    ");//print : (To direct the user to the next command)
        CategoryNum= input.nextInt();  //Allows the user to enter the page number he/she wants to access
        }//end of the  block do
        while( CategoryNum <1||CategoryNum >3);//The loop is repeated until the user enters an available service on the home page
        }//end of the  block if(CategoryNum <1||CategoryNum >=3)
        
         return  CategoryNum; // return a value of (CategoryNum) to a main method
    
}//end the Homepage block



//2:service
public static int service (){//to open the service () block 
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
   int  service = input.nextInt();//Allows the user to enter the number of the service you want to book from       
                    
    if ( service>=8|service<1)//If the user enters a service number that does not exist in the system (greater than or equal to 8)
    {//to open the if block , Executes what is inside the block if the condition is true
  do {//The program executes between parentheses (do -while), at least once
    System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
    System.out.println("The service number you entered is not available, \n please enter one of the numbers on the screen below");    
    System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
    System.out.println(" 1- orthodontia\n 2- dental implants\n 3-Surgery\n 4-nerve\n 5-Rays\n 6-Cleaning teeth\n 7-bleaching      ");
    System.out.println(" ===================================================================");
    System.out.println(" Enter the number of the service you want to book from     ");  //print : (To direct the user to the next command)
     service = input.nextInt();//Allows the user to enter the number of the service you want to book from  
    }//end of the  block do
   while(service>=8|service<1 );//The loop is repeated until the user enters a number for the available service 
}//end of the  block if ( service>=8|service<1)
     return service;// return a value of (service) to a main method
} //end the service block  



//3:orthodontia
public static int orthodontia (){//to open the orthodontia ()  block 
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
    int orthodontia = input.nextInt();//Allows the user to enter the number preceding the name of the type of orthodontia to be reserved
        if (orthodontia > 2|orthodontia<1)//If the user enters a Type of orthodontia that does not exist in the system (greater than to 2 or less than to 1)
        {//to open the if block , Executes what is inside the block if the condition is true
            do {//The program executes between parentheses (do -while), at least once
        System.out.println("The Type of orthodontia you entered is not available, please enter the number preceding the name of the type again ");          
        System.out.println("--------------The type of orthodontia to be reserved-------------- ");
        System.out.println(" 1-  temporary orthodontics\n 2-  permanent orthodontics");
        System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
        orthodontia = input.nextInt();//Allows the user to enter the number preceding the name of the type of orthodontia to be reserved
        }//end of the  block do
        while(orthodontia > 2 |orthodontia<1);//The loop is repeated until the user enters type of orthodontia for the available 
        }//end of the  block if (orthodontia > 2|orthodontia<1)
         return orthodontia;// return a value of ( orthodontia) to a main method
            
     }//end the orthodontia() block  

   
//4:temporary
public static int temporary (){//to open the temporary ()  block 
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
      int tem = input.nextInt();//Allows the user to enter the number preceding the name of the type of temporary orthodontic to be reserved
      if ( tem > 2| tem<1)//If the user enters a Type of temporary orthodontia that does not exist in the system (greater than to 2 or less than to 1)
      {//to open the if block , Executes what is inside the block if the condition is true
      do {//The program executes between parentheses (do -while), at least once
          System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
          System.out.println("The Type of temporary orthodontic you entered is not available,\n please enter the number preceding the name of the type again ");          
          System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
          System.out.println("------------Type of temporary orthodontic to be reserved------------");
          System.out.println(" 1-  transparent\n 2-   metallic1");
          System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
          tem = input.nextInt();//Allows the user to enter the number preceding the name of the type of temporary orthodontic to be reserved
              }//end of the  block do
          while(tem> 2| tem<1);//The loop is repeated until the user enters type of temporary orthodontia for the available 
             }//end of the  block if ( tem > 2| tem<1)

   return tem;// return a value of ( tem) to a main method
    
}//end the  temporary () block  

//5:permanent 
public static int permanent (){//to open the permanent ()  block 
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
 int per = input.nextInt();//Allows the user to enter the number preceding the name of the type of permanent orthodontics to be reserved
                                    
 if ( per > 2|per<1){//If the user enters a Type of permanent orthodontia that does not exist in the system (greater than to 2 or less than to 1)
                                    
    do {//The program executes between parentheses (do -while), at least once
        System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
        System.out.println("The Type of permanent orthodontic you entered is not available, please enter the number preceding the name of the type again ");          
        System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
        System.out.println("------------Type of permanent orthodontics to be reserved------------ ");
        System.out.println(" 1-  metallic2\n 2-  ceramics        ");
        System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
        per = input.nextInt();//Allows the user to enter the number preceding the name of the type of temporary orthodontic to be reserved
        }//end of the  block do
         while(per > 2|per<1 );//The loop is repeated until the user enters type of permanent orthodontics for the available 
             }//end of the  block if ( per > 2| per<1)
  
      return per ;// return a value of (per) to a main method
    
}//end the permanent () block  

//6:implants
public static int implants(){//to open the implants () block 
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
    
  int implants = input.nextInt();//Allows the user to enter the number preceding the name of the type of dental implants  to be reserved
  if ( implants > 4|implants<1 ){//If the user enters a Type of dental implants that does not exist in the system (greater than to 4 or less than to 1)
  do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("The Type of dental implants you entered is not available, please enter the number preceding the name of the type again ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("------------Type of dental implants to be reserved------------ ");
     System.out.println("1-Full set of upper and lower dentures\n2-Full set of teeth for one jaw\n3-partial dentures 2-6 teeth     ");
     System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
     implants = input.nextInt();//Allows the user to enter the number preceding the name of the type of dental implants to be reserved
       }//end of the  block do
   while(implants > 4|implants<1 );//The loop is repeated until the user enters type of dental implants for the available 
             }//end of the  block if ( implants> 2| implants<1)
 return  implants ; // return a value of (implants) to a main method                           
    
    
}//end the  implants() block  

//7:Surgery 
public static int Surgery (){//to open the Surgery () block
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
    int Surgery = input.nextInt();//Allows the user to enter the number preceding the name of the type of Surgery to be reserved
    if ( Surgery > 4| Surgery<1){//If the user enters a Type of Surgery that does not exist in the system (greater than to 4 or less than to 1)
    do {//The program executes between parentheses (do -while), at least once
      System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
      System.out.println("The Type of Surgery you entered is not available, please enter the number preceding the name of the type again ");          
      System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
      System.out.println("------------Type of Surgery to be reserved------------ ");
      System.out.println("1-simple tooth extraction\n2-surgical extraction\n3-abscess treatment and removal\n4-jaw fracture treatment");
      System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
      Surgery = input.nextInt();//Allows the user to enter the number preceding the name of the type of Surgery to be reserved
       }//end of the  block do
      while(Surgery> 4| Surgery<1 );//The loop is repeated until the user enters type of Surgery for the available 
             }//end of the  block if (Surgery > 4| Surgery<1)
    
     return Surgery;// return a value of (Surgery) to a main method 
    
}//end the Surgery() block


//8:  nerve
public static int nerve (){//to open the nerve() block
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
     int nerve= input.nextInt();//Allows the user to enter the number preceding the name of the type of nerve to be reserved        
     if ( nerve > 3|nerve < 1){//If the user enters a Type of nerve that does not exist in the system (greater than to 3 or less than to 1)
     do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("The Type of nerve you entered is not available, please enter the number preceding the name of the type again ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("------------Type of nerve to be reserved------------ ");
     System.out.println("1-Partial nerve pull\n2-Primary nerve treatment for the anterior tooth\n3-Primary nerve treatment for the posterior tooth");
     System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
     nerve = input.nextInt();//Allows the user to enter the number preceding the name of the type of nerve to be reserved
       }//end of the  block do
     while(nerve > 3|nerve < 1 );//The loop is repeated until the user enters type of nerve for the available 
             }//end of the  block if (nerve > 3|nerve < 1)
    
     return nerve; // return a value of (nerve) to a main method 
    
}//end the nerve() block


//9:Rays
public static int Rays(){//to open the Rays() block
    Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
    int Rays = input.nextInt();//Allows the user to enter the number preceding the name of the type of Rays to be reserved
 if ( Rays > 3|Rays < 1){//If the user enters a Type of Rays that does not exist in the system (greater than to 3 or less than to 1)
 do {//The program executes between parentheses (do -while), at least once
 System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
 System.out.println("The Type of Rays you entered is not available, please enter the number preceding the name of the type again ");          
 System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
 System.out.println("------------Type of Rays to be reserved------------ ");
 System.out.println("1-Xray per one tooth\n2-panoramic rays\n3-transsectional rays");
 System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
 Rays = input.nextInt();//Allows the user to enter the number preceding the name of the type of Rays to be reserved
   }//end of the  block do
  while(Rays > 3|Rays < 1);//The loop is repeated until the user enters type of Rays for the available 
             }//end of the  block if (Rays > 3|Rays < 1)
    
    return Rays;// return a value of (Rays) to a main method 
}//end the Rays() block



//10:Cleaning
public static int Cleaning (){//to open the Cleaning() block
Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
int Cleaning = input.nextInt();//Allows the user to enter the number preceding the name of the type of Cleaning teeth to be reserved
    if ( Cleaning > 3|Cleaning < 1){//If the user enters a Type of Cleaning that does not exist in the system (greater than to 3 or less than to 1)
    do {//The program executes between parentheses (do -while), at least once
    System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
    System.out.println("The Type of Cleaning teeth  you entered is not available, please enter the number preceding the name of the type again ");          
    System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
    System.out.println("------------Type of Cleaning teeth  to be reserved------------ ");
    System.out.println("1- cut and clean the gums\n2- Full mouth supragingival scaling\n3- polishing ");
    System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
    Cleaning = input.nextInt();//Allows the user to enter the number preceding the name of the type of Cleaning to be reserved
    }//end of the  block do
     while( Cleaning > 3|Cleaning < 1 );//The loop is repeated until the user enters type of Cleaning  for the available 
             }//end of the  block if (Cleaning > 3|Cleaning < 1)
    
    return Cleaning;// return a value of (Cleaning) to a main method
}//end the Cleaning() block


//11:bleaching
public static int bleaching (){//to open the bleaching() block
  Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
 int bleaching = input.nextInt();//Allows the user to enter the number preceding the name of the type of bleaching to be reserved
 if ( bleaching > 3|bleaching < 1){//If the user enters a Type of bleaching that does not exist in the system (greater than to 3 or less than to 1)
 do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("The Type of bleaching teeth  you entered is not available, please enter the number preceding the name of the type again ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("------------Type of bleaching teeth  to be reserved------------ ");
     System.out.println("1- laser teeth whitening\n2- Home_bleaching\n3-gum supply for one jaw  ");
     System.out.println("enter the number preceding the name of the type ");//print : (To direct the user to the next command)
     bleaching = input.nextInt();//Allows the user to enter the number preceding the name of the type of bleaching  to be reserved
      }//end of the  block do
       while( bleaching > 3|bleaching < 1);//The loop is repeated until the user enters type of bleaching for the available 
             }//end of the  block if ( bleaching > 3|bleaching < 1)
    
    return bleaching;// return a value of (bleaching) to a main method
}//end the bleaching() block

//12:Dr
public static int Dr (){
Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
int Dr = input.nextInt(); //Allows the user to enter the number written before the name of the doctor you want to book with
 if ( Dr > 4|Dr < 1){//If the user enters a doctor that does not exist in the system (greater than to 4 or less than to 1)
  do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("You have entered a doctor's number that is not available, please enter one of the numbers shown below  ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("------------------***Doctors***------------------  ");
     System.out.println("1-Dr: Jihan Ahmad\n2-Dr: Ahmed Yassin\n3-Dr: Razan Al-Arwai\n4-Dr: Saleh Al-Enezi");
     System.out.println("Select the doctor (enter the number written before the name of the doctor you want to book with)  ");
     Dr = input.nextInt(); //Allows the user to enter the number written before the name of the doctor you want to book with
                                       
     }//end of the  block do
    while(Dr > 4|Dr < 1 );//The loop is repeated until the user enters doctor the available 
             }//end of the  block if ( Dr > 4|Dr < 1)
    
    return Dr ;// return a value of (Dr) to a main method
}//end the Dr() block


//13:evaluate
public static int  evaluate(){
Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
int evaluate = input.nextInt();/*Allows the user to enter the number 1(yes)or 2(no) 
                          to answer the question:Do you want to evaluate the services of the clinic?*/
                if ( evaluate<1|evaluate>2)//If the user enters an answer to a question other than the specified answer (greater than to 2 or less than to 1)
                    {//to open the if block , Executes what is inside the block if the condition is true  
                    do {//The program executes between parentheses (do -while), at least once
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("The number entered is incorrect, please Enter number 1 (yes) or number 2 (no) again");    
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("Do you want to evaluate the services of the clinic?");
                            System.out.println("Enter number 1 (yes) or number 2 (no)");
                            evaluate = input.nextInt();/*Allows the user to enter the number 1(yes)or 2(no) 
                          to answer the question:Do you want to evaluate the services of the clinic?*/
                                   }//end of the  block do
                          while(evaluate<1|evaluate>2);//The loop is repeated until the user  enters a correct answer to the question 
                                 }//end of the  block if ( evaluate<1|evaluate>2)
                        
                if (evaluate==1)//If the user answers the question with the number 1(yes)
                {//to open the if block , Executes what is inside the block if the condition is true  
                    System.out.println("Dear customer, how did you see the quality of services at Diamond Dental Clinic?");
                    System.out.println("1-*(strongly unsatisfied) \n 2-**(unsatisfied) \n 3-***(satisfied) \n 4-****(strongly satisfied) \n 5-*****(outstanding)");
                    System.out.println("Enter the rating number( from 1 to 5 )  appropriate to your opinion (one star as a minimum and five stars as a maximum)");
                    int  star = input.nextInt();//The user is allowed to evaluate the clinic (from 1 to 5)
                        if ( star>5|star< 1)//If the user enters a If the user enters a evaluate other than the evaluate shown to him other than the evaluate shown to him(greater than to 5 or less than to 1)
                        {//to open the if block , Executes what is inside the block if the condition is true
                             do {//The program executes between parentheses (do -while), at least once
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("The evaluation number entered is incorrect, please re-evaluate again");    
                            System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
                            System.out.println("1-*(strongly unsatisfied) \n 2-**(unsatisfied) \n 3-***(satisfied) \n 4-****(strongly satisfied) \n 5-*****(outstanding)");
                            System.out.println("Enter the rating number( from 1 to 5 )  appropriate to your opinion (one star as a minimum and five stars as a maximum)");
                            star = input.nextInt();//The user is allowed to evaluate the clinic (from 1 to 5)
                                   }//end of the  block do
                          while(star>5|star<1);//The loop is repeated until the user  enters a correct evaluate (from 1 to 5)
                                 }//end of the  block if (star>5|star< 1 )
                 //prints : closing messages
                 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                 System.out.println("Your evaluation of the clinic is: " + star +" star(s)");
                 System.out.println("---------------------------------------------------------------------------------------------");
                 System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
                 System.out.println("       Thank you for choosing Diamond dental clinic ,\n we promise that we will work to make your smile as bright and beautiful as your beauty");
                 System.out.println("---------------------------------------------------------------------------------------------");
                 System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
       
                                     }//end of the  block if (evaluate==1)
                else if (evaluate==2)//If the user answers the question with the number 2(no)
                {//to open the if block , Executes what is inside the block if the condition is true 
                    //prints : closing messages
                 System.out.println("---------------------------------------------------------------------------------------------");
                 System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
                 System.out.println("       Thank you for choosing Diamond dental clinic ,\n we promise that we will work to make your smile as bright and beautiful as your beauty");
                 System.out.println("---------------------------------------------------------------------------------------------");
                 System.out.println("--------------------------------~`*`*`*`*`*~-------------------------------------------------");
  
                                 }//end of the  block if (evaluate==2)
    
         return evaluate;// return a value of ( evaluate) to a main method
   
}//end the evaluate() block
    

//14:payment
public static int  payment(){
Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
int payment =input.nextInt();//The user is allowed to enter the payment method that suits him
                  
  if ( payment > 3|payment < 1)//If the user enters a payment method that does not exist in the system (greater than to 3 or less than to 1)
        {//to open the if block , Executes what is inside the block if the condition is true
      do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("You have entered a payment method that is not available, please enter one of the methods shown below  ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("------------------*** payment method***------------------  ");
     System.out.println("payment methods:\n  1-cash\n  2-Pay by PayPal\n  3-Credit card");
     System.out.println("Choose the payment method that suits you\n(Enter the number that precedes the payment method that suits you)");
     payment = input.nextInt(); //The user is allowed to enter the payment method that suits him
                                       
     }//end of the block do
    while(payment > 3|payment < 1 );//The loop is repeated until the user enters  the number written before the payment methodthe the available 
             }//end of the  block if ( payment > 4|payment < 1)
    
         return payment;//return a value of ( payment) to a main method
}//end the payment() block

//15:Luck_Contest()
public static int  Luck_Contest(){
Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
int Luck_Contest = input.nextInt();//Allows the user to enter the number he guesses
                  
  if ( Luck_Contest> 10|Luck_Contest < 1)//If the user enters number that does not exist in the  competition (greater than to 10 or less than to 1)
    {//to open the if block , Executes what is inside the block if the condition is true
      do {//The program executes between parentheses (do -while), at least once
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     System.out.println("The number entered is not among the competition numbers, please enter a number from 1 to 10  ");          
     System.out.println("########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~########~~~~~~");
     
     System.out.println("(from 1 to 10), enter a number that you expect the full opponent to be behind");
     
     Luck_Contest = input.nextInt(); //Allows the user to enter the number he guesses
                                       
     }//end of the block do
    while( Luck_Contest> 10|Luck_Contest < 1);//The loop is repeated until the user enters  the number from 1 to 10 
             }//end of the  block if ( Luck_Contest> 10|Luck_Contest < 1)
    
         return  Luck_Contest;//return a value of (Luck_Contest) to a main method
}//end the Luck_Contest() block









} //end the class block
    




        




