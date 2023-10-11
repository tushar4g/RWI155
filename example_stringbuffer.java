package stringBuffer_stringBuilder;

public class example_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer example 
		StringBuffer sbuff= new StringBuffer("tushar");
		System.out.println("result before appending:- "+ sbuff);
		sbuff.append("sahu");
		System.out.println("result after append :- "+sbuff);
		int len=sbuff.length();
		System.out.println(len);
		
//		StringBuilder Exmaple
		StringBuilder sbuild= new StringBuilder("hello");
		System.out.println("result before appending:- "+ sbuild);
		sbuild.append(" world");
		System.out.println("result AFTER append:- "+ sbuild);
		
		int leng=sbuild.length();
		System.out.println(leng);
		
	}

}
