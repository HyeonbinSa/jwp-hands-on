package reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class Junit4TestRunner {

    @Test
    void run() throws Exception {
        Class<Junit4Test> clazz = Junit4Test.class;
        Junit4Test junit4Test = clazz.getDeclaredConstructor().newInstance();
        // TODO Junit4Test에서 @MyTest 애노테이션이 있는 메소드 실행
        List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(MyTest.class))
                .collect(Collectors.toList());
        for (Method method : methods) {
            method.invoke(junit4Test);
        }
    }
}
