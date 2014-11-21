package pages

/**
 * page type
 * @author: Assilzm
 * create: 10:27.
 * description:
 */
enum PageType{
    USER_PAGE("User Page"),
    UNIT_ADMIN_PAGE("Unit Admin Page"),
    GROUP_ADMIN_PAGE("Group Admin Page")

    String name

    PageType(String pageTypeName){
        name=pageTypeName
    }

}
