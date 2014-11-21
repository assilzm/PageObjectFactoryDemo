package pages.production

import pages.AbstractPage
import pages.Page

/**
 * user page 1
 * @author: Assilzm
 * create: 14:07.
 * description:
 */
@Page(pageName = "user page 1")
class Page1 extends AbstractPage{

    Page1(){
        menuPath="a->b->c"
        tabName="page1 tab"
    }
}
