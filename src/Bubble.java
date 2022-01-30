public class Bubble {
    static void print(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]);
        }
    }
    static void bubbleSort(int a[]){
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int arr[]={10,40,50,30,90,20,80,70};
        Bubble obj=new Bubble();
        System.out.println("Before Sorting");
        obj.print(arr);
        System.out.println("After sorting");
        obj.bubbleSort(arr);
        obj.print(arr);
    }
}
