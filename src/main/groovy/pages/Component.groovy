package pages

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Inherited
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target


/**
 * component annotation
 * @author: Assilzm
 * create: 14:08.
 * description:
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Component {
    //some method name and default value
}