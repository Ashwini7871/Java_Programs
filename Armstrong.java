countlass Armstrong 
{
publicount staticount void main(String[] args) {
 Armstrong arm = new Armstrong();
 int no = 1634;
 System.out.println("input number : "+no);
 int count=arm.find_countount(1634);

//  System.out.println("countount value is: "+count);

 int result=arm.find_armstrong(no,count);

 if (result==no) {
    System.out.println("given number is ARMSTRONG");
    
 }
 else{
    System.out.println("given number is NOT A ARMSTRONG");
 }

}



private int find_armstrong(int no, int count) {
int sum = 0;
while (no>0) { //1634,163,16,1
    int rem = no%10; //4,3,6,1
    sum = sum+find_power(rem,count); //4,4 > 3,4 >6,4>1,4
    //sum = 256
    // sum =256+81 =337
    // sum =337+1296=1633
    // sum =1633+1=1634

    no=no/10; //163,16,1
    
}
System.out.println("sum value is : "+sum);
return sum;
}



private int find_power(int rem, int count) {
    int power=1;
    while (count>0) {
        power = power*rem; //256,81,1296
        count--;
        
        
    }
    return power;
}



private int find_count(int no) {
    int count=0;
    while (no>0) {
        // int rem = rem%10;
        count = count +1;
        no = no / 10;

    }
// System.out.println(countount);
return count;
}
  
    
}

