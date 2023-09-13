package leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]ar= {1,2,3,4,3,2};
      int result =0;
      for(int num:ar){
          result=result^num;
      }
     System.out.println(result);
  
	}

}
