package swap;

class genericswapmethod {
    
       public static <T> void swap(T[] a,int i,int j){
        T temp = a[i];
        a[i]=a[j];
        a[j]=temp;
       }
    }
