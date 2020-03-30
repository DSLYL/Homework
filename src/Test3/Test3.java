package Test3;

import java.util.Arrays;
import java.util.Scanner;

class MyArray {
    public static int getMax(int[] a) {
        Arrays.sort(a);
        return a[a.length-1];
    }

    public static void selectSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int k=i;
            for(int j=k+1;j<a.length;j++){
                if(a[j]<a[k]){
                    k=j;
                }
            }
            if(i!=k){
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
     System.out.println(Arrays.toString(a));
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数组长度：");
        int a_len=scanner.nextInt();
        int[] a=new int[a_len];
        System.out.println("输入数组：");
        for(int i=0;i<a_len;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println(MyArray.getMax(a));
        MyArray.selectSort(a);
    }
}



