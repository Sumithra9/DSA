class Solution {

    void mergeSort(int arr[], int l, int r) {
        
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        
    }
    
    void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarr=new int[n1];
        int[] rightarr=new int[n2];
        
        for(int i=0;i<n1;i++){
            leftarr[i]=arr[left+i];
        }
        
        for(int j=0;j<n2;j++){
            rightarr[j]=arr[mid+1+j];
        }
        
        int i=0, j=0, k=left;
        
        while(i<n1 && j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k++]=leftarr[i++];
            }
            else{
                arr[k++]=rightarr[j++];
            }
        }
        
        while(i<n1){
            arr[k++]=leftarr[i++];
        }
        
        while(j<n2){
            arr[k++]=rightarr[j++];
        }
        
    }
    
}