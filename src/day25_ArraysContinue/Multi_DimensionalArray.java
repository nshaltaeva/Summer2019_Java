package day25_ArraysContinue;

import java.util.Arrays;

public class Multi_DimensionalArray {
public static void main(String[] args) {
	/*
	 n dimensional array contains multiple (n-1) dimensional arrays
	 */
	
	int [] arr1D = {1,2,3};//1 dimensional array
	
	int[][]arr2D = { {1,2,3} , {4,5,6} };
	
	String [] arr = {"A", "B"};
	
	//                      0    1         0    1
	String [][] str2D = { {"A", "B"},    {"C", "D","E"}  };
	//                         0              1
	//  [represents index num of one dim array] [represents index num of the values] 
	
	//print A
	System.out.println(str2D[0][0]);
	//print B
	System.out.println(str2D[0][1]);
	//print C
	System.out.println(str2D[1][0]);
	//print D
	System.out.println(str2D[1][1]);
	//print E
	System.out.println(str2D[1][2]);
	
	//print[A,B]
	System.out.println(Arrays.toString(str2D[0]));
	
	//print [C, D, E]
	System.out.println(Arrays.toString(str2D[1]));
	
	//print [A,B] [C,D,E]]
	System.out.println(Arrays.toString(str2D));
	
	//Arrays.deepToString(variableName): converts multi-dimensional Arrays to String
	System.out.println(Arrays.deepToString(str2D));
	
	
	
	//                      0 1      0 1     0 1 2 3 4 5
	int [][] Numbers2D = { {1,2},   {3,4} , {5,6,7,8,9,10}   };
	// index                 0        1       2
	
	//print 6:
	System.out.println(Numbers2D[2][1]);
	
	//print 10
	System.out.println(Numbers2D[2][5]);
	
	//print {5,6,7,8,9,10}
	System.out.println(Arrays.toString( Numbers2D[2] ) );
	
	//print entire 2D array
	System.out.println(Arrays.deepToString(Numbers2D));
	
	
	//3 dimensional array contains multiple 2 dim arrays
	int [][] Array2D = { {1,2} , {3,4}};
	
	//                        0      1               0      1
	int [][][]Array3D = { { {1,2}, {3,4} }  ,    { {5,6}, {7,8} }};
	//index                      0                       1
//[index num of 2D array] [index num of 1 array][index num of value]	
	
	//print 8
	System.out.println(Array3D[1][1][1]);
	
	//print  {5,6}
	System.out.println(Array3D[1][0]);
	System.out.println(Arrays.toString(Array3D[1][0]));
	
	//print  { {5,6}, {7,8} }
	System.out.println(Arrays.deepToString(Array3D[1]));
	
	//print entire 3D Array
	System.out.println(Arrays.deepToString(Array3D));
	
	
	
	int [][][] numbers3D = { {} , {}};
	// 4 dimensional array contains multiple 3 dimensional arrays
	
	int [][][][] number4D = { {},   {},   {},  {}           };
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
