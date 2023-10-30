import java.util.ArrayList;

public class Main {
            // Main driver method
            public static void main(String args[])
            {
                // Creating an Array of string type
                ArrayList<String> al = new ArrayList<>();

                // Adding elements to ArrayList
                // Custom inputs
                al.add("Geeks");
                al.add("Geeks");

                // Here we are mentioning the index
                // at which it is to be added
                al.add(1, "For");

                // Printing all the elements in an ArrayList
                System.out.println(al);
                udskriv(al);
            }

            public static void udskriv(ArrayList<String> l){
                for(String str: l)
                    System.out.print(str+" ");
            }
        }
