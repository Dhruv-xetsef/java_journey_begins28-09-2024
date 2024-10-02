public class butterfly {
    public static void main(String[] args) {
        //*             *
        //* *         * *
        //* * *     * * *
        //* * * * * * * *
        //* * * * * * * * 
        //* * *     * * *
        //* *         * *
        //*             *
        int m=5;
        for(int i=1;i<=m;i++){
            //1st part for stars
            for (int j=1;j<=i;j++){
                System.out.print("*");   
            }
            //for spaces
            int spaces=2*(m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=m;i>=1;i--){
            //1st part for stars
            for (int j=1;j<=i;j++){
                System.out.print("*");   
            }
            //for spaces
            int spaces=2*(m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
}

