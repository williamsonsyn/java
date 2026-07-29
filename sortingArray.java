
public class sortingArray{
    public static void bubblesort(int arr[]){
        //procedure-
        //u take one number from the start of array and compare it with the next number 
        //if next number is smaller than current number it is swapped and the larger number is pushed to next index
        //if next number is larger no swapping occurs the next larger number becomes the current number and it is again-
        //compared with the next one 
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        //procedure wise-
        //ek dabbe ke liye ie for first one u take the minimum from the array and put it in the first dabba
        //then u take next dabba find the minimum leaving from the first dabba and put it in the second dabba
        //u do it for number of dabbas -1
        for(int turn=0;turn<arr.length-1;turn++){
            int min=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            // int temp=arr[turn];
            // arr[turn]=arr[min];
            // arr[min]=temp;
            //both are same
            int temp=arr[min];
            arr[min]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        //_ _ _ _ _ consider first one as sorted and pick the next number 
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct posn to insert 
            while(prev >= 0 && arr[prev] > curr){
                //above continues the comparison till the start of the array prev>=0 is the first index limit
                arr[prev+1]=arr[prev];
                //this is inderectly swapping temp is curr, the number which is at first(prev) it is pasted in the next box(prev+1)  
                //this is done till no element is present in start
                //consider for 3 elements in sorted(which is in start) if the curr is smallest each index of 3 elements is switched- 
                //one step forward(prev+1) towards right
                prev--;
            }
            //insertion
            //as in prev+1 there is prev and before while is exited the prev has suffered prev-- which is 1 step behind from- 
            //the target or -ve array
            //so prev+1 is used to come again on to the target and store the curr
            arr[prev+1]=curr;
            //for loop again goes to loop switches to next index compares it and tries to push it back
            
        }
    }
    // INBUILT SORT-- import java.util.Arrays; it is included in * as well tc=nlogn
    // syntax- Arrays.sort(arr)
    // another - Arrays.sort(arr,starting index,ending index)
    //both have another syntax for reverse order - Arrays.sort(arr,Collections.reverseOrder())
    public static void countingSort(int arr[]){
        //procedure wise-
        //first take the largest element from array eg 10 it will create another array2 of 10+1 size
        //in array2 all the indexes will have 0 in it like no. 1 is 0 times no. 2 is 0 times and so on
        //count++ will increase by 1 if there is one number
        //sorting in the 1 array according to how many times a no. is repeated or if any no. is there it will
        //replace the array1 by that number eg 1 occur 2 times arr1 becomes 1 1 this is all done by indexes serially
        //THIS IS RIGGED IF ARR IS LIKE {1 2 10000} IT WILL STILL CREATE ARR OF SIZE 10001 EVEN WHEN 3 ELEMENTS
        //ONLY USE FOR SMALL RANGE AND MORE QUANTITY OF NUMBERS
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,6,1,3,2,3,3};
        countingSort(arr);
       // Arrays.sort(arr);
        printArr(arr);

    }
} 