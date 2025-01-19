public class classobject {
    public static void main(String[] args) {
        calculator cal= new calculator();
        int result=cal.calc(10,5);
        System.out.println(result);
    }
}
class calculator{
    // knows something
    int a=1; 
    // what to do  
    public int calc(int num1, int num2){
        System.out.println("this is in the calculator");
        int result=num1+num2;
        return result;
    }
}
