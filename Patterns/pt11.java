public class pt11 {
    public static void iTriangle(int n) {
       int s=1;
    for(int i=0;i<n;i++){
        if(i%2==0){
          s=0;
        }
        else{
            s=1;
        }
        for(int j=0;j<i;j++){
        System.out.print(s);
        s=1-s;
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        iTriangle(5);
    }
}
