class LogicalPrograms
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
       LogicalPrograms lp = new LogicalPrograms();
//       lp.find_divisors(100);
      //  lp.find_count_of_divisors(131);
lp.find_prime_numbers(131);
}
void find_prime_numbers(int no) 
{
int div = 2;
int count = 0;
while(div<no)
{
if (no%div==0)
{
System.out.println(div);
count = count+1;
}
div = div + 1;
}
System.out.println("no.of divisor is :"+count);

if (count == 0)
{
System.out.println("prime number");
}
else{
System.out.println("not prime number");
}
    }



    void find_divisors(int no)
    {
      int div =2;
      while(div<no) //1 <=10 , diva = 2 <= 10 
      {
        if(no%div==0)
        {
            System.out.println(div);
        }
        div = div + 1; // div  = 2 +1 = 3,

      }


    }
void find_count_of_divisors(int no)
{
int div = 2;
int count = 0;
while(div<no)
{
if (no%div==0)
{
System.out.println(div);
count = count+1;
}
div = div + 1;
}
System.out.println("no.of divisor is :"+count);
}
     
}
