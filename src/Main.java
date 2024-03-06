import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
public class Main {
        public static void main(String[] args){
         // comments in java
                // integer variable initialization
                int digits = 1234;

                // use long for longer numbers
                long num = 1234567898;

                //float variables
                float cur = 4.08f;

                // use the double key to store longer decimal point
                double curs = 4.14324433;

                //boolean vars
                boolean bool = false;

                //character variables
                char symbol = '@';

                // string variable, it starts with capital because it is of reference datatype
                String name = "Daemon,Lite";


                // swapping variable data

                String x = "water";
                String y = "kool-aid";
                String temp;

                temp = x;
                x = y;
                y = temp;

              // inputs(args);
              // gui(args);
               // maths(args);
               //randoms(args);
               // conditions(args);
                //logical(args);
                //loops(args);
                //arrays(args);
                //strmethods(args);
//                wrapperclasses(args);
                 //arraylist(args);
//                 foreachloop(args);
                  methods(args);
        }

        public static void inputs(String[] args){
             // accepting inputs
                Scanner scanner = new Scanner(System.in);

                System.out.println("what is your name ? ");
                String name = scanner.nextLine();

                System.out.println("How old are you?");
                int age = scanner.nextInt();
                // this scanner below is used to be able to use another next()
                scanner.nextLine();

                System.out.println("what is your favorite food?");
                String food = scanner.nextLine();

                System.out.println("my name is "+ name + " and i am " + age + " years old");
                System.out.println("My Favorite food is " + food);

                scanner.close();

        }

        public static void gui(String[] args){
                // gui
                String name = JOptionPane.showInputDialog("Enter your name");

                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
                JOptionPane.showMessageDialog(null,"Hello "+ name + " you are " + age + " years old");

                double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you "));
                JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        }

        public static void maths(String[] args){
                double x = 3.14;
                double y = -10;

                //finding the biggest number
                double more = Math.max(y,x);
                //finding the lesser number
                double less = Math.min(y,x);
                //finding the absolute of a number i.e a number without negative
                double abs = Math.abs(y);
                // finding the square root
                double sqrt = Math.sqrt(9);
                // finding the power
                double pow = Math.pow(2,3);

                // rounding up
                double roundUp = Math.ceil(x);
                // rounding down
                double roundDown = Math.floor(x);

                // rounding
                double rou = Math.round(x);
                System.out.println(rou);

        }

        public static void randoms(String[] args){
                // random numbers
               Random random = new Random();
               // finding random between two integers
               int num = random.nextInt(10,20);
               // finding random numbers between 0 and 1
               double num2 = random.nextDouble();
               // random boolean
               boolean bool = random.nextBoolean();
               // random integer
                int num3 = random.nextInt(10);
               System.out.println(num3);
        }

