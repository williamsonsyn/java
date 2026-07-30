

public class patterns{
    public static void hollow_rectangle(int totrows,int totcols){
        // outer loop
        for(int i=1;i<=totrows;i++){
            //inner loop
            for(int j=1;j<=totcols;j++){
                if(i==1||i==totrows||j==1||j==totcols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void inverted_rectangle(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totrows;j++){

                if(j<=totrows-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=0;j<=totrows-i;j++){
            System.out.print(j+1);
        }
        System.out.println();
        }
    }
    static void floyds_triangle(int totrows){
        int a=1;
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
           
        }
    }
    public static void butterfly_pattern(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*totrows -2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totrows;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*totrows -2*i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solid_rhombus(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=totrows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=totrows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=totrows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=totrows;j++){
                if(j==1||j==totrows||i==1||i==totrows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond_pattern(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totrows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totrows-1;i>=1;i--){
            for(int j=totrows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
     floyds_triangle(5);
    }
}