// Given a string, return a new string where the last 3 chars are now in upper case. 
// If the string has less than 3 chars, uppercase whatever is there. 
public String endUp(String str) {
  int length = str.length();
  if (length <= 3) {
     return str.toUpperCase();
  }
  
  return str.substring(0, length-3) + str.substring(length-3, length).toUpperCase();
}
