package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.DepartamentService;
import model.services.SellerService;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;

	@FXML
	private MenuItem menuItemDepartment;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	private void onMenuItemSellerAction() {
		loadView("/gui/SellerList.fxml", (SellerListController controller) -> {			//ação de inicialização do controler SellerListCont
			controller.setSellerService(new SellerService());
			controller.updateTableView();
		});
	}

	@FXML
	private void onMenuItemDepartmentAction() {
		loadView("/gui/DepartmentList.fxml", (DepartmentListController controller) -> {			//ação de inicialização do controler DepListCont
			controller.setDepartmentService(new DepartamentService());
			controller.updateTableView();
		});
	}

	@FXML
	private void onMenuItemAboutAction() {
		loadView("/gui/About.fxml", x -> {});							//como aqui não tem função, fica dessa forma
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}

	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {			//função generica do tipo T
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear(); // limpa todos os filhos do meu mainVBox
			mainVBox.getChildren().add(mainMenu); // adiciona os filhos do mainMenu
			mainVBox.getChildren().addAll(newVBox.getChildren()); // adiciona os filhos do vbox
			
			T Controller = loader.getController();											//para ativar a função que é passada no consumer
			initializingAction.accept(Controller);  										//para executar a função lambda
		
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}
