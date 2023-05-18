public class EMPWAGE {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        int EMP_RATE_PER_HOUR =20;
        int emphour =0;
        int empwage =0;
        double empCheck = Math.floor(Math.random() *10)%2;
        if (empCheck == IS_FULL_TIME);
            emphour= 8;

            else
            emphour=0;
        empwage = emphour *EMP_RATE_PER_HOUR;
        System.out.println( "EMP WAGE :" + empwage );




    }
}
