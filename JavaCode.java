class swap {
     void swap(int a, int b){
        System.out.println("Numbers before swap are a= "+a+" and b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swap are a= "+a+" and b= "+b);
     }
}
public class JavaCode{
public static void main(String... s){
swap obj= new swap();
obj.swap(1,2);
}
}