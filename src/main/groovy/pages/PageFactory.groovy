package pages

import org.apache.log4j.Logger
import org.reflections.Reflections
import utils.LogUtils

/**
 * page factory
 * @author: Assilzm
 * create: 16:47.
 * description:
 */
class PageFactory {

    //logger
    private final static Logger logger = LogUtils.getLogger(PageFactory)

    //package contains all pages
    final static String PACKAGE_NAME = "pages.production"

    final static String STATIC_INSTANCE_METHOD_NAME = "getInstance"


    static private Map<String, Class> pages = new HashMap<>()

    /**
     * get all pages
     * @return
     */
    static Map<String, Class> getPages() {
        if (pages.isEmpty())
            init()
        pages
    }

    /**
     * get a page by page name
     * @param pageName name of a page
     * @return
     */
    static Class get(String pageName) {
       def pageClass= getPages().get(pageName)
        if(!pageClass){
            throw new ClassNotFoundException("can not find page [${pageName}]")
        }
        pageClass
    }

    /**
     * get a page instance
     * @param pageName name of a page
     * @return
     */
    static AbstractPage createPage(String pageName) {
        def page
        def pageObj = get(pageName)
        logger.debug("create page [$pageName]:$pageObj")
        if(hasMethod(pageObj,STATIC_INSTANCE_METHOD_NAME))
            page=pageObj.invokeMethod(STATIC_INSTANCE_METHOD_NAME,null)
        else
            page=pageObj.newInstance()
        if (page&&!(page instanceof AbstractPage)) {
            throw new ClassCastException("page name [${pageName}] create a page [${page.class}] is not a instance of AbstractPage.")
        }
        page
    }

    private static boolean hasMethod(Class obj,String method){
        try {
            obj.getDeclaredMethod(method)
            true
        }catch (NoSuchMethodException){false}
    }

    /**
     * init all pages
     */
    private static void init() {
        pages.clear()
        //get all classes of a package by Reflections.
        Reflections reflections = new Reflections(PACKAGE_NAME)
        def classes = reflections.getTypesAnnotatedWith(Page)
        for (def page : classes) {
            def pageName = page.getAnnotation(Page).pageName()
            logger.debug("loading [${pageName}]:[${page}]")
            pages.put(pageName, page)
            def pageExtraName=page.getAnnotation(Page).pageExtraName()
            if (pageExtraName){
                    pages.put(pageExtraName, page)
            }
        }
    }
}



