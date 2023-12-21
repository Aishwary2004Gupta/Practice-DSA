package com.Aishwary;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    }
    static void scope(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

/*                      // declared (int a)
                        // initialised (a = 40)
1.
anything initialised outside the block can be used (re-defined) inside the clock
int a = 90
    {
    a = 20 (correct )
         }
         sout(a) // output = 20
2.
anything initialised outside the block cannot be initialised inside the block
int a = 90
    {
    int a = 20 ( incorrect )
         }
         sout(a) // output = error/90
3.
anything initialised inside the block cannot be used outside the block (eg:- printing)
{
int a = 10;
       }
       sout(a) //output = error

4.
anything initoalised inside the block can be re initialised outside the block
{
int a = 10;
       }
       int a = 50;
       sout(a) //output = 50
*/
