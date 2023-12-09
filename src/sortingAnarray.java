
public class sortingAnarray {

	public static void main(String[] args) {
//		swapping without using extra variable.
//		int a=1;
//		int b=2;
//		a=a+b;//3
//		b=a-b;//3-2=1
//		a=a-b;//2
//		System.out.println(a);
//		swapping using extra variable.
//		int a=1;
//		int b=2;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
		int a[] = { 2, 5, 3, 9, 6 };
		int temp;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				// swap
				if (a[i] > a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}
}
