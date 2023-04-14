// 1. Create a class called 'School'. 
// 2. Have main method in it. 
// 3. Create an Object called 'schoolObj' inside main method. 
// 4. Using 'schoolObj',   call method called 'test'. 
// 5. Create method 'test'. 
// 6. Inside 'test' method, print "Annual exam".

class School{

    public static void main(String[] args) {
        School schoolObj = new School();     
    schoolObj.test();
}

     void test() {
        System.out.println("Annual exam");
    }

}