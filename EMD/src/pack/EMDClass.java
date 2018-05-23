package pack;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class EMDClass {
	private BufferedImage secretImage = null;
	private int[][] secretImagePixelMatrix;
	private BufferedImage coverImage = null;
	private int[][] coverImagePixelMatrix;
	
	private int[][] encryptedImagePixelMatrixBase5;
	private int [][] decryptedImagePixelMatrixBase5;
	private int decryptedImageRowCountBase5; 
	private int decryptedImageColumnCountBase5;
	
	private int[][] encryptedImagePixelMatrixBase7;
	private int [][] decryptedImagePixelMatrixBase7;
	private int decryptedImageRowCountBase7;
	private int decryptedImageColumnCountBase7;
	
	private int red,green,blue;
	private  static int a=0;
	private  static int k=0;
	public BufferedImage getSecretImage() {
		return secretImage;
	}
	public void setSecretImage(BufferedImage secretImage) {
		this.secretImage = secretImage;
	}
	public BufferedImage getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(BufferedImage coverImage) {
		this.coverImage = coverImage;
	}
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	public int[][] getSecretImagePixelMatrix() {
		return secretImagePixelMatrix;
	}
	public void setSecretImagePixelMatrix(int[][] secretImagePixelMatrix) {
		this.secretImagePixelMatrix = secretImagePixelMatrix;
	}
	public int[][] getCoverImagePixelMatrix() {
		return coverImagePixelMatrix;
	}
	public void setCoverImagePixelMatrix(int[][] coverImagePixelMatrix) {
		this.coverImagePixelMatrix = coverImagePixelMatrix;
	}
	public int[][] getEncryptedImagePixelMatrixBase5() {
		return encryptedImagePixelMatrixBase5;
	}
	public void setEncryptedImagePixelMatrixBase5(int[][] encryptedImagePixelMatrixBase5) {
		this.encryptedImagePixelMatrixBase5 = encryptedImagePixelMatrixBase5;
	}
	public int[][] getDecryptedImagePixelMatrixBase5() {
		return decryptedImagePixelMatrixBase5;
	}
	public void setDecryptedImagePixelMatrixBase5(int[][] decryptedImagePixelMatrixBase5) {
		this.decryptedImagePixelMatrixBase5 = decryptedImagePixelMatrixBase5;
	}
	public int getDecryptedImageRowCountBase5() {
		return decryptedImageRowCountBase5;
	}
	public void setDecryptedImageRowCountBase5(int decryptedImageRowCountBase5) {
		this.decryptedImageRowCountBase5 = decryptedImageRowCountBase5;
	}
	public int getDecryptedImageColumnCountBase5() {
		return decryptedImageColumnCountBase5;
	}
	public void setDecryptedImageColumnCountBase5(int decryptedImageColumnCountBase5) {
		this.decryptedImageColumnCountBase5 = decryptedImageColumnCountBase5;
	}
	public int[][] getEncryptedImagePixelMatrixBase7() {
		return encryptedImagePixelMatrixBase7;
	}
	public void setEncryptedImagePixelMatrixBase7(int[][] encryptedImagePixelMatrixBase7) {
		this.encryptedImagePixelMatrixBase7 = encryptedImagePixelMatrixBase7;
	}
	public int[][] getDecryptedImagePixelMatrixBase7() {
		return decryptedImagePixelMatrixBase7;
	}
	public void setDecryptedImagePixelMatrixBase7(int[][] decryptedImagePixelMatrixBase7) {
		this.decryptedImagePixelMatrixBase7 = decryptedImagePixelMatrixBase7;
	}
	public int getDecryptedImageRowCountBase7() {
		return decryptedImageRowCountBase7;
	}
	public void setDecryptedImageRowCountBase7(int decryptedImageRowCountBase7) {
		this.decryptedImageRowCountBase7 = decryptedImageRowCountBase7;
	}
	public int getDecryptedImageColumnCountBase7() {
		return decryptedImageColumnCountBase7;
	}
	public void setDecryptedImageColumnCountBase7(int decryptedImageColumnCountBase7) {
		this.decryptedImageColumnCountBase7 = decryptedImageColumnCountBase7;
	}
	public EMDClass() {
		super();
	}
	public EMDClass(String secretDirectory,String coverDirectory) throws IOException {
		super();
		secretImage = ImageIO.read(new File(secretDirectory));   
		coverImage = ImageIO.read(new File(coverDirectory));  
	}
	public void secretImagePixelMatrixHandle() {
		int w=0;
		secretImagePixelMatrix= new int [secretImage.getHeight()][secretImage.getWidth() * 3];
		for(int i=0; i < secretImage.getHeight(); i++){	
			for(int j=0; j < secretImage.getWidth(); j++)
			{
				red = new Color(secretImage.getRGB(j, i)).getRed();				
				green = new Color(secretImage.getRGB(j, i)).getGreen();
				blue = new Color(secretImage.getRGB(j, i)).getBlue();
				secretImagePixelMatrix[i][w]=red;
				secretImagePixelMatrix[i][w+1]=green;
				secretImagePixelMatrix[i][w+2]=blue;
				w+=3;
			}
			w=0;
		}
		/*
		System.out.println("Secret Image Pixel Values");
		for(int i=0; i < secretImage.getHeight(); i++){	
			for(int j=0; j < secretImage.getWidth()*3; j++)
			{
				System.out.print(secretImagePixelMatrix[i][j]+" ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			System.out.print("\n");
		}
		*/
		/*
		System.out.println("\nSecret Image Base5 Values");
		for(int i=0; i < secretImage.getHeight(); i++){	
			for(int j=0; j < secretImage.getWidth()*3; j++){
				System.out.print(beslikTabanaDonustur(secretImagePixelMatrix[i][j]) + " ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			System.out.print("\n");
		}
		*/
		/*
		System.out.println("\nSecret Image Base7 Values");
		for(int i=0; i < secretImage.getHeight(); i++){	
			for(int j=0; j < secretImage.getWidth()*3; j++){
				System.out.print(yedilikTabanaDonustur(secretImagePixelMatrix[i][j]) + " ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			System.out.print("\n");
		}
		*/
	}
		
	public void coverImagePixelMatrixHandle() {
		int w=0;
		coverImagePixelMatrix= new int [coverImage.getHeight()][coverImage.getWidth() * 3];
		for(int i=0; i < coverImage.getHeight(); i++)
		{	
			for(int j=0; j < coverImage.getWidth(); j++)
			{
				red = new Color(coverImage.getRGB(j, i)).getRed();				
				green = new Color(coverImage.getRGB(j, i)).getGreen();
				blue = new Color(coverImage.getRGB(j, i)).getBlue();
				coverImagePixelMatrix[i][w]=red;
				coverImagePixelMatrix[i][w+1]=green;
				coverImagePixelMatrix[i][w+2]=blue;
				w+=3;
			}
			w=0;
		}
		/*
		System.out.println("\nCover Image Pixel Values");
		for(int i=0; i < coverImage.getHeight(); i++)
		{	
			for(int j=0; j < coverImage.getWidth()*3; j++)
			{
				System.out.print(coverImagePixelMatrix[i][j]+" ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			System.out.print("\n");
		}
		*/
	}

	public String convertToBase5(int digit) {
		int[] array=new int[4];
		for(int j=0;j<4;j++)
			array[j]=0;
		
		int i=3;
		while((digit)>=1) {
			array[i]=digit%5;
			i--;
			digit/=5;
		}
		String text = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		return text;
			
	}
	
	public String convertToBase5ForSizeInfo(int digit) {                //forSize = Size information is embedded in the cover image. 
		int[] array=new int[5];
		for(int j=0;j<5;j++)
			array[j]=0;
		
		int i=4;
		while((digit)>=1) {
			array[i]=digit%5;
			i--;
			digit/=5;
		}
		String text = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
	return text;
	}
	
	public int convertBase5ToBase10ForPixel(int []array) { 
		int result;
		result=array[3]+5*array[2]+25*array[1]+125*array[0];
		return result;
	}
	
	public int convertBase5ToBase10ForSizeInfo(int []array) {            //forSize = Size information is embedded in the cover image. 
		int result;
		result=array[4]+5*array[3]+25*array[2]+125*array[1]+625*array[0];
		return result;
	}
	
	public void encryptBase5Method(int coverPixelModValue,byte index) {
		coverPixelModValue=(encryptedImagePixelMatrixBase5[a][k]+ 2*encryptedImagePixelMatrixBase5[a][k+1]) % 5;              		   //a=0 , k=0   global variable 
		int difference=index-coverPixelModValue;
	
		if(difference==1 || difference==-4) {
			if(encryptedImagePixelMatrixBase5[a][k] !=255) {																		//x!=255
				encryptedImagePixelMatrixBase5[a][k]++;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
					
			}else if(encryptedImagePixelMatrixBase5[a][k] == 255  && encryptedImagePixelMatrixBase5[a][k+1] != 255) {                      //x=255  y!=255
				encryptedImagePixelMatrixBase5[a][k]--;
				encryptedImagePixelMatrixBase5[a][k+1]++;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k] == 255  && encryptedImagePixelMatrixBase5[a][k+1] == 255) {                      //x=255  y==255
				encryptedImagePixelMatrixBase5[a][k+1]-=2;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==2 || difference==-3) {
			if(encryptedImagePixelMatrixBase5[a][k+1] !=255) {																		//y!=255
				encryptedImagePixelMatrixBase5[a][k+1]++;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k] !=0 && coverImagePixelMatrix[a][k+1] ==255) {						//x!=255 y=255
				encryptedImagePixelMatrixBase5[a][k]--;
				encryptedImagePixelMatrixBase5[a][k+1]--;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k] == 0 && encryptedImagePixelMatrixBase5[a][k+1] ==255) {						//x!=255 y=255
				encryptedImagePixelMatrixBase5[a][k]+=2;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==3 || difference==-2) {
			if(encryptedImagePixelMatrixBase5[a][k+1]!=0) {																//y!=0
				encryptedImagePixelMatrixBase5[a][k+1]--;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k+1] ==0 && encryptedImagePixelMatrixBase5[a][k]!=255) {							//x!=255 y!=255
				encryptedImagePixelMatrixBase5[a][k]++;
				encryptedImagePixelMatrixBase5[a][k+1]++;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
					
			}else if(encryptedImagePixelMatrixBase5[a][k+1] == 0 && encryptedImagePixelMatrixBase5[a][k]==255) {							//x=255 y!=255            ////eklendi
				encryptedImagePixelMatrixBase5[a][k]-=2;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==4 || difference==-1) {
			if(encryptedImagePixelMatrixBase5[a][k] !=0 ) {																			//x!=0 ise xi 1 azalt
				encryptedImagePixelMatrixBase5[a][k]--;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k] ==0 && encryptedImagePixelMatrixBase5[a][k+1] !=0) {								//x=0  y!=0
				encryptedImagePixelMatrixBase5[a][k]++;
				encryptedImagePixelMatrixBase5[a][k+1]--;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase5[a][k] ==0 && encryptedImagePixelMatrixBase5[a][k+1] ==0) {								//x=0  y=0
				encryptedImagePixelMatrixBase5[a][k+1]+=2;
				k+=2;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==0) {
			k+=2;
			if(k==(3*(coverImage.getWidth()))) {
				k=0;
				a++;
			}
		}
	}
	public void encryptBase5(){										
		if((secretImage.getHeight()*secretImage.getWidth()*8 < (coverImage.getHeight()*coverImage.getWidth()))) {
			String secretImage4Bit;
			String secretImage5BitForSize;         				 //forSize = Size information is embedded in the cover image. 
			int coverPixelModValue=0;
			byte []arraySize=new byte[5];
			byte []arrayPixel=new byte[4];
			byte firstBit,secondBit,thirdBit,fourthBit,fifthBit;
			
			//create encryption pixel matrix in base 5
			encryptedImagePixelMatrixBase5= new int [coverImage.getHeight()][coverImage.getWidth() * 3];
			int counter=0;
			for(int i=0; i < coverImage.getHeight(); i++)
			{	
				for(int j=0; j < coverImage.getWidth(); j++)
				{
					
					encryptedImagePixelMatrixBase5[i][counter]=coverImagePixelMatrix[i][counter];
					encryptedImagePixelMatrixBase5[i][counter+1]=coverImagePixelMatrix[i][counter+1];
					encryptedImagePixelMatrixBase5[i][counter+2]=coverImagePixelMatrix[i][counter+2];
					counter+=3;
				}
				counter=0;
			}
			
			//Encrypt for Size Info to Cover Image
			for(int i=0; i < 1; i++)
			{	
				for(int j=0; j <2; j++)                
				{																
					if(k<10 ) {                        				               
						secretImage5BitForSize=convertToBase5ForSizeInfo(secretImage.getHeight()); 
						firstBit = Byte.parseByte(secretImage5BitForSize.substring(0,1));                     
					    secondBit = Byte.parseByte(secretImage5BitForSize.substring(1,2));
						thirdBit = Byte.parseByte(secretImage5BitForSize.substring(2,3));
						fourthBit = Byte.parseByte(secretImage5BitForSize.substring(3,4));
						fifthBit = Byte.parseByte(secretImage5BitForSize.substring(4,5));
						arraySize[0]=firstBit;arraySize[1]=secondBit;arraySize[2]=thirdBit;arraySize[3]=fourthBit;arraySize[4]=fifthBit;
						
					}else if(k<20) {
						secretImage5BitForSize=convertToBase5ForSizeInfo(secretImage.getWidth());
						firstBit = Byte.parseByte(secretImage5BitForSize.substring(0,1));                      
						secondBit = Byte.parseByte(secretImage5BitForSize.substring(1,2));
						thirdBit = Byte.parseByte(secretImage5BitForSize.substring(2,3));
						fourthBit = Byte.parseByte(secretImage5BitForSize.substring(3,4));
						fifthBit = Byte.parseByte(secretImage5BitForSize.substring(4,5));
						arraySize[0]=firstBit;arraySize[1]=secondBit;arraySize[2]=thirdBit;arraySize[3]=fourthBit;arraySize[4]=fifthBit;
						
					}
					
						for(int l=0;l<5;l++) {
							
							encryptBase5Method(coverPixelModValue,arraySize[l]);
						}
				}
				
			}
			
			//Encrypt for Pixel to Cover Image
			for(int i=0; i < secretImage.getHeight(); i++)
			{	
				for(int j=0; j < secretImage.getWidth()*3; j++)                 
				{																
					secretImage4Bit=convertToBase5(secretImagePixelMatrix[i][j]); 
					firstBit = Byte.parseByte(secretImage4Bit.substring(0,1));                      
					secondBit = Byte.parseByte(secretImage4Bit.substring(1,2));
					thirdBit = Byte.parseByte(secretImage4Bit.substring(2,3));
					fourthBit = Byte.parseByte(secretImage4Bit.substring(3,4));
					arrayPixel[0]=firstBit;arrayPixel[1]=secondBit;arrayPixel[2]=thirdBit;arrayPixel[3]=fourthBit;
				
					for(int l=0;l<4;l++) {
						
						encryptBase5Method(coverPixelModValue,arrayPixel[l]);
					}
				}
				
			}
			/*
			System.out.println("\nEncrypted Cover Image Pixel Values");
			for(int i=0; i < coverImage.getHeight(); i++)
			{	
				for(int j=0; j < coverImage.getWidth()*3; j++)
				{
					System.out.print(encryptedImagePixelMatrixBase5[i][j]+" ");
					if((j+1)%3==0)
						System.out.print("\t");
				}
				System.out.print("\n");
			
			}
			*/
			
		}
		else
		{
			System.err.println("Encryption failed. Secret image size must be smaller than current size.");
			System.exit(0);
		}
		a=0;k=0;
	}
	
	//.bmp extension picture make method
	public BufferedImage pixelMatrixToBufferedImage(int[][]matrix) {                                             				
		BufferedImage picture=new BufferedImage(matrix[0].length/3, matrix.length,BufferedImage.TYPE_INT_RGB);
		for(int x=0;x<matrix.length;x++)
			for(int y=0;y<matrix[0].length;y+=3) {
				Color color = new Color(matrix[x][y],matrix[x][y+1],matrix[x][y+2]);
				picture.setRGB(y/3, x, color.getRGB());
			}
		return picture;
	}

	public void encryptedImageCreateBase5() {
		BufferedImage encryptedImage;
		encryptedImage=pixelMatrixToBufferedImage(coverImagePixelMatrix);
		File output = new File("D:\\encryptedImage5.bmp");
		try {
			ImageIO.write(encryptedImage, "bmp", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void decryptionBase5() {
		int a=0,k=20,b=0,c=0,m=0,n=0;
		int [] arraySize=new int [5];
		int [] arrayPixel=new int [4];
		int []rowColumnData=new int [2];
		
		//boyutu deþifrele
		for(int i=0; i < 1; i++)
		{	
			for(int j=0; j < 2; j++)
			{
				for(int l=0;l<5;l++) {
					
					arraySize[l]=(encryptedImagePixelMatrixBase5[a][c]+ 2*encryptedImagePixelMatrixBase5[a][c+1]) % 5;
					c+=2;
				}
				rowColumnData[b]=convertBase5ToBase10ForSizeInfo(arraySize);
				b++;
			}
		}
		
		decryptedImageRowCountBase5=rowColumnData[0];
		decryptedImageColumnCountBase5=rowColumnData[1];
		decryptedImagePixelMatrixBase5=new int [rowColumnData[0]][rowColumnData[1]*3];
		
		//Decryption pixel
		for(int i=0; i < rowColumnData[0]; i++)
		{	
			for(int j=0; j < rowColumnData[1]*3; j++)
			{
				for(int l=0;l<4;l++) {
					arrayPixel[l]=(encryptedImagePixelMatrixBase5[a][k]+ 2*encryptedImagePixelMatrixBase5[a][k+1]) % 5;
					k+=2;
					if(k==(3*(coverImage.getWidth()))) {
						k=0;
						a++;
					}
				}
				
				//System.out.print(dizi[0]+" "+dizi[1]+" " +dizi[2]+" "+dizi[3]+"\n");
				decryptedImagePixelMatrixBase5[m][n]=convertBase5ToBase10ForPixel(arrayPixel);
				n++;
				if(n==rowColumnData[1]*3) {
					n=0;
					m++;
				}
			}
		}
	}
	
	public void printDecrypedImagePixelsBase5() {
		System.out.println("\nSecret Image Piksel Degerleri");
		
		for(int i=0; i < decryptedImageRowCountBase5; i++)
		{	
			for(int j=0; j < decryptedImageColumnCountBase5*3; j++)
			{
				System.out.print(decryptedImagePixelMatrixBase5[i][j]+" ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	public void DecryptionImageCreateBase5() {
		BufferedImage decryptedImage;
		decryptedImage=pixelMatrixToBufferedImage(decryptedImagePixelMatrixBase5);
		File output = new File("D:\\decryptedImage5.bmp");
		try {
			ImageIO.write(decryptedImage, "bmp", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void calculatePsnrForBase5() {
		double MSE 	= 0, temp = 0, PSNR = 0; 
		int m 		= encryptedImagePixelMatrixBase5.length;        
		int n 		= encryptedImagePixelMatrixBase5[0].length;          
		
		for (int i = 0; i < m-1; i++) {
			for(int j = 0; j < n-1; j++) {
				temp = encryptedImagePixelMatrixBase5[i][j] - coverImagePixelMatrix[i][j];
				MSE += temp * temp;
			}
		}
		MSE = MSE / (m * n * 3); // Because of RGB
		PSNR = (20 * Math.log10(255)) - ( 10 * Math.log10(MSE));
		System.out.printf("PSNR Value for Base 5 : %.3f\n",PSNR);
	}

	//Base5 is over
	
	/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//Base7 begins
	
	public String convertToBase7(int digit) {
		int[] array=new int[3];
		for(int j=0;j<3;j++)
			array[j]=0;
		
		int i=2;
		while((digit)>=1) {
			array[i]=digit%7;
			i--;
			digit/=7;
		}
		String text = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		return text;
	}
	
	public String convertToBase7ForSizeInfo(int digit) {
		int[] array=new int[4];
		for(int j=0;j<4;j++)
			array[j]=0;
		
		int i=3;
		while((digit)>=1) {
			array[i]=digit%7;
			i--;
			digit/=7;
		}
		String text = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		return text;
	}
	
	public int convertBase7ToBase10ForPixel(int []array) { 
		int result;
		result=array[2]+7*array[1]+49*array[0];
		return result;
	}
	
	public int convertBase7ToBase10ForSize(int []array) {
		int result;
		result=array[3]+7*array[2]+49*array[1]+343*array[0];
		return result;
	}
	
	public void encryptBase7Method(int coverPixelModValue,byte index) {
		coverPixelModValue=(encryptedImagePixelMatrixBase7[a][k]+ 2*encryptedImagePixelMatrixBase7[a][k+1]+ 3*encryptedImagePixelMatrixBase7[a][k+2]) % 7;
		int difference=index-coverPixelModValue;
	
		if(difference==1 || difference ==-6) {
			if(encryptedImagePixelMatrixBase7[a][k] !=255) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] == 255  && encryptedImagePixelMatrixBase7[a][k+1] != 255) {                    
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+1]++;
			k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] == 255  && encryptedImagePixelMatrixBase7[a][k+1] == 255 && encryptedImagePixelMatrixBase7[a][k+2] != 255) {                      
				encryptedImagePixelMatrixBase7[a][k+1]--;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] == 255  && encryptedImagePixelMatrixBase7[a][k+1] == 255  && encryptedImagePixelMatrixBase7[a][k+2] == 255) {                      
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+1]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==2 || difference==-5) {
			if(encryptedImagePixelMatrixBase7[a][k+1] !=255) {																		
				encryptedImagePixelMatrixBase7[a][k+1]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] !=0 && encryptedImagePixelMatrixBase7[a][k+1] ==255 && encryptedImagePixelMatrixBase7[a][k+2]!=255) {						
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] == 0 && encryptedImagePixelMatrixBase7[a][k+1] ==255 && encryptedImagePixelMatrixBase7[a][k+2] !=0) {						
				encryptedImagePixelMatrixBase7[a][k+1]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] !=0 && encryptedImagePixelMatrixBase7[a][k+1] ==255 && encryptedImagePixelMatrixBase7[a][k+2]==255) {				
				encryptedImagePixelMatrixBase7[a][k+1]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==3 || difference==-4) {
			if(encryptedImagePixelMatrixBase7[a][k+2] !=255) {																		
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] ==255 && encryptedImagePixelMatrixBase7[a][k] !=255 && encryptedImagePixelMatrixBase7[a][k+1]!=255) {							
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+1]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {																
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] ==255 && encryptedImagePixelMatrixBase7[a][k] ==255 && encryptedImagePixelMatrixBase7[a][k+1]!=255) {						
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] ==255 && encryptedImagePixelMatrixBase7[a][k+1] ==255 && encryptedImagePixelMatrixBase7[a][k] !=0) {						
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] ==255 && encryptedImagePixelMatrixBase7[a][k+1] ==255 && encryptedImagePixelMatrixBase7[a][k] ==0) {						
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+1]--;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==4 || difference==-3) {
			if(encryptedImagePixelMatrixBase7[a][k+2] !=0 ) {																		
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] == 0 && encryptedImagePixelMatrixBase7[a][k] != 255) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+2] == 0 && encryptedImagePixelMatrixBase7[a][k] == 255 && encryptedImagePixelMatrixBase7[a][k+1] != 0) {																	
				encryptedImagePixelMatrixBase7[a][k]--;
				encryptedImagePixelMatrixBase7[a][k+1]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==5 || difference==-2) {
			if(encryptedImagePixelMatrixBase7[a][k+1] !=0 ) {																		
				encryptedImagePixelMatrixBase7[a][k+1]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+1] == 0 && encryptedImagePixelMatrixBase7[a][k] != 255 && encryptedImagePixelMatrixBase7[a][k+2] != 0) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+1] == 0 && encryptedImagePixelMatrixBase7[a][k] == 255 && encryptedImagePixelMatrixBase7[a][k+2] != 255) {	 																	
				encryptedImagePixelMatrixBase7[a][k+1]++;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k+1] == 0 && encryptedImagePixelMatrixBase7[a][k+2] == 0 ) {																		
				encryptedImagePixelMatrixBase7[a][k+1]++;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
		
		else if(difference==6 || difference==-1) {
			if(encryptedImagePixelMatrixBase7[a][k] !=0 ) {																		
				encryptedImagePixelMatrixBase7[a][k]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] ==0 && encryptedImagePixelMatrixBase7[a][k+1] !=255 && encryptedImagePixelMatrixBase7[a][k+2] !=0) {																		
				encryptedImagePixelMatrixBase7[a][k+1]++;
				encryptedImagePixelMatrixBase7[a][k+2]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] ==0 && encryptedImagePixelMatrixBase7[a][k+1] ==255 ) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+1]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] ==0 && encryptedImagePixelMatrixBase7[a][k+1] !=0 && encryptedImagePixelMatrixBase7[a][k+2] ==0 ) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+1]--;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}else if(encryptedImagePixelMatrixBase7[a][k] ==0 && encryptedImagePixelMatrixBase7[a][k+1] ==0 && encryptedImagePixelMatrixBase7[a][k+2] ==0 ) {																		
				encryptedImagePixelMatrixBase7[a][k]++;
				encryptedImagePixelMatrixBase7[a][k+1]++;
				encryptedImagePixelMatrixBase7[a][k+2]++;
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
			else {
				k+=3;
				if(k==(3*(coverImage.getWidth()))) {
					k=0;
					a++;
				}
			}
		}
	
		else if(difference==0) {
			k+=3;
			if(k==(3*(coverImage.getWidth()))) {
				k=0;
				a++;
			}
		}
	}
	
	public void encryptBase7(){
		if((secretImage.getHeight()*secretImage.getWidth()*9 <= (coverImage.getHeight()*coverImage.getWidth()))) {
			String secretImage3Bit;
			String secretImageSize4Bit;
			int coverPixelModValue=0;
			byte []arrayPixel=new byte[3];
			byte []diziBoyut=new byte[4];
			byte firstBit,secondBit,thirdBit,fourthBit;
			
			encryptedImagePixelMatrixBase7= new int [coverImage.getHeight()][coverImage.getWidth() * 3];
			int counter=0;
			for(int i=0; i < coverImage.getHeight(); i++)
			{	
				for(int j=0; j < coverImage.getWidth(); j++)
				{
					
					encryptedImagePixelMatrixBase7[i][counter]=coverImagePixelMatrix[i][counter];
					encryptedImagePixelMatrixBase7[i][counter+1]=coverImagePixelMatrix[i][counter+1];
					encryptedImagePixelMatrixBase7[i][counter+2]=coverImagePixelMatrix[i][counter+2];
					counter+=3;
				}
				counter=0;
			}
			
			//Encryption Size Data
			for(int i=0; i < 1; i++)
			{	
				for(int j=0; j <2; j++)                
				{																
					if(k<12 ) {    
						secretImageSize4Bit=convertToBase7ForSizeInfo(secretImage.getHeight());
						firstBit = Byte.parseByte(secretImageSize4Bit.substring(0,1));                     
						secondBit = Byte.parseByte(secretImageSize4Bit.substring(1,2));
						thirdBit = Byte.parseByte(secretImageSize4Bit.substring(2,3));
						fourthBit = Byte.parseByte(secretImageSize4Bit.substring(3,4));
						diziBoyut[0]=firstBit;diziBoyut[1]=secondBit;diziBoyut[2]=thirdBit;diziBoyut[3]=fourthBit;
						
					}else if(k<24) {
						secretImageSize4Bit=convertToBase7ForSizeInfo(secretImage.getWidth());
						firstBit = Byte.parseByte(secretImageSize4Bit.substring(0,1));                      
						secondBit = Byte.parseByte(secretImageSize4Bit.substring(1,2));
						thirdBit = Byte.parseByte(secretImageSize4Bit.substring(2,3));
						fourthBit = Byte.parseByte(secretImageSize4Bit.substring(3,4));
						diziBoyut[0]=firstBit;diziBoyut[1]=secondBit;diziBoyut[2]=thirdBit;diziBoyut[3]=fourthBit;
					}
					
					
						for(int l=0;l<4;l++) {
							encryptBase7Method(coverPixelModValue,diziBoyut[l]);
						}
				}
				
			}
			
			
			//Encryption Pixel Values
			for(int i=0; i < secretImage.getHeight(); i++)
			{	
				for(int j=0; j < secretImage.getWidth()*3; j++)                
				{																
					secretImage3Bit=convertToBase7(secretImagePixelMatrix[i][j]);
					firstBit = Byte.parseByte(secretImage3Bit.substring(0,1));                      
					secondBit = Byte.parseByte(secretImage3Bit.substring(1,2));
					thirdBit = Byte.parseByte(secretImage3Bit.substring(2,3));
					arrayPixel[0]=firstBit;arrayPixel[1]=secondBit;arrayPixel[2]=thirdBit;
					
					for(int l=0;l<3;l++) {
						encryptBase7Method(coverPixelModValue, arrayPixel[l]);
					}
				}
				
			}
			
			/*
			System.out.println("\nEncrypted Cover Image Pixel Values");
			for(int i=0; i < coverImage.getHeight(); i++){	
				for(int j=0; j < coverImage.getWidth()*3; j++){
					System.out.print(encryptedImagePixelMatrixBase7[i][j]+" ");
					if((j+1)%3==0)
						System.out.print("\t");
				}
				System.out.print("\n");
			}
			*/
			
		}
		else
		{
			System.err.println("Encryption failed. Secret image size must be smaller than current size.");
			System.exit(0);
		}
	}
	
	public void encryptedImageCreateBase7() {
		BufferedImage encryptedImage;
		encryptedImage=pixelMatrixToBufferedImage(coverImagePixelMatrix); 
		File output = new File("D:\\encryptedImage7.bmp");
		try {
			ImageIO.write(encryptedImage, "bmp", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void decryptionBase7(){
		int a=0,k=24,b=0,c=0,m=0,n=0;
		int [] arrayPixel=new int [3];
		int [] arraySize=new int [4];
		int [] rowColumn=new int [2];
		
		//Decryption Size Data
		for(int i=0; i < 1; i++)
		{	
			for(int j=0; j < 2; j++)
			{
				for(int l=0;l<4;l++) {
					arraySize[l]=(encryptedImagePixelMatrixBase7[a][c]+ 2*encryptedImagePixelMatrixBase7[a][c+1]+ 3*encryptedImagePixelMatrixBase7[a][c+2]) % 7;
					c+=3;
				}
				
				rowColumn[b]=convertBase7ToBase10ForSize(arraySize);
				b++;
			}
		}
		decryptedImageRowCountBase7=rowColumn[0];
		decryptedImageColumnCountBase7=rowColumn[1];
		decryptedImagePixelMatrixBase7=new int [rowColumn[0]][rowColumn[1]*3];
		
		//Decryption Pixel Values
		for(int i=0; i < rowColumn[0]; i++)
		{	
			for(int j=0; j < rowColumn[1]*3; j++)
			{
				for(int l=0;l<3;l++) {
					arrayPixel[l]=(encryptedImagePixelMatrixBase7[a][k]+ 2*encryptedImagePixelMatrixBase7[a][k+1]+ 3*encryptedImagePixelMatrixBase7[a][k+2]) % 7;
					k+=3;
					if(k==(3*(coverImage.getWidth()))) {        
						k=0;
						a++;
					}
				}
				
				decryptedImagePixelMatrixBase7[m][n]=convertBase7ToBase10ForPixel(arrayPixel);
				n++;
				if(n==rowColumn[1]*3) {
					n=0;
					m++;
				}
			}
		}
	}
	
	public void printDecrypedImagePixelsBase7() {
		System.out.println("\nSecret Image Pixel Degerleri");
		
		for(int i=0; i < decryptedImageRowCountBase7; i++)
		{	
			for(int j=0; j < decryptedImageColumnCountBase7*3; j++)
			{
				System.out.print(decryptedImagePixelMatrixBase7[i][j]+" ");
				if((j+1)%3==0)
					System.out.print("\t");
				
			}
			System.out.print("\n");
		}
	}
	
	public void DecryptionImageCreateBase7() {
		BufferedImage decryptedImage;
		decryptedImage=pixelMatrixToBufferedImage(decryptedImagePixelMatrixBase7); 
		File output = new File("D:\\decryptedImage7.bmp");
		try {
			ImageIO.write(decryptedImage, "bmp", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void calculatePsnrForBase7() {
		double MSE 	= 0, temp = 0, PSNR = 0; 
		int m 		= encryptedImagePixelMatrixBase7.length;        
		int n 		= encryptedImagePixelMatrixBase7[0].length;          
		
		for (int i = 0; i < m-1; i++) {
			for(int j = 0; j < n-1; j++) {
				temp = encryptedImagePixelMatrixBase7[i][j] - coverImagePixelMatrix[i][j];
				MSE += temp * temp;
			}
		}
		MSE = MSE / (m * n * 3); // Because of RGB
		PSNR = (20 * Math.log10(255)) - ( 10 * Math.log10(MSE));
		System.out.printf("PSNR Value for Base 7 : %.3f\n",PSNR);
	}
	
	//Base 7 is over
	/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
}

