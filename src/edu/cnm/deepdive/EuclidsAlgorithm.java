package edu.cnm.deepdive;

public class EuclidsAlgorithm {

//  public static void main(String[] args) {
//
//  }

  public static int gcd(int a, int b){
    a = Math.abs(a);
    b = Math.abs(b);
    while(a != 0){
      if(b>a) {
        b %= a;
      }else if (b==0){
        return a;
      }else{
        a%=b;
      }
    }
    return b;
  }

  public static long gcd(long a, long b){
    a = Math.abs(a);
    b = Math.abs(b);
    while(a != 0){
      if(b>a) {
        b %= a;
      }else if (b==0){
        return a;
      }else{
        a%=b;
      }
    }
    return b;
  }

}
