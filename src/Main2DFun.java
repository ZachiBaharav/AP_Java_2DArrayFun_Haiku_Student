/*

In this program a mystery Haiku is hidden.
Follow the directions to find the Haiku. The haiku (or parts of it)
will be revelaed whenever you run the program.
Search in the code below for "ToDo" instructions.

You will need to demonstrate your mastery of 2D arrray.


http://www.ahapoetry.com/AHI%20frog%20art.html 
*/


public class Main2DFun {

    static int[][] arr2D = {
        {1,2,3,4,0},
        {5,6,7,8,1},
        {1,3,5,7,3},
        {2,4,6,8,5}
    };
    
    static int[] keys = new int[22];
    
    
    public static void main(String[] args)
    {
        
        int rows = arr2D.length ;
        int cols = arr2D[0].length;
        
        // ToDo :
        // Calculate the sum of the row number 2 using a loop
        // over the elements of the row.
        // (rows counting starts from 0, so the row number 2 is the
        // one starting with 1.)
        // Assign the result to row2Sum
        int row2Sum = 0;
        
        System.out.println(row2Sum);  
        keys[2]=row2Sum+92 ;

        // ToDo :
        // Calculate the sum of row number 1 
        // Assign the value to row1Sum
        int row1Sum = 0;
        
        System.out.println(row1Sum);
        keys[3]=81+row1Sum ;

        
        // ToDo :
        // Calculate the sum of column number 0
        // Assign the value to col0Sum
        int col0Sum = 0;
        for (int rr=0; rr<rows; ++rr)
            col0Sum+=arr2D[rr][0];
        
        System.out.println(col0Sum);
        keys[4]=col0Sum+91 ;

        
        // ToDo :
        // Calculate the sum of the diagonal elements, namely
        // those for which  ( row==column )
        // Assign the value to diagSum
        
        int diagSum = 0;
        
        
        System.out.println(diagSum);
        keys[6]=diagSum+92 ;

        
        // ToDo :
        // Calculate the sum of all the elements
        // Assign it to totalSum
        int totalSum = 0;



        System.out.println("totalsum="+totalSum);
        keys[7]=totalSum+29 ;
        
        // ToDo :
        // Find the maximum value of all the elements
        // Assign it to maxVal
        int maxVal = 0;
        

        System.out.println("maxVal="+maxVal);
        keys[10]=maxVal + 94 ;
        
        // ToDo :
        // Find the minimum value of all the elements        
        // Assign it to minVal
        int minVal = 0;


        System.out.println("minVal="+minVal);
        keys[11]=minVal + 114 ;

        
        
        // ToDo :
        // Find the location (row and column) of an element of value 0.
        // Then, find the element to it's left and the element below it
        // Assign it to the variables r and c below        
        int r=2,c=2 ;

        
        
        // Change the code here!
        int leftElement = 0; 
        System.out.println("leftElement="+leftElement);
       
        // Change the code here!
        int belowElement = 0;
        System.out.println("belowElement="+belowElement);
        
        keys[12]=leftElement+99 ;
        keys[13]=belowElement + 105 ;

        keys[14]=117 ;
        keys[15]=109 ;
        keys[16]=115 ;
        keys[17]=105 ;
        keys[19]=104 ;
        keys[20]=97 ;

        
        
        
        
        String str = createSentence(keys);
        System.out.println("\n\nDrum roll!!\n\n" + str);
    }

    
    
    
    
    public static String createSentence(int[] keys)
    {
        int[] sentenceCode = {1,2,3,4,5,6,2,7,4,8,9,
                            10,11,2,12,5,13,14,15,6,16,5,17,7,9,
                            18,16,6,3,20,16,19,1,9};
        

        keys[1]='"';
        keys[5]=' ';
        keys[8]=',';
        keys[9]='\n';
        keys[18]='-';
                
        String str="";
        
        for (int ii=0; ii<sentenceCode.length ; ++ii)
            str += (char) (keys[sentenceCode[ii]]);
        
        return str;
    }
    
    
    
    
}
