package stackusingarray.assignment5;

import stackusingarray.assignment1.MyStack;

import java.util.Scanner;

public class Postfix {
    private static void calPostfix(String str){
        MyStack st = new MyStack(str.length());

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                st.push(ch-'0');
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' ||ch=='%'){
                int no2 = st.pop();
                int no1 = st.pop();
                int res = 0;

                switch (ch){
                    case '+':
                        res = no1+no2;
                        break;
                    case '-':
                        res = no1-no2;
                        break;
                    case '*':
                        res = no1*no2;
                        break;
                    case '/':
                        res = no1/no2;
                        break;
                    case '%':
                        res = no1%no2;
                        break;
                }
                st.push(res);
            }
            else{
                System.out.println("Plese enter valid postfix expression.");
            }
        }

        System.out.println("Result: "+ st.pop());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid postfix experission: ");
        String str = sc.nextLine();
        calPostfix(str);
    }
}
