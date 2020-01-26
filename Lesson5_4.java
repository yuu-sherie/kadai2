import java.util.*;
public class Lesson5_4{
	public static void main(String[] args){
	int[] values=new int[10];
	int cnt=0; 
	int sum=0;
	while(cnt<10&&sum<=100){
		values[cnt]= new Scanner(System.in).nextInt();
		sum +=values[cnt++];
	}
	for(int i=0;i<cnt;i++)
	System.out.print(""+values[i]);
	}
}
