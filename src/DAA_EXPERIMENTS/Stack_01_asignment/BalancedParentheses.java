package DAA_EXPERIMENTS;
public class BalancedParentheses {
    public static void main(String[] args) {
        String exp="{[()]}";
        char[] stack=new char[20];
        int top=-1;
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c=='{'||c=='['||c=='(') {
                stack[++top]=c;
            } else {
                if(top==-1){
                    System.out.println("Expression is NOT Balanced");
                    return;
                }
                top--;}}
        if(top==-1)
            System.out.println("Expression is Balanced");
        else
            System.out.println("Expression is NOT Balanced");
    }
}
