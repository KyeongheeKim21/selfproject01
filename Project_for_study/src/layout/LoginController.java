package layout;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	@FXML private Label x;
	@FXML private Label y;
	@FXML private TextField id;
	@FXML private TextField pw;
	@FXML private Button loginBtn;
	@FXML private ListView<String> items;
	@FXML private Label detail;
	public String identity;
	public String itemName;
	@FXML private ListView<String> order;
	ObservableList item;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		item = FXCollections.observableArrayList();
		order.setItems(FXCollections.observableArrayList());
		items.getItems().addAll(item);
		
		items.setOnMouseClicked((MouseEvent)->{
			String it = items.getSelectionModel().getSelectedItem();
			detail.setText(it);
			itemName = it;
		});
	}
	public Stage primaryStage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public void handleLoginAction(ActionEvent event) {
		//System.out.println("id: "+ id.getText() +" pw: "+  pw.getText());
		x.setText("Welcome "+id.getText());
		x.setPrefWidth(180);
		id.setVisible(false);
		y.setVisible(false);
		pw.setVisible(false);
		loginBtn.setVisible(false);
		
	}
	public void AClick(ActionEvent event) {
		items.getItems().clear();
		item.clear();
		for(int i = 65; i < 72;i++) {
			String x = (char)i+"";
			item.add(x);
		}
		items.getItems().addAll(item);
	}
	public void HClick(ActionEvent event) {
		items.getItems().clear();
		item.clear();
		for(int i = 72; i < 79;i++) {
			String x = (char)i+"";
			item.add(x);
		}
		items.getItems().addAll(item);
	}
	public void OClick(ActionEvent event) {
		items.getItems().clear();
		item.clear();
		for(int i = 79; i < 86;i++) {
			String x = (char)i+"";
			item.add(x);
		}
		items.getItems().addAll(item);
	}
	public void VClick(ActionEvent event) {
		items.getItems().clear();
		item.clear();
		for(int i = 86; i < 91;i++) {
			String x = (char)i+"";
			item.add(x);
		}
		items.getItems().addAll(item);
	}
	public void basket(ActionEvent event) {
		//System.out.println(itemName);
		order.getItems().add(itemName);
	}
}
