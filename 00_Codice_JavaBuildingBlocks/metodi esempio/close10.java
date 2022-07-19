// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
// Note that Math.abs(n) returns the absolute value of a number. 
public int close10(int a, int b) {
  if (Math.abs(10-a) < Math.abs(10-b)) {
     return a;
  } else if (Math.abs(10-a) > Math.abs(10-b)) {
     return b;
  } else {
     return 0;
  }
}
