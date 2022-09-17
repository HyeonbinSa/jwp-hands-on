package reflection;

import annotation.Controller;
import annotation.Repository;
import annotation.Service;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ReflectionsTest {

    private static final Logger log = LoggerFactory.getLogger(ReflectionsTest.class);

    @Test
    void showAnnotationClass() throws Exception {
        Reflections reflections = new Reflections("examples");

        Class<? extends Reflections> aClass = reflections.getClass();
        // TODO 클래스 레벨에 @Controller, @Service, @Repository 애노테이션이 설정되어 모든 클래스 찾아 로그로 출력한다.
        HashSet<Class<?>> set = new HashSet<>();
        set.addAll(reflections.getTypesAnnotatedWith(Controller.class));
        set.addAll(reflections.getTypesAnnotatedWith(Service.class));
        set.addAll(reflections.getTypesAnnotatedWith(Repository.class));

        set.forEach(aClass1 -> log.info(aClass1.getName()));
    }
}
