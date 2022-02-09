package org.OOP.TouchVendingMachine.Controller;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import org.OOP.TouchVendingMachine.Model.Drink;
import org.OOP.TouchVendingMachine.Model.DrinkCart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class TVMController implements Initializable {

	@FXML
	private Button button_addToCart;

	@FXML
	private Button button_delete;

	@FXML
	private Button button_DeleteAll;

	@FXML
	private Button button_pay;

	@FXML
	private ComboBox<String> comboBox_Type;
	ObservableList<String> typeList = FXCollections.observableArrayList("ALL DRINK", "PHIN COFFEE", "PHINDI",
			"ESPRESSO COFFEE", "TEA", "FREEZE", "OTHER DRINKS");

//	Image image = new Image(getClass().getResourceAsStream("../image/background.png"));
	@FXML
	private ImageView imageView;
//	imageView.

//	@FXML
//	private Label label_Cart;
//
//	@FXML
//	private Label label_Menu;
//
//	@FXML
//	private Label label_Size;
//
//	@FXML
//	private Label label_Type;

	@FXML
	private RadioButton radioButton_All;

	@FXML
	private RadioButton radioButton_L;

	@FXML
	private RadioButton radioButton_M;

	@FXML
	private RadioButton radioButton_S;

	@FXML
	private ToggleGroup rb_size;

	@FXML
	private ScrollBar scrollBar_1;

	@FXML
	private TableView<Drink> tableMenu;

	@FXML
	private TableColumn<Drink, String> colum_Name;

	@FXML
	private TableColumn<Drink, Integer> colum_Price;

	@FXML
	private TableColumn<Drink, Integer> colum_STT;

	@FXML
	private TableColumn<Drink, String> colum_Size;

	@FXML
	private TableView<DrinkCart> tableCart;

	@FXML
	private TableColumn<DrinkCart, Integer> colum_idCart;

	@FXML
	private TableColumn<DrinkCart, String> colum_nameCart;

	@FXML
	private TableColumn<DrinkCart, Integer> colum_priceCart;

	@FXML
	private TableColumn<DrinkCart, Integer> colum_quantilyCart;

	@FXML
	private TableColumn<DrinkCart, String> colum_sizeCart;

//	@FXML
//	private Line line;

	@FXML
	private Text textPay;

	@FXML
	private Text textTotal;

	private ObservableList<Drink> drinkList, choseDrinkType, choseDrinkSize;
	private ObservableList<DrinkCart> drinkCartList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		comboBox_Type.setItems(typeList);

		drinkList = FXCollections.observableArrayList(new Drink(1, "PHIN Sua Da", "S", 29000, 3, "PHIN COFFEE"),
				new Drink(2, "PHIN Sua Da", "M", 35000, 3, "PHIN COFFEE"),
				new Drink(3, "PHIN Sua Da", "L", 39000, 3, "PHIN COFFEE"),
				new Drink(4, "PHIN Den Da", "S", 29000, 100, "PHIN COFFEE"),
				new Drink(5, "PHIN Den Da", "M", 35000, 100, "PHIN COFFEE"),
				new Drink(6, "PHIN Den Da", "L", 39000, 100, "PHIN COFFEE"),
				new Drink(7, "PHINDI Kem Sua", "S", 39000, 100, "PHINDI"),
				new Drink(8, "PHINDI Kem Sua", "M", 45000, 100, "PHINDI"),
				new Drink(9, "PHINDI Kem Sua", "L", 49000, 100, "PHINDI"),
				new Drink(10, "PHINDI Hanh Nhan", "S", 39000, 100, "PHINDI"),
				new Drink(11, "PHINDI Hanh Nhan", "M", 45000, 100, "PHINDI"),
				new Drink(12, "PHINDI Hanh Nhan", "L", 49000, 100, "PHINDI"),
				new Drink(13, "PHINDI Choco", "S", 39000, 100, "PHINDI"),
				new Drink(14, "PHINDI Choco", "M", 45000, 100, "PHINDI"),
				new Drink(15, "PHINDI Choco", "L", 49000, 100, "PHINDI"),
				new Drink(16, "Latte", "S", 35000, 100, "ESPRESSO COFFEE"),
				new Drink(17, "Latte", "M", 39000, 100, "ESPRESSO COFFEE"),
				new Drink(18, "Latte", "L", 45000, 100, "ESPRESSO COFFEE"),
				new Drink(19, "Caramel Macchiato", "S", 35000, 100, "ESPRESSO COFFEE"),
				new Drink(20, "Caramel Macchiato", "M", 39000, 100, "ESPRESSO COFFEE"),
				new Drink(21, "Caramel Macchiato", "L", 45000, 100, "ESPRESSO COFFEE"),
				new Drink(22, "Americano", "S", 35000, 100, "ESPRESSO COFFEE"),
				new Drink(23, "Americano", "M", 39000, 100, "ESPRESSO COFFEE"),
				new Drink(24, "Americano", "L", 45000, 100, "ESPRESSO COFFEE"),
				new Drink(25, "Tra Sen Vang", "S", 39000, 100, "TEA"),
				new Drink(26, "Tra Sen Vang", "M", 49000, 100, "TEA"),
				new Drink(27, "Tra Sen Vang", "L", 55000, 100, "TEA"),
				new Drink(28, "Tra Thach Dao", "S", 39000, 100, "TEA"),
				new Drink(29, "Tra Thach Dao", "M", 49000, 100, "TEA"),
				new Drink(30, "Tra Thach Dao", "L", 55000, 100, "TEA"),
				new Drink(31, "Freeze Tra Xanh", "S", 49000, 100, "FREEZE"),
				new Drink(32, "Freeze Tra Xanh", "M", 59000, 100, "FREEZE"),
				new Drink(33, "Freeze Tra Xanh", "L", 65000, 100, "FREEZE"),
				new Drink(34, "Classic Phin Freeze", "S", 49000, 100, "FREEZE"),
				new Drink(35, "Classic Phin Freeze", "M", 59000, 100, "FREEZE"),
				new Drink(36, "Classic Phin Freeze", "L", 65000, 100, "FREEZE"),
				new Drink(37, "Dark Chocolate", "S", 55000, 100, "OTHER DRINKS"),
				new Drink(38, "Dark Chocolate", "M", 59000, 100, "OTHER DRINKS"),
				new Drink(39, "Dark Chocolate", "L", 65000, 100, "OTHER DRINKS"),
				new Drink(40, "Chanh Da Xay/ Da Vien", "S", 39000, 100, "OTHER DRINKS"),
				new Drink(41, "Chanh Da Xay/ Da Vien", "M", 49000, 100, "OTHER DRINKS"),
				new Drink(42, "Chanh Da Xay/ Da Vien", "L", 55000, 100, "OTHER DRINKS"));

		colum_STT.setCellValueFactory(new PropertyValueFactory<Drink, Integer>("id"));
		colum_Name.setCellValueFactory(new PropertyValueFactory<Drink, String>("name"));
		colum_Price.setCellValueFactory(new PropertyValueFactory<Drink, Integer>("price"));
		colum_Size.setCellValueFactory(new PropertyValueFactory<Drink, String>("size"));
		tableMenu.setItems(drinkList);

		drinkCartList = FXCollections.observableArrayList();
		colum_idCart.setCellValueFactory(new PropertyValueFactory<DrinkCart, Integer>("id"));
		colum_nameCart.setCellValueFactory(new PropertyValueFactory<DrinkCart, String>("name"));
		colum_priceCart.setCellValueFactory(new PropertyValueFactory<DrinkCart, Integer>("price"));
		colum_sizeCart.setCellValueFactory(new PropertyValueFactory<DrinkCart, String>("size"));
		colum_quantilyCart.setCellValueFactory(new PropertyValueFactory<DrinkCart, Integer>("quantily"));
		tableCart.setItems(drinkCartList);
	}

	@FXML
	void TypeCliked(ActionEvent event) {
		String selected = comboBox_Type.getValue();
		choseDrinkType = FXCollections.observableArrayList();
		for (Drink drink : drinkList) {
			if (selected.equals("ALL DRINK"))
				choseDrinkType.add(drink);
			else if (drink.getType().equals(selected)) {
				choseDrinkType.add(drink);
			}
		}
		tableMenu.setItems(choseDrinkType);
		rbClicked(event);
	}

	@FXML
	void rbClicked(ActionEvent event) {
		try {
			String selected = null;
			if (radioButton_All.isSelected())
				selected = "ALL";
			else if (radioButton_S.isSelected())
				selected = "S";
			else if (radioButton_M.isSelected())
				selected = "M";
			else if (radioButton_L.isSelected())
				selected = "L";
			choseDrinkSize = FXCollections.observableArrayList();
			for (Drink drink : choseDrinkType) {
				if (selected.equals("ALL"))
					choseDrinkSize.add(drink);
				else if (selected.equals(drink.getSize()))
					choseDrinkSize.add(drink);
			}
			tableMenu.setItems(choseDrinkSize);
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("Input Status:");
			alert.setContentText("You must chose Size and Type!!!");
			alert.showAndWait();
		}
	}

	@FXML
	void addClicked(ActionEvent event) {
		try {
			int selected = tableMenu.getSelectionModel().selectedItemProperty().getValue().getId();
			for (Drink drink : drinkList) {
				if (selected == drink.getId()) {
					int k = isValidCart(selected);
					if (k != -1) {
						int q = drinkCartList.get(k).getQuantily();
						if (q < drink.getQuantily() && drink.getQuantily() > 0) {
							drinkCartList.get(k).setQuantily(q + 1);
						} else {
							Alert alert = new Alert(AlertType.ERROR);
							alert.setTitle("ERROR");
							alert.setHeaderText("Input Status:");
							alert.setContentText("Can't add to cart because out of stock!!!");
							alert.showAndWait();
						}
						// System.out.println(drink.getName()+" "+drink.getQuantily());
					} else {
						if (drink.getQuantily() == 0) {
							Alert alert = new Alert(AlertType.ERROR);
							alert.setTitle("ERROR");
							alert.setHeaderText("Input Status:");
							alert.setContentText("Can't add to cart because out of stock!!!");
							alert.showAndWait();
						} else {
							drinkCartList.add(new DrinkCart(drink.getId(), drink.getName(), drink.getSize(),
									drink.getPrice(), 1, drink.getType()));
						}
					}
					// System.out.println(drink.getQuantily());
					break;
				}
			}
			tableCart.refresh();
			pay();

		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("Input Status:");
			alert.setContentText("You haven't chosen!!!");
			alert.showAndWait();
		}
	}

	@FXML
	void deleteClicked(ActionEvent event) {
		try {
			int selected = tableCart.getSelectionModel().selectedItemProperty().getValue().getId();
			for (DrinkCart drink : drinkCartList) {
				if (selected == drink.getId()) {
					drinkCartList.remove(drink);
					break;
				}
			}
			tableCart.refresh();
			pay();
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("Input Status:");
			alert.setContentText("You haven't chosen!!!");
			alert.showAndWait();
		}
	}

	@FXML
	void deleteAll(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("CART");
		alert.setHeaderText("Are you sure want to delete your cart?");
		Optional<ButtonType> option = alert.showAndWait();

		if (option.get() == ButtonType.OK) {
			clear();
		}
	}

	@FXML
	void payClicked(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("PAY");
		alert.setHeaderText("Are you sure want to pay for your order?");
		// alert.setContentText("");

		Optional<ButtonType> option = alert.showAndWait();

		if (option.get() == ButtonType.OK) {
			for (DrinkCart drinkCart : drinkCartList) {
				for (Drink drink : drinkList) {
					if (drinkCart.getId() == drink.getId()) {
						int oldQuantity = drink.getQuantily();
						drink.setQuantily(oldQuantity - drinkCart.getQuantily());
						break;
					}
				}
			}
			clear();
		}
	}

	int isValidCart(int id) {
		for (int i = 0; i < drinkCartList.size(); i++) {
			if (drinkCartList.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	void pay() {
		int money = 0;
		int total = 0;
		for (DrinkCart drink : drinkCartList) {
			money += drink.amount();
			total += drink.getQuantily();
		}
		textPay.setText("PAY: " + money + " VND");
		textTotal.setText("" + total);
	}

	void clear() {
		while (!drinkCartList.isEmpty()) {
			drinkCartList.remove(0);
		}
		textPay.setText("PAY: 0 VND");
		textTotal.setText("0");
	}

}
