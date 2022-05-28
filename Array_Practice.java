import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
		
		Array_Practice ap=new Array_Practice();
		ap.getmarks();
		}

	private void getmarks() {
		int total=0;
		int percentage=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter No Of Subjects");
		int Count=SC.nextInt();
		int[]marks=new int[Count];
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println("Enter Marks ");
			marks[i] =SC.nextInt();
			total= total+marks[i];
			percentage=total/Count;
		}System.out.println(total);
		System.out.println(percentage);
		
	}}
