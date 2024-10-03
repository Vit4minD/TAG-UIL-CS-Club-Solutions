import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n], left[] = new int[n], right[] = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int leftmax = 0, rightmax = 0;
        for(int i = 0; i<n; i++)
        {
            leftmax = Math.max(leftmax, arr[i]);
            rightmax = Math.max(rightmax, arr[n-1-i]);
            right[n-1-i] = rightmax;
            left[i] = leftmax;
        }
        int ans = 0;
        for(int i = 0; i<n; i++)
            ans+=Math.min(left[i], right[i])-arr[i];
        System.out.println(ans);
        sc.close();
    }
}