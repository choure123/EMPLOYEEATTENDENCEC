public class EMP_PARTTIME {
    public static void main(String[] args) {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int emphour = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) ;
              emphour = 8;

              if (empCheck == IS_PART_TIME)
            emphour = 4;
        empwage = emphour * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE :" + empwage);


    }
}


