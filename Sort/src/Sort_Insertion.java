/**
 * ÷±Ω”≤Â»Î≈≈–Ú
 * @author Administrator
 *
 */
public class Sort_Insertion {

	public static void sort(int[] a){
		for(int i = 1; i < a.length; i++){
			int j = i - 1;
			int temp = a[i];
			while(j >= 0 && a[j] > temp){
				a[j + 1] = a [j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] a = {2,1,5,3,7};
		sort(a);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}