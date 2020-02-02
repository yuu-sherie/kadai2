import java.util.*;
public class Lesson6_3{
	public static void main(String[] args){
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int z=new Scanner(System.in).nextInt();

		System.out.println(MaxValue(x,MaxValue(y,z)));
	}

static int MaxValue(int a ,int b){
	if(a>b)
		return a;
		else
			return b;
}
}
