package MissingNum;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Exp{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>() ;

        n = scanner.nextInt();
        for(int i = 0;i<n-1;i++){
            System.out.print("Enter the Number Sequence:");
            numbers.add(scanner.nextInt());
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<n-1;j++){
                //System.out.print("Missing Number:"+i);
                if(i == numbers.get(j)){
                    break;
                    
                }
                if(j==n-2){
                    System.out.println(i);
                }

            }
        }
        scanner.close();
    }
    }


