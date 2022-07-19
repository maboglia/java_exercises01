// Given a string, we'll say that the front is the first 3 chars of the string. 
// If the string length is less than 3, the front is whatever is there. 
// Return a new string which is 3 copies of the front. 
public String front3(String str) {
  int length = (str.length()>=3) ? 3 : str.length();
  String temp = str.substring(0, length) + str.substring(0, length) + str.substring(0, length);
  return temp;
}
