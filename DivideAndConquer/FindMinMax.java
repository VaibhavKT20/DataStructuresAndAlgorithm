package DivideAndConquer;

public class FindMinMax {
    static class Pair{
        int min;
        int max;
    }
    public static Pair getMinMax(int arr[],int i,int j){
        Pair minmax=new Pair();
        Pair minmaxLeft=new Pair();
        Pair minmaxRight=new Pair();
        //Small problem using simple classical method
        if(i==j){
            minmax.min=arr[i];
            minmax.max=arr[i];
            return minmax;
        }
        else if(i==j-1){
            if(arr[i]<arr[j]){
                minmax.min=arr[i];
                minmax.max=arr[j];
            }
            else{
                minmax.min=arr[j];
                minmax.max=arr[i];
            }
            return minmax;
        }
        //Big problem using divide and conquer
        else{
            int mid=i+(j-i)/2;
            minmaxLeft=getMinMax(arr,i,mid);
            minmaxRight=getMinMax(arr,mid+1,j);
            if(minmaxLeft.min < minmaxRight.min){
                minmax.min=minmaxLeft.min;
            }
            else{
                minmax.min= minmaxRight.min;
            }
            if(minmaxLeft.max > minmaxRight.max){
                minmax.max= minmaxLeft.max;
            }
            else{
                minmax.max= minmaxRight.max;
            }
            return minmax;
        }

    }

    public static void main(String[] args) {
        int arr[]={50,45,11,9,15,75,89,97};
        int n=arr.length;
        Pair minmax=getMinMax(arr,0,n-1);
        System.out.println("The smallest element in an array is :"+minmax.min);
        System.out.println("The largest element in an array is :"+minmax.max);
    }
}
