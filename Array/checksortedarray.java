public class checksortedarray {
    public static void main(String[] args) {
        int arr []={12,34,45,67};
         boolean sorted=true;
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            {
                sorted=false;
                break;
            }
         }
         if(sorted){
            System.out.println("Array is sorted");
         }
         else{
            System.out.println("Array is unsorted");
         }
    }
}
