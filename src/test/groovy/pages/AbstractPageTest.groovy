package pages

import org.junit.Test
import pages.production.Page2

import static org.hamcrest.CoreMatchers.equalTo
import static org.junit.Assert.assertThat

/**
 *
 * @author: Assilzm
 * create: 11:26.
 * description:
 */
class AbstractPageTest {
    @Test
    void testGetPageName() {
        def pageName="user page 2"
        AbstractPage page2=new Page2()
        assertThat("assert page name is ${pageName}",page2.pageName,equalTo(pageName))
    }

    @Test
    void testGetPageType() {
        String unitPageName="unit admin page"
        AbstractPage unitPage=PageFactory.createPage(unitPageName)
        assertThat("assert page is a unit admin page",unitPage.pageType,equalTo(PageType.UNIT_ADMIN_PAGE))
    }

    @Test
    void testGetPageTypeName() {
        String groupPage="group admin page"
        String pageTypeName="Group Admin Page"
        AbstractPage unitPage=PageFactory.createPage(groupPage)
        assertThat("assert page type is ${pageTypeName}",unitPage.pageTypeName,equalTo(pageTypeName))
    }
}
