package com.uniyaz.Classes;

import com.vaadin.ui.*;

public class ContentLayout extends HorizontalLayout {
    //   SidebarLayout sidebarLayout = new SidebarLayout();

    //    public Label label1;
//    public Label label2;
//    public Label label3;
//
//    public ContentLayout(Label label1) {
//        this.label1 = label1;
//    }
//
//    public Label getLabel1() {
//        label1.setValue("Anasayfa");
//        return label1;
//    }
//
//    public void setLabel1(Label label1) {
//        label1.setValue("Anasayfa");
//        this.label1 = label1;
//    }
//
//    public Label getLabel2() {
//        return label2;
//    }
//
//    public void setLabel2(Label label2) {
//        this.label2 = label2;
//    }
//
//    public Label getLabel3() {
//        return label3;
//    }
//
//    public void setLabel3(Label label3) {
//        this.label3 = label3;
//    }
    public ContentLayout() {

        setSizeFull();
        Label label = new Label();
        label.setValue("CONTENTTT");
        label.setSizeUndefined();

        addComponent(label);
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);

//        label1.setValue("ksvsvklbjbsjbstjlnbstklns");
//        label1.getValue();
//        addComponent(label1);

        // addComponents(label1,label2,label3);

        //addComponent(getLabel1(),1);

//        Label label = new Label();
//        label.getValue();
//        addComponent(label);
//        label1.setValue("Anasayfa");
//        label2.setValue("Hakkımızda");
//        label3.setValue("İletişim");
        //   addComponents(label1,label2,label3);
//
//        label.setValue("ANASAYFA");
//
//       setSizeFull();
//
//        //label.setSizeUndefined();
//        //setComponentAlignment(label, Alignment.MIDDLE_CENTER);
//
//        Label label2 = new Label();
//        label2.setValue("HAKKIMIZDA");
//        Label label3 = new Label();
//        label3.setValue("İLETİŞİM");
//
//
//
//
//         addComponents(label,label2,label3);
//
//         SidebarLayout sidebarLayout = new SidebarLayout();


        //  addComponent(label,1);
//        addComponent(label2,2);
//        addComponent(label3,3);
//        LabelContent labelContent = new LabelContent();
//        addComponent((Component) labelContent);

        // addComponent(sidebarLayout);
    }

    public void anasayfa() {
        ContentLayout contentLayout = new ContentLayout();
        contentLayout.addComponent(new Label("anasayfaaaaa"));
        Label label=new Label();
        label.setValue("uıuvwuvtvhtuvhtşvtwışovwv");
        addComponent(contentLayout);
        //addComponent(label);
    }
}