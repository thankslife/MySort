
public class Sort_Quick {

	public static void sort(int[] a,int left,int right){
		if(left < right){
			int i = left;
			int j = right;
			int temp = a[left];
			while(i < j){
				while(i < j && a[j] >= temp){
					j--;
				}
				if(i < j)
					a[i++] = a[j];
				
				while(i < j && a[i] <= temp){
					i++;
				}
				if(i < j)
					a[j--] = a[i];
			}
			a[i] = temp;
			
			sort(a, left, i - 1);
			sort(a, i + 1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a = {2,1,4,6,3,5};
		sort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}