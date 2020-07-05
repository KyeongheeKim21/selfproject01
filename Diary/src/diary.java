import javafx.stage.Stage;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class diary extends javafx.application.Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		basic(primaryStage);
		primaryStage.setTitle("Daily Diary");
		primaryStage.show();
	}
	
	public void basic(Stage primaryStage) {
		Label title;
		Button viewBtn, writeBtn;
		
		BorderPane root = new BorderPane();
		root.setPrefSize(600, 780);
		root.setPadding(new Insets(20));
		root.setStyle("-fx-background-image: url(\"watercolor.png\");");
		
		VBox fstLayout = new VBox();
		fstLayout.setPrefSize(300, 100);
		fstLayout.setAlignment(Pos.CENTER);
		fstLayout.setPadding(new Insets(80,0,0,0));
		
		title = new Label();
		title.setText("감정일기");
		title.setFont(new Font(60));
		title.setTextFill(Color.web("#66CC00"));
		
		viewBtn = new Button("보러가기");
		viewBtn.setFont(new Font(30));
		viewBtn.setTextFill(Color.web("#66CC00"));
		viewBtn.setPrefSize(270, 450);
		viewBtn.setOnAction(e->{			
			viewVer(primaryStage);
		});
		viewBtn.setStyle("-fx-background-color: transparent;");
		
		writeBtn = new Button("쓰러가기");
		writeBtn.setFont(new Font(30));
		writeBtn.setTextFill(Color.web("#66CC00"));
		writeBtn.setPrefSize(270, 450);
		writeBtn.setOnAction(e->{
			writeVer(primaryStage);
		});
		writeBtn.setStyle("-fx-background-color: transparent;");
		
		fstLayout.getChildren().add(title);
		
		root.setTop(fstLayout);
		root.setLeft(viewBtn);
		root.setRight(writeBtn);
		
		primaryStage.setScene(new Scene(root));
	}
	public void viewVer(Stage primaryStage){
		BorderPane viewer = new BorderPane();
		viewer.setPrefSize(600, 780);
		viewer.setPadding(new Insets(20));
		viewer.setStyle("-fx-background-image: url(\"watercolor.png\");");
		
		BorderPane top = new BorderPane();
		top.setPrefSize(300, 40);
		Button back = new Button("<-");
		back.setFont(new Font(20));
		back.setTextFill(Color.web("#66CC00"));
		back.setOnAction(e->{///작성 완료
			basic(primaryStage);
		});
		back.setPrefSize(60, 30);
		top.setLeft(back);
		
		FlowPane list = new FlowPane();
		try {
			list = showFiles(primaryStage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		viewer.setTop(top);
		viewer.setCenter(list);
		primaryStage.setScene(new Scene(viewer));
	}
	public FlowPane showFiles(Stage primaryStage) throws Exception{
		File[] fis = new File("C:/Users/geni/Desktop/test").listFiles(); 
		FlowPane list = new FlowPane();
		list.autosize();//"yyyyMMddHHmm"
		list.setHgap(30);
		list.setVgap(15);
		if(!fis.equals(null)) {
			for(File f: fis) {
				Button b = new Button();
				String s = f.getName();
				b.setText(s.substring(0,4)+"년 "+s.substring(4,6)+"월 "+s.substring(6,8)+"일\n"
						+s.substring(8,10)+" : "+s.substring(10,12));
				b.setPrefSize(150, 100);
				b.setOnAction(e->{
					try {
						dairyContent(primaryStage, f);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
				list.getChildren().add(b);
			}
		}
		return list;
	}
	public void dairyContent(Stage primaryStage, File f) throws Exception{
		VBox b = new VBox();
		b.setPrefSize(600, 780);
		b.setPadding(new Insets(30,30,20,30));
		
		BorderPane top = new BorderPane();
		top.setPrefSize(500, 40);
		top.setPadding(new Insets(10,0,20,0));
		Button back = new Button("<-");
		back.setFont(new Font(20));
		back.setTextFill(Color.web("#66CC00"));
		back.setOnAction(e->{///작성 완료
			basic(primaryStage);
		});
		back.setPrefSize(60, 30);
		top.setLeft(back);
		
		TextArea name = new TextArea();
		name.setPrefSize(80, 150);
		String nameFormat = f.getName();
		name.setText(nameFormat.substring(0,4)+"년 "+nameFormat.substring(4,6)+"월 "
				+nameFormat.substring(6,8)+"일 "+nameFormat.substring(8,10)
				+"시 "+nameFormat.substring(10,12)+"분 일기");
		top.setCenter(name);
		name.setFont(new Font(20));
		
		TextArea dairy = new TextArea();
		b.getChildren().add(top);
		
		FileReader fr = new FileReader(f);
		int readcharCount ;
		char[] cbuf = new char[100];
		boolean ans = false;
		while((readcharCount = fr.read(cbuf)) != -1){
			String s = "";
			for(int i = 0; i< readcharCount; i++) {
				if(cbuf[i] == '#') {
					if(s != "") {
						dairy.appendText(s);
						s = "";
					}
					ans = false;
				}
				if(cbuf[i] == '?') {
					ans = true;
					continue;
				}
				if(ans == true) s += cbuf[i];
			}
		}
		
		b.getChildren().add(dairy);
		
		fr.close();
		primaryStage.setScene(new Scene(b));
	}
	public void writeVer(Stage primaryStage) {
		TextField[] tf = new TextField[4];
		String[] msg = {"무슨 일이 있었나요?", "어떤 생각이 들었나요?", "무슨 감정이 들었죠?", "그래서 어떻게 행동했나요?"};
		
		BorderPane writer = new BorderPane();
		writer.setPrefSize(600, 780);
		writer.setPadding(new Insets(20));
		writer.setStyle("-fx-background-image: url(\"watercolor.png\");");
		
		BorderPane top = new BorderPane();
		top.setPrefSize(300, 40);
		Button back = new Button("<-");
		back.setFont(new Font(20));
		back.setTextFill(Color.web("#66CC00"));
		back.setOnAction(e->{///작성 완료
			basic(primaryStage);
		});
		back.setPrefSize(60, 30);
		Label midTitle = new Label();
		midTitle.setText("오늘 하루 어땠나요?");
		midTitle.setFont(new Font(23));
		midTitle.setTextFill(Color.web("#66CC00"));
		top.setLeft(back);
		top.setCenter(midTitle);
		
		HBox container = new HBox();
		container.setPrefSize(500, 500);
		
		VBox fact = new VBox();
		fact.setPrefSize(230, 500);
		tf[0] = QnA(fact,msg[0],400);
		
		
		VBox inYours = new VBox();
		inYours.setPrefSize(230, 500);
		
		tf[1] = QnA(inYours,msg[1],100);
		tf[2] = QnA(inYours,msg[2],100);
		tf[3] = QnA(inYours,msg[3],100);
		
		fact.setPadding(new Insets(5));
		inYours.setPadding(new Insets(5));
		container.getChildren().add(fact);
		container.getChildren().add(inYours);
		writer.setCenter(container);
		
		Label storeMsg = new Label();
		BorderPane buttom = new BorderPane();
		buttom.setPrefSize(500, 40);
		Button btn = new Button("작성");
		btn.setOnAction(e->{///작성 완료
			try {
				write(msg, tf);
				storeMsg.setText("저장되었습니다");
				for(TextField t: tf) t.deleteText(0, t.getText().length());
			}catch(Exception ex){
				
			} 
		});
		btn.setPrefSize(60, 30);
		buttom.setRight(btn);
		
		buttom.setCenter(storeMsg);
		
		writer.setTop(top);
		writer.setBottom(buttom);
		primaryStage.setScene(new Scene(writer));
	}
	public TextField QnA(VBox inYours,String s, int h) {
		Label quest02 = new Label();
		quest02.setText(s);
		quest02.setPrefSize(230, 50);
		quest02.setFont(new Font(15));
		inYours.getChildren().add(quest02);
		
		TextField txt = new TextField();
		txt.setPrefSize(100, h);
		inYours.getChildren().add(txt);
		return txt;
	}
	
	public void write(String[] msg, TextField[] tf) throws Exception {
		Date today = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		FileOutputStream fos = 
				new FileOutputStream("C:/Users/geni/Desktop/test/" 
						+ dateformat.format(today) +".txt");
		Writer wr = new OutputStreamWriter(fos);
		for(int i = 0; i < 4; i++) {
			wr.write('#'+msg[i]+'\n');
			wr.write(tf[i].getText()+'\n');
		}
		wr.flush();
		wr.close();
	}


	public static void main(String[] args) {
		launch(args);
	}

}
