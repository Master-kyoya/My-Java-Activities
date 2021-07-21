package activity.pkg4.unique.methods;

import java.util.Scanner;

public class Activity4UniqueMethods {

    static String Months[] = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};
    static String Horoscope[] = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", 
    "Rooster", "Dog", "Pig"};
    static String Fortune[] = {"Yes", "No", "Yes", "No", "Yes", "Maybe", "Yes", "Yes", "Maybe", "No", "No", "No"};
    
    static String Pets[] = {"Dog", "Cat", "Fish"};
    
    static String AvaClass[] = {"Air", "Water", "Earth","Fire"};
    static String Answer[] = {"Yes","No","Maybe"};
    
    static String Subject [] = {"Math","English","ICT","Filipino"};
    static String Fate[] = {"Passed", "Failed", "Passed", "Failed"};
    
    static String Vote [] = {"Duterte","Digong","Cayetano","Isko"};
    
    static String Food [] = {"Hotdog","Burger","Pizza","Pasta"};
    static int Calories[] = {290,295, 266, 131};
    
    public static void main(String[] args) {
        pl("TANGALIN, MICHAEL JAN R. | 1-BSEMC-1");
        SelectionMenu();
        int choice = inputInt("Choose your # Options");
        SelectionSwitch(choice);
    }

    static void SelectionMenu() {
        pl("---Unique Choices---");
        pl("1. Record Encoder");
        pl("2. Tell me about yourself");
        pl("3. Fortune Teller");
        pl("4. Choose a Pet");
        pl("5. Avatar Maker");
        pl("6. Login");
        pl("7. Confession Simulator");
        pl("8. Fate of your Grade");
        pl("9. Voting Simulator");
        pl("10. Food Calorie Info");
    }

    static int SelectionSwitch(int choice) {
        String Name, User;
        int age,x,y;
        switch (choice) {
            case 1:
                pl("---Record Encoder---");
                int max = inputInt("Enter Max Records");
                EncodeRecord(max);
                break;
            case 2:
                pl("---Tell me about yourself---");
                Name = inputString("What's your name?");
                age = inputInt("How old are you?");
                TellMeAboutYourself(Name, age);
                break;
            case 3:
                pl("---Fortune Teller---");
                Name = inputString("Name");
                age = inputInt("Age");
                FortuneTeller(Name, age);
                break;
            case 4:
                pl("---Choose a Pet---");
                for(int i=0; i<Pets.length;i++){
                     pl((i + 1) + ". " + Pets[i]);                
                }
                x = inputInt("Choice");
                ChooseApet(x);
                break;
            case 5:
                pl("---Avatar Maker---");
                Name = inputString("Create your Username");
                age = inputInt("Enter Age");
                CreateAvatar(Name,age);
                break;
            case 6:
                pl("---Login---");
                User = inputString("Username");
                x = inputInt("Password");
                Login(User,x);
                break;
            case 7:
                pl("---Confession Simulator---");
                Name = inputString("Enter your name");
                age = inputInt("Enter your age");
                ConfessionSimulator(Name,age);
                break;
            case 8:
                pl("--Fate of your Grade---");
                Name = inputString("Enter your name");
                x = inputInt("Enter Grade Level");
                y = inputInt("Enter ID Number");
                RandomGradeEncoder(Name,x,y);
                break;
            case 9:
                pl("---Voting Simulator---");
                Name = inputString("Enter your name");
                x = inputInt("Enter Zipcode");
                y = inputInt("Enter Voting ID");
                VotingSimulation(Name,x,y);
                break;
            case 10:
                pl("---Food Calorie Info---");
                for(int i=0;i<Food.length;i++){
                    pl((i + 1) + ". " + Food[i]);
                }
                x = inputInt("Choose your Food");
                y = inputInt(Food[x-1]+ " Qty");
                FoodCalorieInfo(x,y);
                break;
        }
        return choice;
    }

    //*****************************Main Unique Methods*****************************
    static int EncodeRecord(int max) {
        String[] Name = new String[max];
        int[] Age = new int[max];
        String[] Gender = new String[max];
        for (int i = 0; i < max; i++) {
            p("Name [" + i + "]");
            Name[i] = inputString("");
            p("Age [" + i + "]");
            Age[i] = inputInt("");
            p("Gender [" + i + "]");
            Gender[i] = inputString("");
            pl("----------");
        }
        pl("Name \t\t Age \t\t Gender");
        for (int i = 0; i < max; i++) {
            pl("Name: " + Name[i] + "\t Age: " + Age[i]
                    + "\t " + Gender[i]);
        }
        return max;
    }

    static String TellMeAboutYourself(String name, int age) {
        for (int i = 0; i < Months.length; i++) {
            pl((i + 1) + ". " + Months[i]);
        }
        int BirthMonth = inputInt("What is your Birthmonth?");
        pl(name + " is " + age + " yrs old, was born in " + Months[BirthMonth - 1]);
        return name;
    }

    static int FortuneTeller(String name, int age) {
        if (age < 18) {
            pl("Kids are not allowed!");
        } else { 
            pl("---Choose your Zodiac---");
            for (int i = 0; i < Horoscope.length; i++) {
                pl((i + 1) + ". " + Horoscope[i]);              
            }       
             int ChineseZodiac = inputInt("Chinese Zodiac Sign #");
            pl("You are " + Horoscope[ChineseZodiac - 1] + " Zodiac");
            pl("Will " + name + " be lucky this year?: " + Fortune[ChineseZodiac - 1]);
        }
        return age;
    }

    static int ChooseApet(int pets) {
        pl("You Choose " + Pets[pets-1]);
        String Rename = inputString("Rename your " +Pets[pets-1] +" a name");
        pl("You named your pet: " + Rename);
        return pets;
    }
    static String CreateAvatar(String user, int age){
        pl("---Choose your Nation---");
        for(int i =0; i<AvaClass.length;i++){
            pl((i + 1) + ". " + AvaClass[i]);     
        }
        int nation = inputInt("Choose your class of Choice");
        pl(user + ", "+ age +" yrs old has a chosen to be " + AvaClass[nation - 1] + " Bender");
        return user;
    }
    static String Login(String User, int password){            
        if(User.equals("admin")&password==12345){
            pl("Login Success");
           
        }else{
            pl("Login Failed Try again");           
        }
        return User;
  
    }
    static int ConfessionSimulator(String name, int age){ 
        if(age<16){
            pl("You're too young");
        }else{
           String Crush = inputString("Name of your Crush");
            for(int i=0;i<Answer.length;i++){
                pl((i + 1) + ". " + Answer[i]);     
            }
            int choice = inputInt(Crush + ": Do you like me?");         
            switch(choice){
                case 1:
                    pl(name + " answered " + Answer[choice-1]);
                    pl("---Conclusion---\n"+name + " loves " + Crush);
                    break;
                case 2:
                    pl(name + " answered " + Answer[choice-1]);
                    pl("---Conclusion---\n"+name+"doesn't love " + Crush);
                    break;
                case 3:
                    pl(name + " answered " + Answer[choice-1]);
                    pl("---Conclusion---\n"+name+" is still confuse for " + Crush);
                    break;
                default:
                    pl("Invalid Answer");
                    break;
            }
        }
        return age;
    }
    static int RandomGradeEncoder(String student, int yrlvl, int id){
                for(int i=0;i<Subject.length;i++){
                    pl((i + 1) + ". " + Subject[i]);
                }
                int choice = inputInt("Choose your Course");
                pl("---"+Subject[choice-1]+"---");
                pl("Name: "+student + "\nYear Level: "+yrlvl+"\nID number: " + id + 
                        "\nGrade: "+ Fate[choice-1]+"!");
        
        return yrlvl;
    }
    static String VotingSimulation(String name, int zipcode, int id){
        pl("---Vote Your Choice---");
      for(int i=0;i<Vote.length;i++){
          pl((i + 1) + ". " + Vote[i]);
      }
      int votechoice = inputInt("Choose your Next President");
      pl("---Voter's Receipt---");
      pl("Name: "+name+"\nZipcode: "+zipcode+"\nVoter's ID#: "+id + "\nVoted: "+Vote[votechoice-1]);
        return name;
    }
    static int FoodCalorieInfo(int foodchoice, int qty){
        pl(Food[foodchoice-1]+" Total Calories: " + Calories[foodchoice-1]*qty);
        return foodchoice;
    }

    //*********************************Reusable Inputs********************************
    static int inNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    static String inSTR() {
        Scanner inputstr = new Scanner(System.in);
        return inputstr.nextLine();
    }
    //********************************Inputs*********************************
    static String inputString(String msg) {
        p(msg + ": ");
        String inputSTR = inSTR();
        return inputSTR;
    }
    static int inputInt(String msg) {
        p(msg + ": ");
        int inputInt = inNum();
        return inputInt;
    }
    //************************Printing Methods***************************
    static void p(String Msg) {
        System.out.print(Msg);
    }

    static void pl(String Msg) {
        System.out.println(Msg);
    }
}
