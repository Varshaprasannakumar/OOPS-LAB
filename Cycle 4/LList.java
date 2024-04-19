import java.util.*;
public class LList {
public static void main(String[] args){
System.out.println("Name : VARSHA P NAIR\nRoll No : 23MCA060\nDate : 15/04/2024");
System.out.println("Program 21");
LinkedList<String> L=new LinkedList<>();
L.add("JAVA");
L.add("PYTHON");
L.add("CSS");
L.add(0,"PROGRAMING LANGUAGE");
System.out.println(L);
L.remove("CSS");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
