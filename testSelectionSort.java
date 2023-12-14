import org.junit.Test; 
import java.util.Arrays;

public class testSelectionSort {      
	SelectionSort sort = new SelectionSort();      
	@Test     
	public void testPositive(){         
		int[] arr = new int[]{8,9,7,10,2};         
		int[] res = new int[]{2,7,8,9,10};         
		sort.basicSelectionSort(arr);  
		System.out.println("Test Positive:");
        System.out.println("Actual   : " + Arrays.toString(arr));
        System.out.println("Expected : " + Arrays.toString(res));
		assert(Arrays.equals(arr,res));     
		}      
	@Test     
	public void testNegatives(){         
		int[] arr = new int[]{-8,-9,-7,-10,-2};         
		int[] res = new int[]{-10,-9,-8,-7,-2};         
		sort.basicSelectionSort(arr);  
		System.out.println("Test Negatives:");
        System.out.println("Actual   : " + Arrays.toString(arr));
        System.out.println("Expected : " + Arrays.toString(res));
		assert(Arrays.equals(arr,res));     
		}     
	@Test     
	public void testMixed(){         
		int[] arr = new int[]{-8,-9,7,-10,2,0};         
		int[] res = new int[]{-10,-9,-8,0,2,7};         
		sort.basicSelectionSort(arr); 
		System.out.println("Test Mixed:");
        System.out.println("Actual   : " + Arrays.toString(arr));
        System.out.println("Expected : " + Arrays.toString(res));
		assert(Arrays.equals(arr,res));     
		}      
	//branch1edit
	}