        public static void conditions(String[] args) {
                // if statement
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter your age");
                int age = scan.nextInt();

                if (age >= 65) {
                        System.out.println("you are too old");
                } else if (age >= 18) {
                        System.out.println("you are an adult");
                } else {
                        System.out.println("You are too young");
                }

                // switch statement
                System.out.println("What day is today?");
                String day = scan.nextLine();
                switch (day) {
                        case "Monday":
                                System.out.println("today is monday");
                                break;
                        case "Tuesday":
                                System.out.println("today is tuesday");
                                break;
                        case "Wednesday":
                                System.out.println("today is wednesday");
                                break;
                        case "Thursday":
                                System.out.println("today is thursday");
                                break;
                        case "Friday":
                                System.out.println("today is friday");
                                break;
                        case "Saturday":
                                System.out.println("today is saturday");
                                break;
                        case "Sunday":
                                System.out.println("today is sunday");
                                break;
                        default:
                                System.out.println("invalid day");
                                break;
                }

        }
        public static void logical(String[] args){
                // && (and) = both conditions must be true
                // || (or) = either of the conditions must be true
                // ! (not) = reverses the result

                int temp = 10;
                if (temp > 30){
                        System.out.println("it is hot outside");
                } else if (temp >= 20 && temp <= 30) {
                        System.out.println("it is nice outside");
                }else {
                        System.out.println("it is cold outside");
                }

               Scanner scan = new Scanner(System.in);
                System.out.println("You are playing press q or Q to quit");
                String input = scan.nextLine();

                if (input.equals("q") || input.equals("Q")){
                        System.out.println("you quit");
                } else if (!input.equals("q") || !input.equals("Q")) {
                        System.out.println("you continue");
                } else {
                        System.out.println("invalid input");
                }
        }
        public static void loops(String[] args){
                //while loop
                Scanner scanner = new Scanner(System.in);
                String name = "";

                while (name.isBlank()){
                        System.out.println("Enter your name");
                        name = scanner.nextLine();
                }
                System.out.println("Hello "+ name);

                // for loop
                for (int i = 0; i <= 10; i++){
                        System.out.println(i);
                }

                // nested loop
                for (int i = 0; i <= 10; i++){
                        for (int j = 0; j <= 10; j++){
                                System.out.println(i + " " + j);
                        }
                }


        }
        public static void arrays(String[] args){
                // arrays
                // string arrays
                String[] cars = {"volvo", "bmw", "mercedes"};
                //adding to arrays

                // printing arrays
                for (int i=0;i < cars.length; i++){
                        System.out.println(cars[i]);
                }

                // assigning empty arrays and adding values
                String[] vehicles = new String[3];
                vehicles[0] = "car";
                vehicles[1] = "motorcycle";
                vehicles[2] = "bicycle";
                System.out.println(vehicles[0] + " " + vehicles[1] + " " + vehicles[2]);

                // 2d arrays i.e arrays of arrays
               String[][] cars2 = new String[3][3];
               cars2[0][0] = "Chevrolet";
               cars2[0][1] = "Bentley";
               cars2[0][2] = "Mercedes";

               cars2[1][0] = "BMW";
               cars2[1][1] = "Volvo";
               cars2[1][2] = "Toyota";

               cars2[2][0] = "Ford";
               cars2[2][1] = "Hyundai";
               cars2[2][2] = "Nissan";

               for (int i = 0; i < cars2.length; i++ ){
                       System.out.println();
                       for (int j=0; j < cars2[i].length; j++){
                           System.out.print(cars2[i][j] + " ");
                       }
               }
        }
        public static void strmethods(String[] args){
                // methods
                String name = "daemon lite";
                Boolean results = name.equals("Daemon");
                // use this to make it case insensitive
                Boolean result2 = name.equalsIgnoreCase("daemon");
                //checking the length of a string
                int len = name.length();
                // getting a char of a string at an index
                char ch = name.charAt(4);
                // return the index of a character
                int ind  = name.indexOf("m");
                // check if string is empty
                Boolean empty = name.isEmpty();
                // convert to all uppercase
                String upper = name.toUpperCase();
                // convert to all lowercase
                String lower = name.toLowerCase();
                // convert first letters to uppercase
                String upper2 = name.substring(0,1).toUpperCase() + name.substring(1);
                // removing empty spaces
                String tri = name.trim();
                // replacing characters
                String tri2 = name.replace("a", "o");

                System.out.println(tri2);
        }

        public static void wrapperclasses(String[] args){
            // wrapper classes provides a way to use primitive data types as reference data types
            // reference data types contains some useful methods
            // can be used with collections egs arraylist

            // primitive      // reference
            // int            Integer
            // long           Long
            // float          Float
            // double         Double
            // char           Character
            // boolean        Boolean

            // autoboxing = the automatic conversion that java makes between primitive and reference data types
            // unboxing = the reverse of autoboxing

            // egs using autoboxing
            int x = 5;
            Integer y = x;

            boolean z = true;
            Boolean a = z;

            char c = 'a';
            Character d = c;

            String b = "name";

        }

        public static  void arraylist(String[] args){
            // ArrayList unlike regular arrays are resizable and
            // elements can be added after compilation phase
            // store reference data types i.e the value types of the arraylist are going to be wrapper classes
            // egs Boolean,Integer etc

            ArrayList<String> food = new ArrayList<String>();
            // arraylist methods
            // use the .add() method to add values to arraylists
            food.add("pizza");
            food.add("sushi");
            food.add("burger");

            // use the .set() method to change values in an arraylist
            food.set(1, "cake");
            //use the.remove for taking out values
            food.remove(0);
            // use the .size() method to get the size of an arraylist
            int size = food.size();
            System.out.println(size);

            // use .clear() method to clear an arraylist
            food.clear();

            for (int i=0; i < food.size(); i++){
                System.out.println(food.get(i));
            }

            // 2D arraylists i,e arrays of arrays

            ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

            ArrayList<String> bakeryList = new ArrayList<>();
            bakeryList.add("pasta");
            bakeryList.add("bread");
            bakeryList.add("donuts");

            ArrayList<String>  produceList = new ArrayList<>();
            produceList.add("carrots");
            produceList.add("tomatoes");
            produceList.add("onions");

            ArrayList<String> drinks = new ArrayList<>();
            drinks.add("soda");
            drinks.add("coffee");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinks);
            // printing the entire grocery
            System.out.println(groceryList);
            // getting a single list
            System.out.println(groceryList.get(0));
            // getting a single item from the list
            System.out.println(groceryList.get(0).get(1));

        }
        public static void foreachloop(String[] args){
            String[] pets = {"dog", "cat", "fish","bird"};
            // using arraylists
            ArrayList<String> pets2 = new ArrayList<String>();
            pets2.add("jellyfish");
            pets2.add("snail");
            pets2.add("kangaroo");
            pets2.add("giraffe");
            // the : represents "in"
            for (String pet : pets){
                System.out.println(pet);
            }
            for (String pet : pets2){
                System.out.println(pet);
            }
        }

        public static void methods(String[] args){

        }
}



