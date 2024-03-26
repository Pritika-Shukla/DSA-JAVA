public class pt4 {
    public static void nTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nTriangle(3);
    }
}


// 1
// 2 2 
// 3 3 3