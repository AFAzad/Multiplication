/* Problem Statement
Given two numbers m and n, multiply them using only "addition" operations.  */

static int  Multiply_by_recursion(int M, int N) 
    { 
  //Enter your code here
  if(M==0 || N == 0){
    return 0;
  }
  if (N == 1){
    return M;
  }
  return M + Multiply_by_recursion(M, N -1);
    }