// This program is used to convert indian standard time to Railway time



// input format--->HH:MM AM or PM
// important:: keep obey the format for giving



//i/p 1: 11:00 PM
//o/p 1: 23:00 

//i/p 2: 05:30 PM
//o/p 2: 17:30

import java.util.*;
public class time_converstion
{
    static void time(String str)
    {
    char a[]=str.toCharArray();
    int x=a.length;
    char m=a[x-2];
    int c=0;
    if((m=='A') || (m=='a'))
    {
        if(a[0]=='1'&&a[1]=='2' && c==0)
        {
            a[0]='0';
            a[1]='0';
            c=c+1;
            
        }
    }
    if((m=='P')||(m=='p'))
    {
        if(a[0]=='0' && c==0)
        {
            int q=((a[1]-48) +12);
            a[1]=(char)((q%10)+48);
            a[0]=(char)((q/10)+48);
            c=c+1;
            
        }
        if(a[0]=='1'&&a[1]!='2' &&c==0)
        {
         int sa=((a[0]-48)*10)+(a[1]-48)+12;
         a[1]=(char)((sa%10)+48);
         a[0]=(char)((sa/10)+48);
         c=c+1;
        }
    }
    for(int i=0;i<x-3;i++)
    System.out.print(a[i]);
    
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		time(str);
	}
}