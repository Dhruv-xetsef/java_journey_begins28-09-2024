public class inverted_number_half_pyramid {
    public static void main(String args[]){
        //12345
        //1234
        //123
        //12
        //1
        int m=5;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
}
