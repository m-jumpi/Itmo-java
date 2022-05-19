package lab3;

class Study {

    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study course = new Study("Java - it's simple!");
        System.out.println(course.printCourse());
    }
}

