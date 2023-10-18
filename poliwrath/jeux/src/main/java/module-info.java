module com.jeux.jeux {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.jeux.jeux to javafx.fxml;
    exports com.jeux.jeux;
}