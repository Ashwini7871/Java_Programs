 class Tenali
{
public static void main(String[] args)
{
Tenali story = new Tenali(); 
// story.find_security(1024); 
// story.find_flowers(7);
story.print_1();

}
void print_1()
{
    int count = 1;
    while(count<=10)
    {
        System.out.println(count);
        // System.out.print(1+" ");
    count=count+2;
    // System.out.println(count);
    }
}

// void find_security(int beats){

void find_flowers(int temples) 
{
    int flowers_count = 1;
    while (temples>0)
    {
        flowers_count=flowers_count*2;
        System.out.println("flowers count each time"+ flowers_count);
        temples = temples-1;
        System.out.println("temple count is:"+temples);
    }
    System.out.println("total flowers"+flowers_count);
    


}

void find_security(int beats) {
int security = 0;
while(beats>1)

    {
System.out.println("Each security gets "+ (beats/2));
beats = beats/2; 
security = security +1;
}
System.out.println("Total no.securities"+security);
}





}
