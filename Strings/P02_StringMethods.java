public class P02_StringMethods {
 public static void main(String[] args) {

    String name= "Kshitij";    
    // String name= "  Kshitij   ";    

    System.out.println("Original: \n"+ name);
    // System.out.println(name.toLowerCase());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.charAt(5));

    System.out.println(name.length());

    // System.out.println(name.trim()); //removes blank spaces leading and trailing

    // System.out.println(name.substring(2));
    // System.out.println(name.substring(2,5));

    // System.out.println(name.replace("i", "o")); //will replace all i with o
    // System.out.println(name.replaceFirst("i", "o"));   //will replace only first i


    // System.out.println(name.startsWith("k")); //this will be false
    // System.out.println(name.startsWith("K")); //this will be true

    // System.out.println(name.endsWith("ij")); //true
    // System.out.println(name.endsWith("Ij")); //false


    // System.out.println(name.indexOf("o"));  //as o is not there in var name this will return -1
    // System.out.println(name.indexOf("i"));  //this will return a first occurence of i
    // System.out.println(name.lastIndexOf("i"));   //this will return a last occurence of i

    // System.out.println(name.contains("ti"));
    // System.out.println(name.contains("Ti"));


    // System.out.println(name.equals("Kshitij"));  //tru
    // System.out.println(name.equals("kshitij"));  //false 


    //equals() matches string with cases

    // System.out.println(name.equalsIgnoreCase("kshitij"));  //tis will ignore case and will retrun true
  
 }   
}
