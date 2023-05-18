public class U1EMPATTENDANCE {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        double empCheck = Math.floor(MAth.random() *10)%2;
        if (empCheck == IS_FULL_TIME)
            System.out.println( "Empolyee is present");
        else
            System.out.println( "Empolyee is abscent");
    }
}
