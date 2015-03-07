
public class Test3 {

	public static int ack(int m,int n)
	{
		if(m == 0)
			return n + 1;
		else if(n == 0)
			return ack(m-1,1);
		else
			return ack(m - 1 , ack(m , n - 1));
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(ack(3,12));
	}

}
