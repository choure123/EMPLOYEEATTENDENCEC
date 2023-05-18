public class EMPWAGE {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {


        int emphour = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck)
        {
            case IS_FULL_TIME:
                emphour = 8;
                break;
            case IS_PART_TIME:

                emphour = 4;
                break;
            default:
                emphour = 0;
        }
        empwage = emphour * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE :" + empwage);
    }


}


