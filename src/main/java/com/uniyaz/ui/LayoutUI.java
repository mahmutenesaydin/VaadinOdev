package com.uniyaz.ui;

import com.uniyaz.Classes.ContentLayout;
import com.uniyaz.Classes.FooterLayout;
import com.uniyaz.Classes.HeaderLayoutt;
import com.uniyaz.Classes.SidebarLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/*
*
* @author Atilla Gökhan KARTAL
* @since
*
*/
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class LayoutUI extends UI {

    private VerticalLayout mainLayout;
    private HorizontalLayout bodyLayout;
   // private String erisilecekDegisken = "TEST";
    private HeaderLayoutt headerLayoutt;
    private SidebarLayout sidebarLayout;
    private ContentLayout contentLayout;
    private FooterLayout footerLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout() {

        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        headerLayoutt = new HeaderLayoutt();
        mainLayout.addComponent(headerLayoutt);

        buildBodyLayout();
        mainLayout.addComponent(bodyLayout);

        footerLayout = new FooterLayout();
        mainLayout.addComponent(footerLayout);
//
//        mainLayout.setExpandRatio(headerLayout,2f);
//        mainLayout.setExpandRatio(footerLayout,2f);
//        mainLayout.setExpandRatio(bodyLayout,6f);
    }

    private void buildBodyLayout() {

        bodyLayout = new HorizontalLayout();
        bodyLayout.setSizeFull();

        sidebarLayout = new SidebarLayout();

        bodyLayout.addComponent(sidebarLayout);

        contentLayout = new ContentLayout();
        bodyLayout.addComponent(contentLayout);
    }

//    public String getErisilecekDegisken() {
//        return erisilecekDegisken;
//    }
}