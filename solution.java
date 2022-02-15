/*
  Ödev
  Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün 
  katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, sum = 0;
        
        //System.out.print("Enter a number: ");
        //n = input.nextInt();
        
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            
            if (num%4 == 0) {
                sum +=num;
            }
        } while(num%2 == 0);
        
        
        System.out.print("Sum: " + sum);
    }
}
