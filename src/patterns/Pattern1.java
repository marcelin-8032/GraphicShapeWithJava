package patterns;

public class Pattern1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*


 * --------------------------- // Scanner sc= new Scanner(System.in); // //
 * System.out.print("Rows: "); // int rows=sc.nextInt(); // //
 * System.out.println("Col: "); // int col=sc.nextInt(); // // if(rows<=0 ||
 * col<=0) { //
 * System.out.println("The value should not be zero or negative!!!"); // }else {
 * // for(int i=1; i<=rows; i++) { // for (int j=1; j<=col; j++) { //
 * System.out.print("B"); // } // System.out.println(); // } // }
 * ////--------------------------------------------------Q4---------------------
 * ----------------------------------- // Scanner sp=new Scanner(System.in); //
 * int i=2, small=0, large=0; // // System.out.print("Num 1: "); // int
 * a=sp.nextInt(); // small=a; // large=a; // // while(i<=10) { //
 * System.out.print("Num " + i + ": "); // int b=sp.nextInt(); // if(b < small)
 * { // small=b; // } // if(b>large) { // large=b; // } // i++; // } //
 * System.out.print("Larger: " + large + "; Smaller: " + small); //
 * //----------------------------------------------------Q5---------------------
 * ---------------- // Scanner sr=new Scanner(System.in); //
 * System.out.println("Base: "); // int n= sr.nextInt(); // //
 * System.out.println("Exp: "); // int e=sr.nextInt(); // // int result=1, r=1;
 * // // do { // result=result*n; // r++; // }while (r<=e); //
 * System.out.println(result);
 *
 * //------------------------------------------------Q6-------------------------
 * -------------- // int even =0, odd=1; // // for (int i=1; i<=10; i+=2) { //
 * odd=odd*i; // } // for (int i=2; i<=100; i+=2) { // even=even + i; // } // //
 * System.out.print("Even: " + even+ " odd: " + odd);
 *
 * //------------------------------------------------Q7-1-----------------------
 * ---------------------------------------
 *
 * // for (int i=6; i>=1; i--) { // // for (int j=1; j<i; j++) { //
 * System.out.print(" "); // } // for(int k=6; k>=i; k--) { //
 * System.out.print("$"); // } // for(int k=6; k>=i; k--) { //
 * System.out.print("$"); // } // System.out.println(); // }
 * //---------------------------------------------------------Q7-2--------------
 * ----------------------- // System.out.print("      #"); //
 * System.out.println(); // // for (int i=6; i>=1; i--) { // // for (int j=1;
 * j<i; j++) { // System.out.print(" "); // } // System.out.print("#"); //
 * for(int k=6; k>=i; k--) { // System.out.print(" "); // } // for(int k=6;
 * k>=i; k--) { // System.out.print(" "); // } // System.out.print("#"); //
 * System.out.println(); // } // for (int k=7; k>=0;k--) { //
 * System.out.print("# "); // }
 * //---------------------------------------------------Q7-3--------------------
 * --------------------------------------
 *
 * // System.out.println(); // for (int i=6; i>=1; i--) { // for (int j=1; j<i;
 * j++) { // System.out.print(" "); // } // System.out.print("@"); // for(int
 * k=6; k>=i; k--) { // System.out.print(" "); // } // for(int k=6; k>=i; k--) {
 * // System.out.print(" "); // } // System.out.print("@"); //
 * System.out.println(); // } // //----inverse part // for (int i=6; i>=1; i--)
 * { // for (int j=6; j>=i; j--) { // System.out.print(" "); // } //
 * System.out.print("@"); // for(int k=1; k<i; k++) { // System.out.print(" ");
 * // } // for(int k=1; k<i; k++) { // System.out.print(" "); // } //
 * System.out.print("@"); // System.out.println(); // }
 *
 * //--------------------------------------------------------Q8-----------------
 * ---------- // Scanner scn= new Scanner(System.in); //
 * System.out.println("Enter your number: "); // int a=scn.nextInt(); // //
 * boolean isPrime=true; // for(int i=2; i<a/2; i++) { // if(a % i==0) { //
 * isPrime=false; // break; // } // } // if (isPrime) { //
 * System.out.print("YES"); // }else { // System.out.print("NO"); // }
 * //---------------------------------------------Q9----------------------------
 * ------
 *
 * // Scanner scnn= new Scanner(System.in); // int a=scnn.nextInt(); // int
 * result=1; // int q=a/10; // //-----------avec do-while---------- // do { //
 * q=q/10; // result++; // }while(q !=0); // // System.out.println(result);
 * //------------ avec while--------- // while(q !=0) { // q=q/10; // result++;
 * // } // System.out.println(result);
 *
 * //----------------------------------------Q10--------------------------------
 * -- // Scanner scn= new Scanner(System.in); //
 * System.out.print("First Num: "); // int a= scn.nextInt(); // //
 * System.out.print("Second Num: "); // int b=scn.nextInt(); // // int sum=0,
 * mul=1; // // if(a<b) { // for (int i=a+1; i<b; i++) { // // sum=sum+i; //
 * mul=mul*i; // } // System.out.println("Sum: " + sum + " Mul: " + mul); //
 * }else { // System.out.
 * println("!!!!The first number shoud be smaller than second number!!!!"); // }
 * //--------------------------------------Q11----------------------------------
 * -------------- // Scanner sc= new Scanner(System.in); //
 * System.out.print("Enter your number: "); // int a=sc.nextInt(); // int
 * count=0, large=0; // boolean isPrime=true; // // for (int i=1; i<a; i++) { //
 * isPrime=true; // for(int j=2; j<i; j++) { // if(i % j ==0) { //
 * isPrime=false; // break; // } // } // if (isPrime && i !=2) { // count++; //
 * large=i; // System.out.println(i); // isPrime= false; // } // } //
 * System.out.print(count+"  " +large); //
 * //---------------------------------------Q12---------------------------------
 * ---------------------- // Scanner sc= new Scanner(System.in); //
 * System.out.print("How many prime numbers you want to print? "); // int
 * a=sc.nextInt(); // int count=0, sum=0; // boolean isPrime=true; // // for
 * (int i=1; i<a; i++) { // isPrime=true; // for (int j=2; j<i; j++) { // if(i %
 * j ==0) { // isPrime=false; // break; // } // } // // if (isPrime && i !=2) {
 * // count++; // sum=sum+i; // System.out.println(i); // isPrime=false; // } //
 * }
 *
 * //-----------------------------------------Q13-------------------------------
 * ------------------- // int []arr1= {1,2,3,4,5,6,7,8,9,10}; // int []arr2=
 * {11,12,13,14,15,16,17,18,19,20}; // int []arr3=new int[20]; // int index=0;
 * // // for (int i=0; i<arr1.length;i++) { // arr3[index++]=arr1[i]; //
 * arr3[index++]=arr2[i]; // } // // for (int i=0; i<arr3.length; i++) { //
 * System.out.print(arr3[i]+" "); // }
 * //-------------------------------------------Q14-----------------------------
 * ------------------------- // int[]arr= {5,50,34,1,6,56,82,43,101}; // // int
 * small=arr[0], large=arr[0]; // int s_small=-1, s_large=-1; // // for (int
 * i=1; i<arr.length; i++) { // if (arr[i]<small) { // s_small=small; //
 * small=arr[i]; // } // // if(arr[i]>large) { // s_large=large; //
 * large=arr[i]; // } // } // System.out.println(s_small+"  "+ s_large);
 *
 * //---------------------------------------Q15-------------------------------


 * //----------------------------------------Q16-------------------------------
 * // Scanner sccc=new Scanner(System.in); // int[] arr= new int[10]; //
 * System.out.print("Array Value: "); // for (int i=0; i<arr.length; i++) { //
 * arr[i]=sccc.nextInt(); // } // System.out.print("Num1: "); // int a=
 * sccc.nextInt(); // System.out.print("Num2: "); // int b= sccc.nextInt(); //
 * // int index_a=0, index_b=0; // for (int i=0; i<arr.length; i++) { //
 * if(arr[i]==a) { // index_a=i; // } // if(arr[i]==b) { // index_b=i; // } // }
 * // // int c=arr[index_a]; // arr[index_a]=arr[index_b]; // arr[index_b]=c; //
 * // for (int i=0; i<arr.length; i++) { // System.out.print(arr[i]+ " "); // }
 * //--------------------------------------Q17----------------------------------
 * -------------- // int []arr1= {1,2,13,4,5,6,17,8,9,10}; // int []arr2=
 * {11,12,13,2,15,16,17,9,19,20}; // // for (int i=0; i< arr1.length; i++) { //
 * for(int j=0; j<arr1.length; j++) { // if (arr1[i]==arr2[j]) { //
 * System.out.println(arr1[i]); // } // } // }
 * //-----------------------------------Q18-------------------------------------
 * ---

 * //--------------------------------Q19----------------------------------------
 * ---- int []arr1= {1,2,13,4,5,6,17,8,9,10}; int []arr2=
 * {11,12,13,2,15,16,17,9,19,20};
 *
 * for (int i=0; i< arr1.length; i++) { for(int j=0; j<arr1.length; j++) { if
 * (arr1[i]==arr2[j]) { System.out.println(arr1[i]); } } }
 *
 * int [] arr3= new int[10]; for(int i=0; i<arr1.length; i++) { arr3[i]=arr1[i];
 * } for(int i=0; i<arr1.length; i++) { arr1[i]=arr2[i]; } for(int i=0;
 * i<arr1.length;i++) { arr2[i]=arr3[i]; }
 *
 * for(int i=0; i<arr1.length; i++) { System.out.print(arr1[i]+ " "); }
 * System.out.println(); for(int i=0; i<arr2.length; i++) {
 * System.out.print(arr2[i]+ " "); }
 * } }
*/


