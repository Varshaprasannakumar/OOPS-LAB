import java.util.Scanner;
class authException extends Exception
{
public authException(String s)
{
super(s);
}
}
public class Userauthentication
{
public static void main(String[] args)
{
String username = "SJCET";
String passcode = "SJCET2024";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Name : VARSHA P NAIR\nRoll No : 23MCA060\nDate : 15/04/2024");
System.out.println("Program 19");
System.out.println("Enter the username:");
user_name = sc.nextLine();
System.out.println("Enter the password:");
password = sc.nextLine();
if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");
}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}
}
