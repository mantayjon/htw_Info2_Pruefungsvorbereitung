import java.sql.SQLOutput;

public class TestStack{
    public static void main(String[] args) {

        StackHTW st = new StackHTW();

        System.out.println(st.isEmpty());
        st.push(3);
        System.out.println(st.size());
        System.out.println(st.isEmpty());

        System.out.println(st.pop());

        st.push(7);
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(9);
        st.push(2);

        System.out.println(st.peek());
        System.out.println(st.size());



    }
}
