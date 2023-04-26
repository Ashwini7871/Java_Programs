class Looping_Practice {
    public static void main(String[] args) {
        Looping_Practice lp = new Looping_Practice();
        // lp.print_reverse(9697);
        // lp.find_count_of_digits(12345);
    lp.find_sum_of_digits(2023);
    // lp.reverse_a_no(1234);
    // lp.find_palindrome(12321);
    }
     void find_palindrome(int cake) {
        int ashwin = cake;
        int reverse=0;
        while(cake>0)
        {
            int rem = cake % 10;
            reverse=(reverse*10)+rem;
            cake = cake/10;
        }
        // System.out.println(ashwin);
        // System.out.println(cake);
        if(reverse==ashwin)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    void reverse_a_no(int cake) {
        int reverse=0;
        while(cake>0)
        {
            int rem = cake%10;
            reverse=(reverse*10)+rem;
            cake = cake/10;
        }
        {
            System.out.println("reverse is"+ reverse);
        }
    }
    void find_sum_of_digits(int cake) {
int sum=0;
while(cake>0)
{
    sum=sum+(cake%10);
    cake= cake/10;
}
{
    System.out.println("sum of digits : "+sum);
}


    }
    void print_reverse(int cake)
    {
        while(cake>0)
        {
            System.out.print(cake%10+" ");
            cake=cake/10;
        }
        System.out.println();
    }
    void find_count_of_digits(int cake)
    {
        int count = 0;
        while(cake>0)
        {
        count= count+1;
        cake= cake/10;

        }
        System.out.println("count of digits is :"+count);
    }
}
