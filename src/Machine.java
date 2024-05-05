public class Machine {
    //data declaration
    String name;
    String type;
    String function;
    //constructors

    //no parameterized constructor
    Machine() {
    }
    //parameterized constructor
    Machine(String name) {
        this.name = name;
    }
    Machine(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Machine(String name, String type, String function) {
        this.name = name;
        this.type = type;
        this.function = function;
    }
    //copy constructor
    Machine(Machine m1) {
        this.name = m1.name;
        this.type = m1.type;
        this.function = m1.function;
    }
}
