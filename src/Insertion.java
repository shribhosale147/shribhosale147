public class Insertion {
    static void print(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]);
        }
    }
    static void InsertSort(int a[]){
        int temp,j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i-1;
            while(j>=0&&temp<=a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }


    }

    public static void main(String[] args) {
        int arr[]={10,40,50,30,90,20,80,70};
        Insertion obj=new Insertion();
        System.out.println("Before Sorting");
        obj.print(arr);
        System.out.println("After sorting");
        obj.InsertSort(arr);
        obj.print(arr);
    }
}
