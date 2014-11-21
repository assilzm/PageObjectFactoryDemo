package pages

import org.apache.log4j.Logger
import org.junit.Test
import pages.production.Page1
import pages.production.Page2
import utils.LogUtils

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.assertThat

/**
 *
 * @author: Assilzm
 * create: 11:19.
 * description:
 */
class PageFactoryTest {

    private final static Logger logger = LogUtils.getLogger(PageFactory)


    @Test
    void testGet() {
        String createPageName="user page 2"
        Class pageClass= Page2.class
        Class page=PageFactory.get(createPageName)
        assertThat("assert ${createPageName}'s class is Page2.class",page,equalTo(pageClass))
    }

    @Test
    void testCreatePage() {
        String createPageName="user page 1"
        AbstractPage page=PageFactory.createPage(createPageName)
        logger.debug("[${createPageName}]的路径:${page.menuPath}")
        logger.debug("[${createPageName}]的页签:${page.tabName}")
        assertThat("assert ${createPageName}'s page is a instance of Page1",page,instanceOf(Page1))
    }


}
