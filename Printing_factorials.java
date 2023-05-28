public class Printing_factorials {
    public static void main(String[] args) {
        int no = 5;
        Printing_factorials pf = new Printing_factorials();
        
        while (no>=1) { 
            int fact=pf.printing_factorial(no);
            System.out.println( no+"! = "+fact);
            no--;

            
        }


    }
    int printing_factorial(int no){
        int mul = 1;
        int start = 1;
        while (start<=no) {
            mul = mul*start;
            start++;
            
        }
        return mul;
    }
    
}
