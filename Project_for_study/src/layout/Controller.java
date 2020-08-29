package layout;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import application.CreateUser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller implements Initializable{
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
	ObservableList<String>  item = FXCollections.observableArrayList();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		order.setItems(FXCollections.observableArrayList());
		items.getItems().addAll(item);
		
		items.setOnMouseClicked((MouseEvent)->{
			String it = items.getSelectionModel().getSelectedItem();
			detail.setText(it);
			itemName = it;
		});
	}
	public Stage primaryStage;
	public Stage popUpStage = new Stage();
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
	public void clickedSignUpBtn(ActionEvent event) {
		//pop up
		try {
			Parent signin = FXMLLoader.load(getClass().getResource("SignUpPopUp.fxml"));
			
			popUpStage.setTitle("sign in here");
			popUpStage.setScene(new Scene(signin));
			popUpStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void handleSignUpAction(ActionEvent event) {
		CreateUser cu = new CreateUser(id.getText(),pw.getText());
		if(cu.getCondition() == 2) {
			//already exist code
			System.out.println("already exist. ("+id.getText()+" "+pw.getText()+")");
		}
		else if(cu.getCondition() != 0) {
			System.err.println("err code: "+cu.getCondition());
		}
	}
	public void Click(ActionEvent e) {

		Connection conn = null;
		Statement st = null;
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String user = "AZ_MANAGER"; 
		String password = "123400";
		
		String[] s = e.getSource().toString().split("\'");
		String[] t = s[1].split(" ");
		int start = 65, end = 91;
		
		switch(t[0]) {
		case "A":
			start = 10065;
			end = 10072;
			break;
		case "H":
			start = 10072;
			end = 10079;
			break;
		case "O":
			start = 10079;
			end = 10086;
			break;
		case "V":
			start = 10086;
			end = 10091;
			break;
		}
		String query ="select * from AZ_MANAGER.items where iCode between \'"
				+Integer.toString(start) +"\' and \'"+Integer.toString(end)+"\'";
		//System.out.println(query);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			items.getItems().clear();
			item.clear();
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				String iname = rs.getString("name");
				//System.out.println(iname);
				item.add(iname);
			}
			items.getItems().addAll(item);
			
		}catch(Exception event) {
			event.printStackTrace();
		}finally{
			try {
				if(st != null) st.close();
				if(conn != null) conn.close();
			}catch(SQLException event) {
				event.printStackTrace();
			}
		}/**/
	}
	
	public void basket(ActionEvent event) {
		//System.out.println(itemName);
		order.getItems().add(itemName);
	}
}
