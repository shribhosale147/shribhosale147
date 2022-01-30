public class Demo{
    int merg(int a[], int beg, int mid, int end){
        int n1=mid-beg+1;
        int n2=end-mid;
        int i,j,k;

        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];

        for (i=0;i<n1;i++){
            leftArr[i]=a[beg+i];
        }
        for (j=0;j<n2;j++){
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

        return 0;
    }
    void mergSort(int a[],int beg, int end){
        if(beg<end){
            int mid=(beg+end)/2;
            mergSort(a,beg,mid);
            mergSort(a,mid+1,end);
            merg(a,beg,mid,end);
        }
    }
    void print(int a[]){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
    public static void main(String args[]){
        Demo obj=new Demo();
        int arr[]={90,20,45,57,23,43,33};
        int end=arr.length;
        obj.mergSort(arr,0,end-1);
        obj.print(arr);
    }
}

