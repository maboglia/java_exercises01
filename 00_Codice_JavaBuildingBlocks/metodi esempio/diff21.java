// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
public int diff21(int n) {
  return ((21-n) >= 0) ? 21-n : -2 * (21-n);
}
