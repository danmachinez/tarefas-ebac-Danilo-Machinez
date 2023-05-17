import java.lang.annotation.Annotation;


public class Main {
    public static void main(String[] args) {
        TabelaAnnotation obj = new TabelaAnnotation();
        printAnnotations(obj.getClass());
    }

    public static void printAnnotations(Class<?> clazz){
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation.toString());
        }
    }
}
