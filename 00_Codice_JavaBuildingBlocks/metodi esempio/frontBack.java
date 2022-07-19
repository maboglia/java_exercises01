// Given a string, return a new string where the first and last chars have been exchanged. 
public String frontBack(String str) {
  int length = str.length();
    
  if (length < 2) {
     return str;
  } 
  
  String middle = str.substring (1, length-1);  
  return str.charAt(length-1) + middle + str.charAt(0);
}
