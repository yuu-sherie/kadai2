public class Lesson6_5{
	public static void main(String[] args){
		DrawTriangle(3,'%');
		System.out.println();
		DrawTriangle(4,'#');
		System.out.println();
		DrawTriangle(5,'@');
		System.out.println();
	}
	static void DrawTriangle(int size, char ch){
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
