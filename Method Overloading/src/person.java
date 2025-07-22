public class person {
    private
    int age;

    public
    person(int age){
        this.age = age;
    }

    void growOlder(){
        age = age +1;
    }

    void growOlder(int years){
        age = age + years;
    }

    @Override
    public String toString(){
        return String.valueOf(age);
    }
}


