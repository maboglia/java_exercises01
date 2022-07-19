// Return true if the given string contains between 1 and 3 'e' chars. 
public boolean stringE(String str) {
  int count = 0;
  int length = str.length();
  for(int i=0; i<length; i++) {
     if (str.charAt(i) == 'e') {
        count++;
     }
  }
  
  return (count>=1 && count<=3);
}
