import org.springframework.web.servlet.i18n.SessionLocaleResolver

// Place your Spring DSL code here
beans = {
    localeResolver(SessionLocaleResolver) {
        defaultLocale= new java.util.Locale('ar','AR');
    }

    dateConverter edu.training.DateValueConverter

}