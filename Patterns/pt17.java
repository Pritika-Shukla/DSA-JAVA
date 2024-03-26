public class pt17 {
    public static void alpha(int n) {

        for(int i = 0; i < n; i++) {
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
           char ch='A';
           int bp=(2*i+1)/2;
           for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);
            if(j<=bp){
                ch++;
            }
            else{
                ch--;
            }
           }

            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
            }
           
         
    }

    public static void main(String[] args) {
        alpha(5);
    }
}
