package pages

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Inherited
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * page annotation
 * @author: Assilzm
 * create: 14:08.
 * description:
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Page {

    /**
     * page's name
     * @return
     */
    String pageName()

    /**
     * page's name
     * @return
     */
    String pageExtraName() default ""

    /**
     * page's type,default is USER_PAGE
     * @return
     */
    PageType pageType() default PageType.USER_PAGE
}