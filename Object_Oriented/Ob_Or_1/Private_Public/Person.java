package Object_Oriented.Ob_Or_1.Private_Public;

public class Person {      // ✅ 외부에서 접근 불가 

    public String name;    // ✅ 외부에서 접근 불가 
    private String secret; // ❌ 외부에서 접근 불가 
    
    public Person() {}    // ✅ 외부에서 접근 불가 

    public void methodA() {}  // ✅ 외부에서 접근 가능
    private void methodB() {} // ❌ 외부에서 접근 불가
}