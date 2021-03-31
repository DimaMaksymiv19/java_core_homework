package Main.Practise17;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UselessAnotation {
    String value();
}
