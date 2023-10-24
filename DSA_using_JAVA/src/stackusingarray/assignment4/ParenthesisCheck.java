package stackusingarray.assignment4;

import java.util.Scanner;

public class ParenthesisCheck {

    public static boolean check(String str){
        CharStack st = new CharStack(str.length());
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='(' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }
            else{
                if(str.charAt(i)==']' && !st.isEmpty()&& st.peak()=='['){
                    st.pop();
                }
                else if(str.charAt(i)==')'&& !st.isEmpty()&& st.peak()=='('){
                    st.pop();
                }
                else if(str.charAt(i)=='}' &&  !st.isEmpty()&& st.peak()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check valid parenthesis: ");

        String str = sc.nextLine();

        if(check(str)){
            System.out.println("Balanced string.");
        }
        else{
            System.out.println("Not Balanced string.");
        }
    }
}
