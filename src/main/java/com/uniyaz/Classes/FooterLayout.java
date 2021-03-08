package com.uniyaz.Classes;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class FooterLayout extends HorizontalLayout
{
    public FooterLayout()
    {
        Label label = new Label();
        label.setValue("COPYRIGHT 2021");
        addComponent(label);
        setSizeFull();
        label.setSizeUndefined();
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);
    }
}
