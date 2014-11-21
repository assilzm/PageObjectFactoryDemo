package pages.production

import pages.AbstractPage
import pages.Page

/**
 * user page 2
 * @author: Assilzm
 * create: 14:07.
 * description:
 */
@Page(pageName = "user page 2",pageExtraName = "user page 3")
class Page2 extends AbstractPage {

    Page2() {
        menuPath = "b->c"
        tabName = "page2 tab"
    }
}
