package pages

/**
 * basic page
 * @author: Assilzm
 * create: 17:28.
 * description:
 */
abstract class AbstractPage {

    //menu path to page
    String menuPath = null

    //tab name of page
    String tabName = null


    String getPageName(){
        this.class.getAnnotation(Page).pageName()
    }

    String getPageExtraName(){
        this.class.getAnnotation(Page).pageExtraName()
    }

    PageType getPageType(){
        this.class.getAnnotation(Page).pageType()
    }

    String getPageTypeName(){
        pageType.name
    }
}
