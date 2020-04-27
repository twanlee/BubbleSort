public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] arr){
        Boolean needNextPass = true;
        for (int i=1; i<arr.length && needNextPass; i++){
            needNextPass = false;
            for (int j=0; j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int x : list) System.out.println(x);
    }
}
