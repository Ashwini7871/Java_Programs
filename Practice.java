
public class Practice {
    public static void main(String[] args) {
        Practice prac = new Practice();
        // prac.print_number1();
        // prac.print_number_add1();
        // prac.print_number_add2();
        prac.print_number_add3();
    }

    private void print_number_add3() {
        int no =3;
        while (no<=15) {
            System.out.print(no+" ");
            no = no+3;
        }
        System.out.println();
    }

    private void print_number_add2() {
        int no = 1;
        while (no<=10) {
            System.out.print(no+" ");
            no = no+2; 
        }
        System.out.println();
    }

    private void print_number_add1() {
        int no=1;
        while(no<=5)
        {
            System.out.print(no+" ");
            no = no+1;
        }
System.out.println();

    }

    private void print_number1() {
        int no =1;
while (no<=5) {
    System.out.print(1+ " ");
    no = no+1;
    
}
System.out.println();
    }

}
