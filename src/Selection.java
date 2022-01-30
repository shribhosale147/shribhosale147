public class Selection {
    static void print(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    static void SelectSort(int a[]){
        int temp,small;
        for(int i=0;i<a.length;i++){
            small=i;
            for(int j=i+1;j<a.length-1;j++){
                if (a[j]<a[small]){
                    temp=a[small];
                    a[small]=a[j];
                    a[j]=temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int arr[]={10,40,50,30,90,20,80,70};
        Selection obj=new Selection();
        System.out.println("Before Sorting");
        obj.print(arr);
        System.out.println("After sorting");
        obj.SelectSort(arr);
        obj.print(arr);
    }
}
