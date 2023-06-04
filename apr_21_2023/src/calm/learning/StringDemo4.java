package calm.learning;

public class StringDemo4 {
public static void main(String[] args) {
//	String name="ashwini";
//	for(int i=0; i<name.length(); i++)
//	{
//	char letter = name.charAt(i);
//	System.out.print((char)(letter-32));
//	}
//	----------------------------------------
//	String name="Amal Raj";
//	
//    for(int i=0; i<name.length(); i++)
//    {
//    char letter = name.charAt(i); //letter = A
////if the letter is present in between 'a' and 'z':
//    if(letter>='a' && letter<='z')
//      System.out.print((char)(letter-32));
//    else
//      System.out.print(letter);
    
    //-----small to capital--------
    
    //----capital to small----------
//    String name = "amalRAJ 12345";
//    for(int i=0; i<name.length(); i++)
//    {
//    char letter = name.charAt(i); //letter = A
////if the letter is present in between 'A' and 'Z':
//    if(letter>='A' && letter<='Z')
//      System.out.print((char)(letter+32));
//    else
//      System.out.print(letter);
//    }
    
    //--------collapse----------
	
	String name = "amalraj Vijayakumar";
    //AmAlRaJ
    //0123456
    //0  2 4 6 --> Index
    
    for(int i=0; i<name.length();i++)
    {
      char letter = name.charAt(i);
      if(letter>='a' && letter<='z')
      {
        if(i%2==0)
          {
          System.out.print((char)(letter-32));
          }
        else
        {
          System.out.print(letter);
        }
      }
      else
      {
        System.out.print(letter);
      }
    }
    }
	}

