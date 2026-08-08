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
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i = 0;i<path.length(); i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2= y*y;

        return (float)Math.sqrt(X2+Y2);
        
        
    }
    public static void bs(){
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
         String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        String str4 = "HelloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(substring(str, 0, 5)); 
    }
    public static String substring(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void StringBuilder(){
        //O(26)tc
        StringBuilder sb = new StringBuilder("");
            for(char ch = 'a';ch<='z';ch++){
                sb.append(ch);
            }
        System.out.println(sb);
    }
    public static String toUpperCase(String str){
       //String str = "hi, i am pawan";
       //System.out.println(toUpperCase(str));
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i <str.length(); i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
       String str="aaabbcccdd";
       System.out.println(compress(str));

    }
}