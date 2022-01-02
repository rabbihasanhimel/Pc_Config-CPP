import java.util.Scanner ;

class MainProgram
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter Your GPU Model: ") ;
		String gpu = sc.nextLine() ;
		System.out.println("Enter Your CPU Model: ") ;
		String cpu = sc.nextLine() ;
		System.out.println("Enter Your Motherboard Model: ") ;
		String mobo = sc.nextLine() ;
		System.out.println("Enter Your Disk Details: ") ;
		String disks = sc.nextLine() ;
		System.out.println("Enter Your Ram Size: ") ;
		String ram = sc.nextLine() ;

		
		pc o1 = new pc(gpu, cpu, mobo, disks, ram) ;
		o1.showInfo() ;
	}
}
