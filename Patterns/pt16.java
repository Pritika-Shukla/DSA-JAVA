public class pt16 {
    public static void alpha(int n){
       char s='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(s);
               
            }
            System.out.println();
            s++;
        }
    }
    public static void main(String[] args) {
        alpha(5);
    }
    
}
