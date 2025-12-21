import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        System.out.println("Stack : "+st);

        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
       // System.out.println("Poped Element Is : "+st.pop());

    }
}