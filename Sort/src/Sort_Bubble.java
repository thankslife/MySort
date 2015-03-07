/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class Sort_Bubble {

	public static void sort(int[] a){
		for(int i = 0; i < a.length; i++){
			for(int j = a.length - 1; j >= 1; j--){
				if(a[j] < a[j - 1]){
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a = {2,1,5,3,6,4};
		sort(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}