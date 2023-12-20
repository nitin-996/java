class Average{


public static void main(String[] args){

    int i =0, s=0;

    for(i=0; i<args.length;i++){

      s += Integer.parseInt(args[i]);

    }

    System.out.println(s/args.length);
}

}