package Main.Homewok18;

import java.lang.annotation.*;
import java.lang.invoke.TypeDescriptor;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SomeAnnotation {
    String value();

}
