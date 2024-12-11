public class TowerOfHanoi{
    public static void TowerOfHanoi1(int n,String src,String helper,String des){
        if(n==1){
            System.out.println("transfer disc"+n+"from"+src+"to"+des);
        return;
        }
        TowerOfHanoi1(n-1,src,des,helper);
        System.out.println("transfer disc"+n+"from"+src+"to"+des);
        TowerOfHanoi1(n-1, helper, src, des);
    }
    public static void main(String[] args) {
        int n=7;
        TowerOfHanoi1(n,"source","helper","destination");
    }

}