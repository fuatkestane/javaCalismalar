package stackclass;

class Stack
{
    int stck[]=new int[10];
    int tos;
    
    Stack()
    {
        tos=-1;
    }
    void Push(int item)
    {
        if (tos==9)
        {
            System.out.println("Stack Dolu!");
        }
        else
        {
            stck[++tos]=item;
        }
    }
    
    int pop()
    {
        if (tos<0)
        {
           System.out.println("Stack taşmak üzere!");
           return 0;
        }
        else
        {
           return stck[tos--];
        }
    }
}
public class StackClass
{
    public static void main(String[] args) 
    {
       
    }    
}
