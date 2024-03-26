public class largest {
    public static void main(String[] args) {
        int [] arr={12,45,67,17,8};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
          
           if (arr[i] > max) {
            max = arr[i]; // Update max if a larger element is found
        }
    }
System.out.println(max);
        }
    
}
