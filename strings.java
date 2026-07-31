import java.util.*;
public class strings{
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void palindrome(String str){
        boolean flag = true;
        for(int i=0;i<str.length()/2;i++){
            
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=false;
            }
            
        }
        if(flag==true){
            System.out.println("your string is palindrome");
        }else{
            System.out.println("your string is not a palindrome");
        }
    }
    public static void main(String[] args){
        char arr[] = {'a','b','c','d'};
         String str = "abcd";
         String str2 = new String("xyz");
        //String are IMMUTABLE
         //that is strings are never changed

         Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        String fullName="Tony Stark";
        System.out.println(fullName.length());
        //concatenation
        String firstname = "Pawan";
        String lastname = "Koshti";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        printLetters(fullname);
        palindrome("1223221");
    }
}