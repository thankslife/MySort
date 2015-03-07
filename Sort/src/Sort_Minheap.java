/**
 * 最小堆排序
 * @author Administrator
 *
 */
public class Sort_Minheap {
	
	public static void MakeMinHeap(int[] a,int n){
		for(int i = n / 2 - 1; i >= 0; i--){
			minHeapFixDown(a, i, n);
		}
	}
	
	public static void minHeapFixDown(int[] a,int i,int n){
		int j = 2 * i + 1;
		int temp = a[i];
		while(j < n){
			if(j + 1 < n && a[j + 1] < a[j])
				j = j + 1;
			if(temp <= a[j])
				break;
			a[i] = a[j];
			i = j;
			j = i * 2 + 1;
			
		}
		a[i] = temp;
	}
	
	public static void sort(int[] a,int n){
		for(int i = n - 1; i >= 1; i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			minHeapFixDown(a, 0, i);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a = {2,1,5,4,3,6};
		MakeMinHeap(a,a.length);
		sort(a,a.length);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

	}
}