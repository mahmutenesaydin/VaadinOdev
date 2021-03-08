package com.uniyaz.Classes;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class HeaderLayoutt extends HorizontalLayout{

    public HeaderLayoutt() {
        Label label = new Label();
        label.setValue("Headerr");
        addComponent(label);
        setSizeFull();
        label.setSizeUndefined();
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);


//        setSizeFull();
//
//        String erisilecekDegisken = ((LayoutUI) UI.getCurrent()).getErisilecekDegisken();

//        Label contentLayout =((ContentLayout) UI.getCurrent()).getLabel1();

//        Label label = new Label();
//        label.setSizeUndefined();
//        label.setValue(erisilecekDegisken);
//        addComponent(label);
//
//        setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
}