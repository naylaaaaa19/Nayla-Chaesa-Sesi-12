public class AngkaMundur {
    public static void hitungmundur(int n) {
        if (n < 1) return ; 
        else {
            System.out.print(n + " ");
            hitungmundur(n-1);
        }
        hitungmundur(7);
        System.out.println(n);
    }   
}

