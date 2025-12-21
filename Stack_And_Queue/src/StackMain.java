public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack st = new DynamicStack(); // Its A Dynamic Stack Now

        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.push(600);
        st.push(700);
        st.push(800);
        st.push(900);
        st.push(1000);


        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
        System.out.println("Poped Element Is : "+st.pop());
       // System.out.println("Poped Element Is : "+st.pop());


    }
}
