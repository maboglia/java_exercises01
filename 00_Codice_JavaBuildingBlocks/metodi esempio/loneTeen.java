// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 2 int values, return true if one or the other is teen, but not both. 
public boolean loneTeen(int a, int b) {
  boolean first = (a>=13 && a<=19);
  boolean second = (b>=13 && b<=19);
  return (first && !second) || (!first && second);
}
