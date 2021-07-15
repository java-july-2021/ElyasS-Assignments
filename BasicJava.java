import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class BasicJava{
    
    public static void main(String[] args) {
        // Print1To255();
        // OddNum();
        // SumNum();
        int[] arr1 = {-1,2,3,-5,7};
        double[] arr2={-3,0,4,5,1};
        // IterateArr(arr1);
        // FindMax(arr1);
        // Avg(arr1);
        // ArrOddNum();
        // GreaterThanY(arr1, 1);
        // SqrArr(arr2);
        // Eleminat(arr1);
        int [] mma= MaxMinAvg(arr1);  //since we are returing we need to save it in a vaiable then print it
        System.out.print(Arrays.toString(mma));

        ShiftValue(arr1);
    }

    public static void Print1To255(){
        int i = 1;
        while(i <= 12){
            System.out.println(i);
            i++;
                }
    }


    public static void OddNum() {
        for (int i = 1; i <=12 ; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }        
    }

    public static void SumNum() {
        int sum = 0;
        int i = 0;
        while(i <=12){
            sum = sum +i;
            System.out.println("New number: " +i+ " Sum: " +sum);
            i++;
        }
    }

    public static void IterateArr(int[] x){
        for(int i = 0; i<= x.length -1; i++){
            System.out.println(x[i]);
        }
    }

    public static void FindMax(int[] x){
        int max= x[0];
        for(int i=0; i<x.length; i++){
            if(max < x[i]){
                max = x[i];
            }
        }
        System.out.println(max);
    }

    public static void Avg(int[] x){
        int avg = 0;
        int sum = 0;
        int i = 0;
        while(i < x.length){
            sum = sum +x[i];
            i++;
        }

        avg = sum / x.length;
        System.out.println(sum);
        System.out.println(avg);
    }

    public static void ArrOddNum() {
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i = 1; i <=12 ; i++){
            if(i%2 != 0)
                y.add(i);
            
        }        
        System.out.println(y);
    }


    public static void GreaterThanY(int[]x ,int y){
        int counter = 0;
        for(int i = 0; i< x.length; i++){
            if (x[i]>y){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void SqrArr(double[] x){
        for(int i =0 ; i<x.length; i++){
            x[i]= Math.pow(x[i], 2); 
        }

        System.out.println(Arrays.toString(x));
    }

    public static void Eleminat(int x[]){
        for(int i=0; i<x.length; i++){
            if(x[i]<0){
                x[i]=0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    public static int[] MaxMinAvg(int[] x){
        int[] newArr = new int[3];
        
        int min= x[0];
        for(int i=0; i<x.length; i++){
            if(min > x[i]){
                min = x[i];
            }
        }
        newArr[0]=min;

        int max= x[0];
        for(int i=0; i<x.length; i++){
            if(max < x[i]){
                max = x[i];
            }
        }
        newArr[1]=max;

        int avg = 0;
        int sum = 0;
        int i = 0;
        while(i < x.length){
            sum = sum +x[i];
            i++;
        }

        avg = sum / x.length;

        newArr[2]=avg;

    return newArr;

    }

    public static void ShiftValue(int[] x){
        for(int i=0; i<x.length; i++){
            if(i==x.length-1){
                x[i]=0;
            break;
            } 
            x[i]=x[i+1];
        }

        System.out.println(Arrays.toString(x));
    }

}

