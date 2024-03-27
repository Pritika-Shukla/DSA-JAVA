public class secondlargest {
    public static void main(String[] args) {
        int [] arr={12,34,56,1,2};
   int second=arr[0];
   int largest=arr[1];
   for(int i =1;i<arr.length;i++){
    if(arr[i]>largest){
        second=largest;
        largest=arr[i];
    }
    else{
        if(arr[i]>second && arr[i] !=largest){
            second=arr[i];
        }
    }
   }
System.out.println(second);
    }
}
