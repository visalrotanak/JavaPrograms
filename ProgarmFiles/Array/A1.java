import java.util.*;
class A1{
	public static void main(String[] args){
	/*	float[][] s = new float[3][2];
		Scanner s1 = new Scanner(System.in);

	for(int i=0;i<3;i++)
	{
		System.out.println("Enter marks of student : "+(i+1));
		for(int j=0;j<2;j++)
		{
			System.out.println("Subject : "+(j+1));
			s[i][j] = s1.nextFloat();
		}
	}
	for(int i=0;i<3;i++)
	{
		System.out.println("Student"+ (i+1));
		for(int j=0;j<2;j++)
		{
			System.out.println("Subject" +(j+1)+ ":" +s[i][j]);
		}
	}
	*/
		int[][] s = new int[2][4];
    s[0][0] = 2;
    s[0][1] = 5;
    s[0][2] = 7;
    s[0][3] = 4;
    s[1][0] = 9;
    s[1][1] = 3;
    s[1][2] = 2;
    s[1][3] = 8;
    System.out.println("Sum of the items produced in the first factory :");
    int sum1 = 0, sum2 = 0;
    for(int i = 0; i < 4; i++)
    {
      sum1 += s[0][i];
    }
    System.out.println(sum1);
    System.out.println("Sum of the items produced in the second factory :");
    for(int j = 0; j < 4; j++)
    {
      sum2 += s[1][j];
    }
    System.out.println(sum2);
	}
}
