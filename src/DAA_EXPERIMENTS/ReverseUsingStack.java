package DAA_EXPERIMENTS;
public class ReverseUsingStack {
    public static void main(String[] args) {
        String str="DAA";
        char[] s=new char[20];
        int top=-1;
        System.out.print("Original String: "+str);
        for(int i=0;i<str.length();i++) s[++top]=str.charAt(i);
        System.out.println("Reversed String: ");
        while(top!=-1) System.out.print(s[top--]);
        System.out.println();
        int[] arr={1,2,3,4};
        int[] st=new int[20];
        top=-1;
        System.out.print("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            st[++top]=arr[i];}
        System.out.print("Reversed Array: ");
        while(top!=-1) System.out.print(st[top--]+" ");}}
