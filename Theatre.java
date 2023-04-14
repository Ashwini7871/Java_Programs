// 1. Create class called 'Theatre'. 
// 2. Have main method in it. 
// 3. Create an object called 'rohini_theatre'. 
// 4. Using 'rohini_theatre', call a method named as 'show'. 
// 5. For the above method, pass 120, 4 as arguments [show(120,4)]. 
// 6. Define show(120,4) method. 
// 7.  Name the first argument as ticket_price and second as no_of_persons
// 8. Inside show method definition, print the total cost for four persons



class Theatre
{
public static void main(String[]args)
{
Theatre rohini_theatre = new Theatre();
rohini_theatre.show(120,4);

}
void show(int ticket_price,int no_of_persons)
{
    System.out.println(ticket_price*no_of_persons);
}

}