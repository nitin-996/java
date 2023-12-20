class Wrap{


public static void main (String[] args){

    int x = Integer.parseInt("123"); // this is string it will be changed into int.
   

    Integer x1 = Integer.valueOf("123"); // same upper work is done here but in two steps . it create reference varaible.
    int y = x1.intValue(); // so to print or use this variable we the use intValue method .
    System.out.println(y);
}

}

// we have multiple wrapper classes.