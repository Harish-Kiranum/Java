
package Exceptionhandling;
public class NestedTry {

      public static void main(String[] args) {

            try{
                  System.out.println("Nesed try begins");

                  try{
                        int a = 47, b = 0;
                        int div  = a/b;
                  }catch(ArithmeticException e){
                        System.out.println("Division by 0 not allowed");
                  }

                  try{
                        int arr[] = {1,7,3,8,5};
                        System.out.println(arr[10]);
                  }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("index doesnot exists in array");
                  }

            }catch(Exception e){
                        System.out.println("Exception occured");
            }

      }
}
