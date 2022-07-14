package intervieQues;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "SILENT";
		String s2 = "Listen";
		
		if(s1.length()==s2.length())
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
			
				if(s1.charAt(i) == s2.charAt(j))
				{
					s2=s2.substring(0, j)+ s2.substring(j+1);
				}
				
			}
			
		}
		
		if(s2.length()==0)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
	}

	}

}
