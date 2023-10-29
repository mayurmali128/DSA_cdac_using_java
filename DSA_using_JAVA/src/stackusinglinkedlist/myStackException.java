package stackusinglinkedlist;

public class myStackException extends Exception{
    private String str;

    public myStackException(){
        str = "Stack is empty.";
    }

    public  myStackException(String str){
        this.str = str;
    }

    @Override
    public String getMessage() {
        return str;
    }
}
