import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class binaryNum {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
         int count=0,min=0;
        while(n>0)
            {
            if(n%2==1)
                {   
                count++; 
                  if(count>=min)
                   {
                     min=count;
                   }
                }
            else
                {
                 count=0;
                 }
        n=n/2;
        }
        System.out.println(min);
        scanner.close();
    }
}