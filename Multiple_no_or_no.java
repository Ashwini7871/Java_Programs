public class Multiple_no_or_no {
    public static void main(String[] args) {
        // Multiple_no_or_no mul = new Multiple_no_or_no();
        // mul.find_mul_no_or_no();
        int no=1;
        while (no<=20) {
            if(no%3==0 &&no%5==0)
            {
                System.out.println(no);
            }
            no = no+1;
        }

    }
    
}
