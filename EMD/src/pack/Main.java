package pack;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter the address of the secret image :");//D:\\resim500.jpg
		Scanner in1 = new Scanner(System.in);
		String encryptImageDirectory = in1.next() ;
		
		System.out.print("Enter the address of the cover image :");//D:\\resim501.jpg
		Scanner in2 = new Scanner(System.in);
		String coverImageDirectory=in2.next();
		
		System.out.print("Press 5 to encrypt base 5 or Press 7 to encrypt base 7 :");
		Scanner in3 = new Scanner(System.in);
		int choose = in3.nextInt();
		if(choose==5) {
			EMDClass emdObject=new EMDClass(encryptImageDirectory,coverImageDirectory);
			emdObject.secretImagePixelMatrixHandle();
			emdObject.coverImagePixelMatrixHandle();
			emdObject.encryptBase5();
			emdObject.encryptedImageCreateBase5();
			emdObject.decryptionBase5();
			////emdObject.printDecrypedImagePixelsBase5();
			emdObject.DecryptionImageCreateBase5();
			emdObject.calculatePsnrForBase5();
		}
		else if(choose==7) {
			EMDClass emdObject=new EMDClass(encryptImageDirectory,coverImageDirectory);
			emdObject.secretImagePixelMatrixHandle();
			emdObject.coverImagePixelMatrixHandle();
			emdObject.encryptBase7();
			emdObject.encryptedImageCreateBase7();
			emdObject.decryptionBase7();
			//emdObject.printDecrypedImagePixelsBase7();
			emdObject.DecryptionImageCreateBase7();
			emdObject.calculatePsnrForBase7();
		}
		else {
			System.out.println("You made the wrong choice.");
		}
		
		//NOTE:
		//EncryptedImage and DecryptedImage will be created in D:\\     (D Directory) 
		
	}
}
