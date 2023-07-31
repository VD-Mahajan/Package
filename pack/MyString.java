package pack;

public final class MyString {
	
		public MyString () {
		}
		public static int length(String str) {
			int length=0;
			char[] arr=str.toCharArray();
			for(char ch:arr) {
				length++;
			}
			return length;
		}
		public static int length(StringBuffer strbfr) {
			int length=0;
			String str =strbfr.toString();
			char[] arr=str.toCharArray();
			for(char ch:arr) {
				length++;
			}
			return length;
		}
}
