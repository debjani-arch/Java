/*public class Test{
    public static void main (String[]args){
      int a = 2;
      int b = +2;
      int c = -2;
  
     // int sum = a+b;
     // int diff = a-b;
      //int mul = a*b;
  
      System.out.println(a++);
      System.out.println(b++);
      System.out.println(a--);
      System.out.println(c++);
      
      
      
    }
  }(Examples)*/

 /*  public class Test{
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int diff = a-b;
        
        System.out.println(diff);
    }
        }(Crio Prob 1 and 2 solved)*/




//(3)cHECK TWO INT ARE EQUAL IN JAVA OR NOT
//WILL USE ARITHMETIC OPERATOR

/*import java.util.*;
public class Test{
    public static void main(String[] args) {
        int fisrtNum = 11;
        int secondNum = 10;

        if((fisrtNum - secondNum)== 0)
        System.out.println("All Nums are Equal");
        else
        System.out.println("Not Equal");


    }


}*/
//comparison operators
/*import java.util.*;
public class Test{
    public static void main(String[] args) {
        int fisrtNum = 101;
        int secondNum = 1001;

        if((fisrtNum == secondNum))
        System.out.println("All Nums are Equal");
        else
        System.out.println("Not Equal");


    }


}*/ 

//String Functions

/*import java.io.*;
class Test{
    public static void main(String[]args){
        String firstNum = 10 +"";
        String secondNum = 16 + "";
        if(firstNum.compareTo (secondNum)==0)
        System.out.println("Numbers are eual");

        else{
            System.out.println("Not equal");
        }
    }
} */

/*import java.util.*;
public class Test{
    public static void main(String[] args) {
        String firstNum = 1 + "";
        String secondNum = 2 + "";

            if (firstNum.compareTo(secondNum) ==0 )
                        System.out.println("All true");
                        else{
                            System.out.println("All false");
                        }
                          }
    }*/

//XOR OPERATIONS

/*public class Test{
    public static void main(String[] args) {
        int firstNum = 101;
        int secondNum = 101;
        if ((firstNum ^ secondNum) == 0)
        System.out.println("Nums are equal");
        else{
            System.out.println("Not eual");
        }
    }
}/* */
//Complement and Bit wise Operator

/*import java.util.*;
public class Test{
    public static void main(String[] args) {
        int firstNum = 109;
        int secondNum = 180;

        if ((firstNum & ~secondNum)==0
        
       && ((~firstNum & secondNum)==0))
        System.out.println("nums eual");
        else{
            System.out.println("Not equal");
        }

    }

} */

// Java to Print Semicolon Without using a Semicolon

// using if-statement

/*import java.util.*;
public class Test{
    public static void main(String[] args) {
        //ASCII val. for semicolon is 59

        if(System.out.printf("%C", 59) == null){

        }
            
    }
}/* */


// Java program to find 4 elements
// with given sum
import java.util.*;
class Test{

// The following structure is needed
// to store pair sums in aux[]
static class pairSum {

	// Index (int A[]) of first element in pair
	public int first;

	// Index of second element in pair
	public int sec;

	// Sum of the pair
	public int sum;
}

// Function to check if two given pairs
// have any common element or not
static boolean noCommon(pairSum a, pairSum b)
{
	if (a.first == b.first || a.first == b.sec
		|| a.sec == b.first || a.sec == b.sec)
	return false;

	return true;
}

// The function finds four
// elements with given sum X
static void findFourElements(int[] myArr, int sum)
{
	int i, j;
	int length = myArr.length;

	// Create an auxiliary array to
	// store all pair sums
	int size = (length * (length - 1)) / 2;
	pairSum[] aux = new pairSum[size];

	// Generate all possible pairs
	// from A[] and store sums
	// of all possible pairs in aux[]
	int k = 0;
	for (i = 0; i < length - 1; i++) {
	for (j = i + 1; j < length; j++) {
		aux[k] = new pairSum();
		aux[k].sum = myArr[i] + myArr[j];
		aux[k].first = i;
		aux[k].sec = j;
		k++;
	}
	}

	// Sort the aux[] array using
	// library function for sorting
	Arrays.sort(aux, new Comparator<pairSum>() {
	// Following function is needed for sorting
	// pairSum array
	public int compare(pairSum a, pairSum b)
	{
		return (a.sum - b.sum);
	}
	});

	// Now start two index variables
	// from two corners of array
	// and move them toward each other.
	i = 0;
	j = size - 1;
	while (i < size && j >= 0) {
	if ((aux[i].sum + aux[j].sum == sum)
		&& noCommon(aux[i], aux[j])) {
		String output = myArr[aux[i].first] + ", "
		+ myArr[aux[i].sec] + ", "
		+ myArr[aux[j].first] + ", "
		+ myArr[aux[j].sec];
		System.out.println(output);
		return;
	}
	else if (aux[i].sum + aux[j].sum < sum)
		i++;
	else
		j--;
	}
}

public static void main(String[] args)
{
	int[] arr = { 10, 20, 30, 40, 1, 2 };
	int X = 91;

	// Function call
	findFourElements(arr, X);
}
}

