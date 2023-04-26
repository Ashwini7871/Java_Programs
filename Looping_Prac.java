public class Looping_Prac {
    public static void main(String[] args) {
      Looping_Prac lp = new Looping_Prac();
    //   lp.print_1(1); 
    // lp.print_number ();
    // lp.print_number1();
    // lp.find_divisor(50);
    // lp.find_divisor_count(50);
    // lp.find_reverse_a_number(123);
    lp.find_count_of_digits(12345);
    }
 private void find_count_of_digits(int no)
  {
    int count = 0;
    while(no>0)
    {
        count= count+1;
        no=no/10;
    }
    System.out.println("count of digits is :"+count);
    }
void find_reverse_a_number(int no) {
 
    while(no>0)
    {
         System.out.println(no%10);

        no = no/10;
    }
    // System.out.println(rev);
    }
    void find_divisor_count(int no) {
        int div=2;
        int count=0;
        while(div<=no)
        {
            if(no%div==0)
            {
                System.out.println(div);
                count= count+1;
            }
            div= div+1;
        }
        System.out.println("total divisor count is"+count);
    }
    void find_divisor(int no) 
    {
        int div=2;
        while(div<=no)
        {
            if(no%div==0)
            {
                System.out.println(div);
                
            }
            div=div+1;
            
        }
    }
    void print_number1() {
        int no=1;
        while(no<=10)
        {
            System.out.println(no);
            no= no+2;
        }
    }
    void print_number( )
    {
        int no =1;
        while(no<=5)
        {
            System.out.println(no);
            no = no+1;
        }
    }
    void print_1(int no)
    {
      
    
        while(no<=5)
        {
            System.out.print(1+" ");
            no = no+1;
        }
        System.out.println();
        
    }
}
