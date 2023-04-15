public class Learn_If
 {
    public static void main(String[] args) 
    {
        Learn_If li = new Learn_If();
        li.find_highest_score(90,95);

    }

     void find_highest_score(int vk,int msd) {

        // int vk;
        // int msd;
        if(vk>msd)
        {
            System.out.println("virat\t"+vk);
    
        }
        else if(msd>vk)
        {
            System.out.println("msd\t"+msd);

        }
        else {
        System.out.println("virat\t"+vk);
        System.out.println("msd\t"+msd);
        }

    }
    

    
    
}
