public class methodoverloading {
    
    public static void main(String[] args) {
        calculator cal= new calculator();
        int result=cal.add(10,5);
        System.out.println(result);
    }
}

class calculator{
    int a=1;
    public int add(int num1, int num2){
    return num1+num2;
    }
    public double add(double num1, int num2){
        return num1+num2;
        }
}
