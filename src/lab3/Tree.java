package lab3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        String message = "Empty constructor";
        System.out.println(message);
    }
}

class TreeMain {
    public static void main(String[] args) {
        Tree tree1 = new Tree(10, "Tree1");
        Tree tree2 = new Tree(11, true, "Tree2");
        Tree tree3 = new Tree();
    }
}