package lesson.lesson10;

public class OuterClass {

    public String everyoneSee = "Everyone can see this";
    private String dontLook = "Nobody can see this";

    class InnerClass {

        public String getStatus() {
            return everyoneSee;
        }
    }
}
