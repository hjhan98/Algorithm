package algorithm;

import java.io.InputStream;
import java.util.Scanner;

public class Stack {
    // 자동 정렬 : ctl + opt + l
    private int top;
    private int maxSize;
    private Object[] stkArr;

    // 스택 생성, 스택의 최대 크기로 생성
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stkArr = new Object[maxSize];
        this.top = -1;  // top은 -1로 초기화
    }

    // 스택이 비어있는지 체크
    public boolean empty() {
        return (top == -1);
    }

    // 스택이 꽉 찼는지 체크
    public boolean full() {
        return (top == maxSize - 1);
    }

    // 스택에 데이터 입력 : push()
    public boolean push(Object data) {
        if (full()) {
            System.out.println("꽉찼다 대박");
            return false;
        }
        stkArr[++top] = data;   // -1인 상태면 0번째에 push
        return true;
    }

    // 스택의 가장 위의 데이터 제거
    public Object pop() {
        if (empty()) {
            System.out.println("텅비었네..");
            return null;
        } else {
            Object data = stkArr[top];
            stkArr[top] = null;
            top--;
            return data;
        }
    }

    public void printStack(Stack stack){
        if(top != -1){
            for(int i = top; i <= top; i--){
                if(i == -1) break;
                System.out.println("|"+ stack.stkArr[i] +"|");
                System.out.println("----");
            }
        }
        else{
            System.out.println("뽑을게 없어..");
        }
    }

    public static void main(String[] args) {
        boolean isRun = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Stack 사이즈 입력 : ");
        int size = scan.nextInt();
        Stack stkArr = new Stack(size); // create Stack

        while(isRun){
            menu();
            String input = scan.next();

            switch (input){
                case "1":
                    System.out.println("push : ");
                    String data = scan.next();
                    stkArr.push(data);
                    break;
                case "2":
                    System.out.println("pop: "+stkArr.pop());
                    break;
                case "3":
                    stkArr.printStack(stkArr);
                    break;
                case "q":
                case "Q":
                    isRun = false;
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. STACK 확인");
        System.out.println("Q. 종료");
    }
}
