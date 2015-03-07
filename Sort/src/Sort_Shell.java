/**
 * 希尔排序
 * @author Administrator
 *
 */
public class Sort_Shell {

	public static void sort(int[] a){
		for(int grp = a.length / 2; grp > 0; grp = grp / 2){
			for(int i = 0; i < grp; i++){
				for(int j = i + grp; j < a.length; j = j + grp){
					int temp = a[j];
					int k = j - grp;
					while(k >= 0 && a[k] > temp){
						a[k + grp] = a[k];
						k = k - grp;
					}
					a[k + grp] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a = {2,1,4,7,6};
		sort(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

	}

}