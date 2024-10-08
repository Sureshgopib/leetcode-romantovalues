package practice;

public class RomantoNumber {
	  public static int valueof(char ch)
	    {
	        if(ch=='I')
	        return 1;
	        if(ch=='V')
	        return 5;
	        if(ch=='X')
	        return 10;
	        if(ch=='L')
	        return 50;
	        return -1;
	    }
	    
	    public static  int RomantoNumber(String str)
	    {
	        int res=0;
	        for(int i=0;i<str.length();i++)
	        {
	            int s1=valueof(str.charAt(i));
	            if(i+1<str.length())
	            {
	                int s2=valueof(str.charAt(i+1));
	                if(s1>=s2)
	                {
	                    res=res+s1;
	                }
	                else
	                {
	                    res=res+(s2-s1);
	                    i++;
	                }
	                
	            }
	    
	            else
	            {
	                res=res+s1;
	            }
	        
	       
	    }
	     return res;
	    }


	public static void main(String args[])
	{
	    String str="XXX";
	    System.out.println(RomantoNumber(str));
	}
	}



