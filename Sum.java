package prime;

public class Sum
{
   public static void main (String[] args)
   {		
       int i,num;
       int sum=0;
       

       for (i = 1; i <= 50; i++)         
       { 		  	  
          int c=0; 	  
          for(num =1; num<=i; num++)
	  {
             if(i%num==0)
	     {
 		c = c + 1;
	     }
	  }
	  if (c ==2)
	  {  
		  System.out.println("Prime no. added:"+i);
	     sum=sum+i;
	     System.out.println("sum upto " +i +":"+sum);
	  }	
       }	
       System.out.println("Total sum of Prime numbers from 1 to 50 are :"+sum);
       
   }
}