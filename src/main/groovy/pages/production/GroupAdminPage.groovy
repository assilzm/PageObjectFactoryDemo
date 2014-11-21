package pages.production

import pages.AbstractPage
import pages.Page
import pages.PageType

/**
 * group admin page
 * @author: Assilzm
 * create: 10:26.
 * description:
 */
@Page(pageName = "group admin page",pageType = PageType.GROUP_ADMIN_PAGE)
class GroupAdminPage extends AbstractPage{
    GroupAdminPage(){
        menuPath="d->e"
        tabName=null
    }
}
