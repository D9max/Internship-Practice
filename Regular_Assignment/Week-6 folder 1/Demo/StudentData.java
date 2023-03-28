public class StudentData {
 
    public static void main(String[] args) {
        
    Student st=new Student();
    st.setRollno(1234);
    st.setName("lalitha");
    st.setDept("CSE");
    st.setSection('c');
    System.out.println(st.getRollno()+" "+st.getName()+" "+st.getDept()+" "+st.getSection());
    }
 
    
}
 