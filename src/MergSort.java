public class MergSort {
    void merge(int a[],int beg, int mid, int end){
        int i,j,k;
        int n1=mid-beg+1;
        int n2=end-mid;

        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];

        for(i=0;i<n1;i++){
            leftArr[i]=a[beg+i];
        }
        for(j=0;j<n2;j++){
            rightArr[j]=a[mid+1+j];
        }
        i=0;
        j=0;
        k=beg;

        while (i<n1 && j<n2){
            if (leftArr[i]<=rightArr[j]){
                a[k]=leftArr[i];
                i++;
            }else {
                a[k]=rightArr[j];
                j++;
            }
            k++;

        }
        while (i<n1){
            a[k]=leftArr[i];
            i++;
            k++;
        }
        while (j<n2){
            a[k]=rightArr[j];
            j++;
            k++;
        }
    }
    void merSort(int a[], int beg, int end){
        if (beg<end){
            int mid=(beg+end)/2;
            merSort(a,beg,mid);
            merSort(a,mid+1,end);
            merge(a,beg,mid,end);
        }
    }
    void print(int a[], int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={10,30,70,40,80,20,90};
        int n=a.length;
        MergSort obj=new MergSort();
        obj.merSort(a,0,n-1);
        System.out.println("After Sorting");
        obj.print(a,n);
    }
}
