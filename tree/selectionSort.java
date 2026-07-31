public class selectionSort {
    public static void main(String[] args) {
      int arr[]={4,1,5,2,3};
      int size=arr.length,temp;
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println("");
      for(int i=0;i<size-1;i++){
        for(int j=i+1;j<size;j++){
          if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println("");
    }
}