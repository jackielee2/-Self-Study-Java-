package sector01.exam01;

public class Switch_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//*	주사위에서 번호 하나 뽑기..
		
		int num = (int)( Math.random() * 6 ) + 1;
		
		switch( num )
		{
			case 1:
				System.out.println("1번");
				break;				
				
			case 2:
				System.out.println("2번");
				break;				
				
			case 3:
				System.out.println("3번");
				break;				
				
			case 4:
				System.out.println("4번");
				break;				
				
			case 5:
				System.out.println("5번");
				break;
				
			default:
				System.out.println("6번");
				break;
				
		}
		

	}

}
