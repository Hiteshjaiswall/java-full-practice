class array{

    public static void main(String[] args) {
        // int i=10;
        // int j=2;
        // int k=3;
        // int[] arr={10,2,3,4, 5, 6, 7};
        // {10,2,3}
        // int arr[]={10,2,4};
        // int num[]=new int[5];
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
        // for each loop
        // for(int n : arr ){
        //     System.out.println(n);
        // }
        // arr[0]=3;
        // for(int n : arr ){
        //     System.out.println(n);
        // }
        // multidimensional array 
        int num[][]= new int[3][];
        num[0]=new int[4];
        num[1]=new int[5];
        num[2]=new int[3];
    //     for(int i=0; i<3;i++){
    //         for(int j=0; j<4;j++){
    //             num[i][j]=4;
    //         }
    //     }
    // for(int i=0;i<3;i++){
    // for(int j = 0; j<4;j++){ 
    //     System.out.print(num[i][j] + " ");
    // }
    // System.out.println();
    // }
    // for each loop in 2d array
    students S1= new students();
    students S2= new students();
    students S3= new students();
    S1.rollno=1;
    S2.rollno= 2;
    S3.rollno= 3;
    students student[]= new students[3];
    student[0]=S1;
    student[1]=S2;
    for(int n[]:num){
        for(int m: n){
        System.out.println(m+"");
        }
    }
}
}



class students{
int rollno;
int marks;
}