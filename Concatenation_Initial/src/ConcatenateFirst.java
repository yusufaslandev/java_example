import java.util.Scanner;

public class ConcatenateFirst {

	public static void main(String[] args) {
		String sentence,first,middle,last,space,chars;
		space=" ";
		int sayi;
		boolean bool=true;
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("Bir cümle giriniz (üç kelime)");
			sentence=scanner.nextLine();
			sayi=0;
			for(int i=0;i<sentence.length();i++)
			{
				if(sentence.charAt(i) == ' ')
				{
					sayi++;
					
				}
				
			}
			if(sayi+1==3)
			{
				
		       first=sentence.substring(0,sentence.indexOf(space));
		       sentence=sentence.substring(sentence.indexOf(space)+1,sentence.length());
		       middle=sentence.substring(0,sentence.indexOf(space));
		       last=sentence.substring(sentence.indexOf(space)+1,sentence.length());
		       chars=first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
		       System.out.println("first headers :" + chars);
		       bool=false;
				
				
			}
			
			
		}while(bool);

	}

}
