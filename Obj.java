class Student{

int x;

void fun1(){

    System.out.println("this is object");
}

}



class Obj{

public static void main(String[] arg){

    System.out.println("this is main function");

    Student obj1 = new Student();

obj1.x = 5;
    System.out.println(obj1.x);

    obj1.fun1();

}


}