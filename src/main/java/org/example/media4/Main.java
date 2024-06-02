package org.example.media4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    // New Branch
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("media-player.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());

        // created a parent node.
//        Parent root = FXMLLoader.load(getClass().getResource("media-player.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // implementing css
        String css = this.getClass().getResource("dark-theme.css").toExternalForm();
        scene.getStylesheets().add(css);

        //dynamic theme
        MediaPlayerController controller = loader.getController();
        controller.setMainScene(scene);


        //adding a logo in the top left corner

//        String imagePath = "src/main/resources/org/example/media4/PlayButtonLogo.png";
//        Image icon = new Image("file:" + imagePath);
//        stage.getIcons().add(icon);

        Image icon = new Image(getClass().getResourceAsStream("PlayButtonLogo.png"));
        stage.getIcons().add(icon);

        stage.setTitle("Echo");
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}