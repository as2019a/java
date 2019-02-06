package com.inc.assignment;

public class AssignmentEx4 {

		//프로그램을 구상해서 구현해보세요.
		//ex)묵찌빠

	 
  private Object[] queue;
  private int size = 0;
  private int rear = -1;
  private int front = -1;
   
  AssignmentEx4(int size) {
      this.size = size;
      //사이즈 만큼 큐 생성
      this.queue = new Object[size];
  }
   
  public void enQueue(Object element) {
       
      //큐 포화상태 검사
      if (isFull()) {
          throw new QueueOverflow();
      }
       
      queue[++rear] = element;
  }
   
  public Object deQueue() {
       
      //공백큐 검사
      if (isEmpty()) {
          throw new QueueUnderflow();
      }
       
      ++front;
      Object temp = queue[front];
       
      //help gc;
      queue[front] = null;
       
      //비어있다면 다시 원점으로 초기화
      if (isEmpty()) {
          rear = -1;
          front = -1;
      }
       
      return temp;
  }
   
  public boolean isFull() {
      return rear == size-1 ? true : false;
  }
   
  public boolean isEmpty() {
      return front == rear ? true : false;
  }
   
  public int getSize() {
      return size;
  }
   
   
  static class QueueOverflow extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
       
  }

  static class QueueUnderflow extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
       
  }



  public static void main(String[] args) {

  		Queue queue = new Queue(5);
  		queue.enQueue("A");
  		queue.enQueue("B");
  		queue.enQueue("C");
  		queue.enQueue("D");
  		queue.enQueue("E");
	
  		int size = queue.getSize();
  		for(int i=0;i<size;i++) {
  			System.out.println(queue.deQueue());
  		}

  		//공백큐 인데 뺄경우
  		System.out.println(queue.deQueue());


  	//creatordev.tistory.com/79 [Creator Developer]
 }
}
