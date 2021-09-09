class genericswapmethod {
    public static void main(String[] args) {
       
        public static <T> void swap(T[] a,int i, int j){
            
            T temp = a[i];
            a[i]= a[j];
            a[j]= temp;
    }
    
}