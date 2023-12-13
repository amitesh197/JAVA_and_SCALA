class Q7 {
public static void main(String[] args) {
int i,j,asc;
char temp;
String s = new String("WXYZ");
String c = new String("");
for(i=0;i<s.length();i++){
temp=s.charAt(i);
asc = (int)(temp);
asc = 65 + (asc-65+3)%26;
// System.out.print(asc);
temp = (char)(asc);
c+=temp;
}
System.out.println(c);
}
}
