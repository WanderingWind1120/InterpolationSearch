package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        InterpolationSearch là phiên bản nhanh hơn của Binary Search nhưng chỉ dùng cho Array hoặc ArrayList của
        dũ liệu dạng số học đã sắp xếp và có quy luật tính toán ra các phần tử của Array đó
         */
        int [] array = {0,2,4,6,8,10,12,14,16};
        System.out.println(interpolationSearch(array, 8));
    }
    private static int interpolationSearch (int[] array, int data){
        int height = array.length-1;
        int low = 0 ;
        int middle = 0;
        while( low<height && array[low]< data && array[height]>data){
            middle = (int) low + (height-low)* (data - array[low])/(array[height]-array[low]);
            int temp = array[middle];
            if(temp > data){
                low = middle+1;
            }
            else if (temp < data){
                height = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
