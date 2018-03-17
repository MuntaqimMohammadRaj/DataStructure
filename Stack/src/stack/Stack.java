
package stack;


public class Stack {

   
    public static void main(String[] args) {
       
    



        
        
        demo st = new demo(5);
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
         st.pop();
        st.push(60);
        st.push(70);
       
       
        st.show();
        st.top();
        st.size();

       
    }
}



    class demo
    {
        int stack[];
        int top;
        int size;
        int capacity;
        
        demo(int n)
        {
          capacity=n;
          stack= new int[capacity];
          top=-1;
          size=0;
          
        }
        
        boolean isFull()
        {
            if(size>capacity-1)
            {
               return true;
            }
            
            else
            {
                return false;
            }
        }
        
          boolean isEmpty()
        {
            if(size==0)
            {
               return true;
            }
            
            else
            {
                return false;
            }
        }
          
        void push(int item)
        {
            if(isFull())
            {
                System.out.println("Stack Overflow!!!");
            }
            
            else
                
            {
                top++;
                size++;
                stack[top]=item;
            }
               
            
            
        }
        
        
         int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack Underflow!!!");
            }
            
            else
                
            {
               top--;
                size--;
                
            }
            return 0;
               
            
            
        }
         
         void top()
         {
             if(top==-1)
             {
                 System.out.println("Empty Stack"); 
             }
             else
             {
             System.out.println("Top of the Stack: "+stack[top]);
             
             }
         }
         
         
         void size()
         {
             System.out.println("Size of the stack: "+size);
         }
         
         
         void show()
         {
             if(isEmpty())
             {
                 System.out.print(""); 
             }
             
             else
             {
                 System.out.print("Stack: ");
                 
                 for (int i = 0; i <=top; i++) {
                     
                     System.out.print(stack[i]+"\t");
                     
                 }
                 
                 System.out.println("");
             }
         }
        
    }