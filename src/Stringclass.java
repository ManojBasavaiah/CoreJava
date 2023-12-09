
public class Stringclass {

	public static void main(String[] args) {
		String str = " Java Programming";
		String str2 = "JavaTraining";
		System.out.println(str.charAt(4));
		// str.trim();
		System.out.println(str.concat(" Rahul Shetty").trim());
//		split
		String arr[] = str2.split("T");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
