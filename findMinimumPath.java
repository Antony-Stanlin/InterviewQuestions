import java.util.Arrays;
import java.util.Scanner;

public class findMinimumPath {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the source: ");
        int source[]={sc.nextInt(),sc.nextInt()};
        System.out.print("Enter the Destination: ");
        int dest[]={sc.nextInt(),sc.nextInt()};
        while (source[0]!=dest[0] && source[1]!=dest[1]) {
            
        }
        //minimumPath(source, dest);
    }

    // private static void minimumPath(int[] source,int[] dist){
    //     System.out.println(Arrays.toString(source));
    //     if(source[0]==dist[0] && source[1]==dist[1])    return;
    //     if(source[0]<dist[0])  source[0]++;
    //     if(source[0]>dist[0])  source[0]--;
    //     if(source[1]<dist[1])  source[1]++;
    //     if(source[1]>dist[1])  source[1]--;
    //     minimumPath(source, dist);
    // }
}
