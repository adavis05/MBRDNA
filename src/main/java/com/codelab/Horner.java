package com.codelab;

/**
 * Horner's method.
 */
class Horner {

/**
 * 	
 * Horner’s Method

Int k = 0
int y = 0

int i = first index of array -> args[0], Ex, will say 3 = args[0] 
int x = second index of array -> args[1] -> args[1], will say 4 = args[1]

int[] a = [i + 1], Ex: args[0] = 3, a gets 4 spaces

For Loop, n = 2; n <= 2 + i; n++
	a[k] = int.parse(args[n]), n = 2 going to 2 + i -> Ex: a[0] = args[2], goes until 2 + 3
	k = k + 1								      a[1] = args[3]
										      a[2] = args[4]
										      a]3] = args[5]

While loop, i >= 0
	y = a[i] + x * y, y begins at 0, why initially get a[i] -> Ex: y = a[3] + 4*0
											Ex: 
	i = i - 1
 * 
 * 
 */
	
//Copy and pasted above to help understand problem
//Own personal notes	
	
    public static int solve(String[] args) throws Exception {
        int y = 0;
        int i = Integer.parseInt( args[0] );
        int x = Integer.parseInt( args[1] );
        int k = 0;
        int[] a = new int[i+1];

        for (int n = 2; n <= 2+i; n++) {
            a[k] = Integer.parseInt(args[n]);
            k = k + 1;
        }

        while (i >= 0) {
            y = a[i] + x * y;
            i = i - 1;
        }
        return y;
    }
}
