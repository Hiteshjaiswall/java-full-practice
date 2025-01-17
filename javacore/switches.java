public class switches {
    
    public static void main(String[] args) {
        int day=3;
        // if(n==1){
        // System.out.println("today is monday");
        // }else if(n==2){
        // System.out.println("today is tuesday");
        // } else if(n==3){
        // System.out.println("today is wednesday");
        // }else if(n==4){ 
        // System.out.println("today is thursday");
        // }
        //  we use stwich to make it less messy and convienience
        switch(day){
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            default:
                System.out.println("Invalid day");
        } 
    }
}
