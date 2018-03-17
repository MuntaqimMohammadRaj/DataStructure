package queue;

public class Queue {

    public static void main(String[] args) {
        
        queu q = new queu(5);
       for (int i =1; i < 10; i++) {
               
               if(q.isFull())
                {
                    System.out.println("Overflow");
                    break;
                }
               
               q.push(i);
          }            
        
        q.pop();
        q.pop();
        q.display();
        
        q.peek();
        q.size();
        
       
    }
}

        class queu
        {
            int queue[];
            int rear;
            int front;
            int size;
            int capacity;
            
            queu(int n)
            {
               capacity=n;
               queue= new int[capacity];
               rear=-1;
               front=-1;
               size=0;
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
             
             void push(int item)
             {
                 if(isFull())
                 {
                     System.out.println("Queue Overflow!!!"); 
                 }
                 
                 else if(isEmpty())
                 {
                     rear++;
                     front++;
                     size++;
                     queue[rear]=item;
                 }
                 
                 else
                 {
                     rear++;
                     size++;
                     queue[rear]=item;
                 }
                 
             }
            
             
              void pop()
             {
                 int item=0;
                 if(isEmpty())
                 {
                     System.out.println("Queue Underflow!!!"); 
                 }
                 
                 
                 
                 else
                 {
                    item=queue[front];
                    front++;
                    size--;
                    System.out.println("Poped item: "+item);
                   
                 }
                  
                 
             }
              
             void size()
             {
                 System.out.println("Size of the queue: "+size);
             }
             
             void peek()
             {
                 if(isEmpty())
                 {
                     System.out.println("Empty queue"); 
                 }
                 
                 else
                 {
                     System.out.println("Peek of the queue: "+queue[rear]);
                 }
                         
             }
             
             void display()
             {
                 if(isEmpty())
                 {
                     System.out.print("");
                 }
                 
                 else
                 {
                     System.out.print("Queue: ");
                     for (int i =front; i <=rear; i++) {
                         
                         System.out.print(queue[i]+"\t");
                         
                     }
                     
                     System.out.println("");
                 }
             }
            
        }

   