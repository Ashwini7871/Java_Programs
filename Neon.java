public class Neon {
    public static void main(String[] args) {
        int no=9;
        int sum=0;
        int sqr=no*no;//81
while (sqr>0) {
    sum = sum +(sqr%10);// 0+(1),1+(8)
   sqr=sqr/10;
    
}
if (sum==no) {
    System.out.println("given number is NEON NUMBER");
    
}
else{
    System.out.println("given number is NOT A NEON ");
}
    }
    
}
