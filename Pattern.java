import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=(n*(n+1))/2;

        for(int i=1;i<=n;i++){
            int rowNum=total-n+i;
            for(int j=0;j<n;j++){
                rowNum-=(j);
                if(j>=n-i){
                    System.out.print(""+rowNum+" ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
