import java.util.Scanner;

class Queue {
    int que[],size,front,rear;
    Queue(int mm){
        size = mm;
        que=new int[size];
        front =0;
        rear=0;
    }
    void addele(int v) {
        if(rear>=size){
            System.out.println("Overflow!");
        }else {
            que[rear++]=v;
        }
    }
    int delete(){
        if(front<=0) {
            System.out.println("Underflow!");
            return -9999;
        }else{
            return que[front--];
        }
    }
    void display(){
        System.out.println(delete());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        Queue ob = new Queue(sc.nextInt());
        for(int i=0;i<ob.size;i++){
            System.out.print("Enter Element "+(++i)+": ");
            ob.addele(sc.nextInt());
        }
        ob.display();
        sc.close();
    }
}