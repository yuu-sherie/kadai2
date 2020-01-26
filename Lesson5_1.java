import java.util.*;
public class Lesson5_1{
	public static void main(String[] args){
	int[] values=new int[10];
	for (int i=0;i<10;i++){
		values[i]=new Scanner(System.in).nextInt();
	}
	for (int n: values){
		System.out.println(n*2);
	}
	}

}
