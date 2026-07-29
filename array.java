
public class array{
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;  
    }
    

    
    public static void reverse_array(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void pairsin_array(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    public static void subArray(int numbers[]){
        //pick start and end and traverse thru it
        for(int i=0;i<numbers.length;i++){
            System.out.print("("+numbers[i]+") ");
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]);
                for(int a=i+1;a<=j;a++){
                    
                    System.out.print(","+numbers[a]);
                    if(a==j){
                        System.out.print(") ");
                    }
                }
                
            }
            System.out.println();
            
        }
    }
    public static void linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
             System.out.println("the key is present at: "+(i+1));   
            }
            if(i==numbers.length){
                System.out.println("the key is absent");
            }
        }
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        subArray(numbers);
        
    }      
} 