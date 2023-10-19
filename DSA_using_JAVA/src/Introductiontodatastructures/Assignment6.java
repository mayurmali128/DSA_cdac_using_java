package Introductiontodatastructures;

import java.util.Scanner;

public class Assignment6 {
    public static int convetToDecimal(int binary){

        int ans = 0;
        int cnt = 0;
        while(binary!=0){
            int mod = binary%10;

            if(mod==1 || mod==0){
                if(mod==1){
                    ans += (int)Math.pow(2,cnt);
                }
                cnt++;
                binary /= 10;
            }
            else{
                return -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binaru number: ");
        int binary = sc.nextInt();
        int res = convetToDecimal(binary);
        if(res != -1){
            System.out.println("Decimal value: "+ res);
        }
        else{
            System.out.println("Please enter valid binary number.");
        }
    }
}
