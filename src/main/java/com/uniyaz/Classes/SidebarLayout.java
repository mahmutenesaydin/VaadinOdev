package com.uniyaz.Classes;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class SidebarLayout extends HorizontalLayout
{
//       public ButtonContent anasayfaBtn;
//       public ButtonContent hakkimizdaBtn;
//       public ButtonContent iletisimBtn;


//      ContentLayout contentLayout = new ContentLayout();

    public SidebarLayout()
    {
        //setSizeFull();
        Button button3 = new Button();
        button3.setCaption("Anasayfa");
        button3.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Label label = new Label();
                label.setValue("bseskjsk");
                ContentLayout contentLayout =new ContentLayout();
                contentLayout.anasayfa();
                addComponent(contentLayout);

           //     Notification.show("Anasayfa");
               //addComponent(new Label("MANASAYFABROO"));

//                Label label = new Label();
//                label.setCaption("Ansayfasgdrhtr");
//                setComponentAlignment(label,Alignment.MIDDLE_LEFT);

               // Label label = new Label("asaffa");
         //
            }
        });
        button3.addStyleName(ValoTheme.BUTTON_PRIMARY);


           Button button2 = new Button();
           button2.setCaption("Hakkımızda");
//        button2.addClickListener(e->{
//            textField.getValue();
//        });


      //  ContentLayout contentLayout = new ContentLayout();
        button2.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                //     addComponent(contentLayout.label1);
             //        Notification.show("Hakkımızda");
           //        addComponent(new Label("Hrgvrgvgrakkımızda"));
                  //  new Label("hsjsjskde3kl3");
                //  ContentLayout contentLayout = new ContentLayout();
                //  contentLayout.getComponent(2);
                //addComponent(contentLayout.getComponent(2));

//                LabelContent labelContent = new LabelContent();
 //                ContentLayout contentLayout =  new ContentLayout();

                //addComponent(contentLayout);
                Label label = new Label();
                label.setValue("jksgkjsgklrs");

                ContentLayout contentLayout = new ContentLayout();
           //     contentLayout.label1.setValue("ergbömg bbklrberg");
                //contentLayout.getLabel1();
             //   contentLayout.label1.getValue();

                addComponent(contentLayout);

              // button2.addClickListener(e->contentLayout.label1.setCaption("iletugıyfyişimmmmjvyyjyjgjy"));
            }

        });
        button2.addStyleName(ValoTheme.BUTTON_DANGER);

        Button button = new Button();
        button.setCaption("İletişim");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                //ContentLayout contentLayout = new ContentLayout();
                Notification.show("İletişim");
            }
        });
        button.addStyleName(ValoTheme.BUTTON_FRIENDLY);

       addComponent(button);
       addComponent(button2);
       addComponent(button3);

       setExpandRatio(button,2f);
       setExpandRatio(button2,2f);
       setExpandRatio(button3,2f);

       addComponents(button,button2,button3);
      // addComponents(contentLayout);
    }

}
