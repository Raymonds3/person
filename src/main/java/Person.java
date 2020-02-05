public class Person {
    String name;
    int age;
    String gender;
    String[] interest;

    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }

    public String hello(){
        
        String message ="Hello, my name is " + name +" and I am "+ age + " years old. My interests "+ interest[0]+", " + interest[1]+" and " +interest[2]+".";
        return message;
    }
}
