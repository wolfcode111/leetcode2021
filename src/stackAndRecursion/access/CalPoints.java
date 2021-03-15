package stackAndRecursion.access;

import java.util.Stack;

public class CalPoints {

    public static void main(String[] args) {

        String[] s = {"5","-2","4","C","D","9","+","+"};
        System.out.print(calPoints(s));
    }

    public static int calPoints(String[] ops) {
        int number = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                s.pop();
            }else if(ops[i].equals("D")){
                int temp = s.pop();
                s.push(temp);
                s.push(temp*2);
            }else if(ops[i].equals("+")){
                int a = s.pop();
                int b= s.pop();
                s.push(b);
                s.push(a);
                s.push(a+b);
            }else{
                int a = Integer.parseInt(ops[i]);
                s.push(a);
            }
        }
        while(!s.empty()){
            number+=s.pop();
        }
        return number;
    }
}
