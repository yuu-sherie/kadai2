public class Lesson6_6{
public static void main(String[] args){
	for(int i=1;i<=9;i++){
			kukuColumn(i);
		}
}
static void kukuColumn(int num){
	for(int i=1;i<=9;i++){
		System.out.printf("%d",num*i);
	}
	System.out.println();
}
}
