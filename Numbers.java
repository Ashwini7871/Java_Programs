 class Numbers 
{
      public static void main(String[] args)
      {
         Numbers task = new Numbers();
         // task.task1();
         // task.task2();
         task.task3();
      }

       void task3() {
         int no=0;
         while(no<15)
         {
            System.out.println(no);
            no = no+3;
            System.out.println("numbers :"+ no);
            
         }
      }

      private void task2() {
         int no=1;
         while(no<=15)
         {
            System.out.println("numbers :"+no);
            no = no+3;
         }

   
      }

      void task1()
      {
       int no = 2;
         while(no<=10)
            {
                System.out.println("even numbers :"+no);
               no = no+2;

            }
      }
     
}
