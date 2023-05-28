import javax.lang.model.util.ElementScanner6;

public class Spy_number {
    public static void main(String[] args) {
        Spy_number sn = new Spy_number();
        sn.find_spy_number(132);
    }
    void find_spy_number(int no)
    {
        int sum=0,mul=1;
        while(no>0)
        {
            int rem = no%10;
            sum = sum+rem;
            mul = rem*mul;
            no = no/10;
        }
        System.out.println("Sum = "+sum);
        System.out.println( "multiple = "+mul);
        if (sum==mul) {
            System.out.println("Given number is Spynumber ");
            
        } else {
            System.out.println("Given number is not a Spynumber");
            
        }
    }
    
    
}

